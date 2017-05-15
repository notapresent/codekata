package com.mycompany.codekata.kata02;

import java.util.Arrays;

public class Day4 {
    public static int chop(int val, int[] arr) {
        int pos = Arrays.binarySearch(arr, val);
        return pos > -1 ? pos : -1;
    }
}
