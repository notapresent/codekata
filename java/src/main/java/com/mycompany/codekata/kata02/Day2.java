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
    int cut;

    if (arr.length == 0)  {
      return -1;
    }

    if (length == 1) {
      return arr[start] == val ? start : -1;
    }

    cut = length / 2;

    if (arr[start + cut] <= val) {  // right
      return chop(val, arr, start + cut, length - cut);
    } else {                        // left
      return chop(val, arr, start, cut);
    }
  }

  public static int chop(int val, int[] arr) {
    return chop(val, arr, 0, arr.length);

  }
}
