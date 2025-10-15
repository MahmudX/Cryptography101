package com.Fay;

public class Program {
    public static void main(String[] var0) {
        String hello = "Hello World";
        int key = 5;
        var caesar = new CaesarCipher();
        String cipher = caesar.Encrypt(hello, key);
        Console.writeLine(cipher);
        String plain = caesar.Decrypt(cipher, key);
        Console.writeLine(plain);

        Console.writeLine("Cracking using bruite force:");
        var cracker = new CaesarCracker();
        cracker.bruteForeceCrack(cipher);
    }
}
