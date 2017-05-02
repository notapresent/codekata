package com.mycompany.codekata.kata02;

/**
 * Kata 2 from http://codekata.com/,
 *
 */
public class Day2 {
    /**
     * Binary search for value in array. Recursive version.
     *
     * @param val value to search for
     * @param arr array to search in
     * @return position of val in arr or -1 if not found
     */
    public static int chop(int val, int[] arr, int start, int length) {
        int c;

        if (length == 1) {
            return arr[start] == val ? start : -1;
        }

        c = length / 2;

        if (arr[start + c] > val) {
            return chop(val, arr, start, c);
        } else {
            return chop(val, arr, start + c, c);
        }
    }

    public static int chop(int val, int[] arr) {
        return chop(val, arr, 0, arr.length);

    }
}
