package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class binaryCount {

    public static void main (String[] args) {

        System.out.print(decimalToBinary(678909));
        ArrayList<Integer> bin = decimalToBinary(678909);
        int numcount = countZeros(bin);
        System.out.print(numcount);
    }

    public static ArrayList<Integer> decimalToBinary(int decimal) {
        ArrayList<Integer> binary = new ArrayList<>();

        int key = 0;
        while (decimal > 0) {
            int value = decimal % 2;
            binary.add(key++, value);

            decimal = decimal / 2;
        }
        return binary;
    }

    public static int countZeros(ArrayList<Integer> num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int n: num) {
            while (n =)

        }
        return count;
    }
}

