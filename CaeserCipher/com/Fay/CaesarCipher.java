// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.Fay;

public class CaesarCipher {
    public String Encrypt(String plainText, int key) {
        plainText = plainText.toUpperCase();
        String cipherText = "";

        for (int i = 0; i < plainText.length(); ++i) {
            char plainChar = plainText.charAt(i);
            int plainCharIndex = Alphabets.UPPER.indexOf(plainChar);
            if (plainCharIndex == -1)
                continue;
            int cipherIndex = Math.floorMod(plainCharIndex + key, Alphabets.UPPER.length());
            cipherText += Alphabets.UPPER.charAt(cipherIndex);
        }

        return cipherText;
    }

    public String Decrypt(String cipherText, int key) {
        cipherText = cipherText.toUpperCase();
        String plainText = "";

        for (int i = 0; i < cipherText.length(); ++i) {
            char cipherChar = cipherText.charAt(i);
            int cipherCharIndex = Alphabets.UPPER.indexOf(cipherChar);
            int plainIndex = Math.floorMod(cipherCharIndex - key, Alphabets.UPPER.length());
            plainText += Alphabets.UPPER.charAt(plainIndex);
        }

        return plainText;
    }
}
