package com.Fay;

public class Program {
    public static void main(String[] var0) {
        String hello = "Life south of the fence, just a few feet away, is rather different." + //
                " While the residents of Nogales, Sonora, live in a relatively prosperous" + //
                " part of Mexico, the income of the average household there is about" + //
                " one-third that in Nogales, Arizona.";
        int key = 7;
        var caesar = new CaesarCipher();
        String cipher = caesar.Encrypt(hello, key);
        Console.writeLine("Cipher text:");
        Console.writeLine(cipher);
        // String plain = caesar.Decrypt(cipher, key);
        // Console.writeLine(plain);

        Console.writeLine("Cracking using frequency analysis:");
        var cracker = new CaesarCracker();
        cracker.frequencyAnalyzerCrack(cipher);

        // var analyzer = new FrequencyAnalyzer();
        // analyzer.showFrequencies(hello);
    }
}
