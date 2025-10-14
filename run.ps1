# ---------- CONFIG ----------
$BuildDir = "build"
$JarName = "App.jar"
# -----------------------------

# 1️⃣ Clean build directory
if (Test-Path $BuildDir) { Remove-Item -Recurse -Force $BuildDir }
New-Item -ItemType Directory -Path $BuildDir | Out-Null

# 2️⃣ Compile all Java files recursively into build directory
$JavaFiles = Get-ChildItem -Recurse -Filter "*.java" | ForEach-Object { $_.FullName }
if ($JavaFiles.Count -eq 0) {
    Write-Error "No Java files found in project!"
    exit 1
}
javac -d $BuildDir $JavaFiles

# 3️⃣ Find class containing main method
$MainClass = $null
foreach ($file in Get-ChildItem -Recurse -Filter "*.java") {
    $content = Get-Content $file.FullName
    if ($content -match "static\s+void\s+main\s*\(\s*String\s*\[\]\s*\w*\)") {
        # Convert file path to full package name
        $relativePath = $file.FullName.Substring((Get-Location).Path.Length + 1)
        $MainClass = ($relativePath -replace "\\", ".") -replace ".java$", ""
        break
    }
}

if (-not $MainClass) {
    Write-Error "No class with static main(String[] args) found!"
    exit 1
}

# 4️⃣ Generate manifest file
$ManifestFile = "manifest.txt"
"Main-Class: $MainClass`n" | Set-Content $ManifestFile

# 5️⃣ Build JAR with manifest
jar cfm $JarName $ManifestFile -C $BuildDir .

# 6️⃣ Run the JAR
java -jar $JarName
