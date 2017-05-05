package com.mycompany.codekata.kata02;

/**
 * Kata 2 from http://codekata.com/, 
 *
 */
public class Day1 {
  /**
   * Binary search for value in array. This version uses loop.
   * 
   * @param val value to search for
   * @param arr array to search in
   * @return position of val in arr or -1 if not found
   */
  public static int chop(int val, int[] arr) {
    int start = 0;
    int length = arr.length;
    int cut;

    while (length > 1) {
      cut = length / 2;

      if (arr[start + cut] > val) {
        length = cut;
      } else if (arr[start + cut] < val) {
        start = cut;
        length = length - cut;
      } else {    // arr[c] == val
        return start + cut;
      }
    }

    if (length == 1) {
      return arr[start] == val ? 0 : -1;
    } 

    return -1;
  }
}
