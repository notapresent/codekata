package com.mycompany.codekata.kata02;

/**
 * Kata 2 from http://codekata.com/, 
 *
 */
public class Day1 {
  /**
   * Binary search for value in array. 
   * 
   * @param val value to search for
   * @param arr array to search in
   * @return position of val in arr or -1 if not found
   */
  public static int chop(int val, int[] arr) {
    int start = 0;
    int length = arr.length;
    int c;

    while (length > 1) {
      c = length / 2;

      if (arr[start + c] > val) {
        length = c;
      } else if (arr[start + c] < val) {
        start = c;
        length = length - c;
      } else {    // arr[c] == val
        return start + c;
      }
    }

    if (length == 1) {
      return arr[start] == val ? 0 : -1;
    } 

    return -1;
  }
}
