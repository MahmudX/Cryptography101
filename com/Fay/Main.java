// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.Fay;

public class Main {
    public static void main(String[] var0) {
        String hello = "Hello World";
        int key = 5;
        var caesar = new CaesarCipher();
        String cipher = caesar.Encrypt(hello, key);
        System.out.println(cipher);
        String plain = caesar.Decrypt(cipher, key);
        System.out.println(plain);
    }
}
