# Clean and create build directory
if (Test-Path "build") { Remove-Item -Recurse -Force "build" }
New-Item -ItemType Directory -Path "build" -Force | Out-Null

# Compile all Java files to build directory
javac -d build com/Fay/*.java

# Build JAR from build directory
jar cfm CaeserCipher.jar manifest.txt -C build .

# Run JAR
java -jar CaeserCipher.jar
