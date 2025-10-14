// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.Fay;

public class CaesarCipher {
    private String Alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String Encrypt(String plainText, int key) {
        plainText = plainText.toUpperCase();
        String cipherText = "";

        for (int i = 0; i < plainText.length(); ++i) {
            char plainChar = plainText.charAt(i);
            int painCharIndex = Alphabet.indexOf(plainChar);
            int cipherIndex = Math.floorMod(painCharIndex + key, Alphabet.length());
            cipherText += Alphabet.charAt(cipherIndex);
        }

        return cipherText;
    }

    public String Decrypt(String cipherText, int key) {
        cipherText = cipherText.toUpperCase();
        String plainText = "";

        for (int i = 0; i < cipherText.length(); ++i) {
            char cipherChar = cipherText.charAt(i);
            int cipherCharIndex = Alphabet.indexOf(cipherChar);
            int plainIndex = Math.floorMod(cipherCharIndex - key, Alphabet.length());
            plainText += Alphabet.charAt(plainIndex);
        }

        return plainText;
    }
}
