package com.Fay;

public class CaesarCracker {
    public void bruteForeceCrack(String cipherText) {
        for (var key = 0; key < Alphabets.UPPER.length(); ++key) {
            var caesar = new CaesarCipher();
            String plainString = caesar.Decrypt(cipherText, key);
            Console.writeLine(plainString);
        }
    }
}
