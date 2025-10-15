package com.Cryptography101.Utilities;

public class Console {
    public static <T> void writeLine(T object) {
        System.out.println(object);
    }

    public static void writeLine(String text, Object... argObjects) {
        System.out.format(text + "\n", argObjects);
    }
}
