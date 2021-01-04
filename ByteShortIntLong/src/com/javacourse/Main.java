package com.javacourse;

public class Main {

    public static void main(String[] args) {

//        INTEGER
//        int myMaxIntTest = 2_147_483_647;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("BUSTED Maximum Value = " + (myMaxIntValue + 1));
        System.out.println("BUSTED Minimum Value = " + (myMinIntValue - 1));

//        BYTE & SHORT
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

//        LONG
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

//        long bigLongLiteralValue = 2_147_483_647L;
        long bigLongLiteralValue = 2_147_483_647L;
        System.out.println(bigLongLiteralValue);

//        ARITHMETIC
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short)(myMinShortValue / 2);

    }
}
