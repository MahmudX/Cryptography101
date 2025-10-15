package com.Fay;

import java.util.Map;

public class CaesarCracker {
    public void bruteForeceCrack(String cipherText) {
        for (var key = 0; key < Alphabets.UPPER.length(); ++key) {
            var caesar = new CaesarCipher();
            String plainString = caesar.Decrypt(cipherText, key);
            Console.writeLine(plainString);
        }
    }

    public void frequencyAnalyzerCrack(String text) {
        var analyzer = new FrequencyAnalyzer();
        var frequencies = analyzer.run(text);
        Map.Entry<Character, Integer> maxEntry = null;
        for (var entry : frequencies.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
                maxEntry = entry;
        }

        var approximatedKey = Alphabets.UPPER.indexOf(maxEntry.getKey()) - Alphabets.UPPER.indexOf(' ');

        Console.writeLine("Decrypting using approximate key %s", approximatedKey);
        var caeser = new CaesarCipher();
        var decryptedMessage = caeser.Decrypt(text, approximatedKey);
        Console.writeLine(decryptedMessage);
    }
}
