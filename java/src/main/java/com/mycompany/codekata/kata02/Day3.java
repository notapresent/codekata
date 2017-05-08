package com.mycompany.codekata.kata02;

public class Day3 {

  public static class BinaryChopper {

    private final int[] arr;

    public BinaryChopper(int[] seq) {
      arr = seq;
    }

    public int index(int val) {
      return index(val, 0, arr.length);
    }

    public int index(int val, int start, int length) {
      int cut;

      if (arr.length == 0) {
        return -1;
      }

      if (length == 1) {
        return arr[start] == val ? start : -1;
      }

      cut = length / 2;

      if (arr[start + cut] <= val) {  // right
        return index(val,start + cut, length - cut);
      } else {                        // left
        return index(val, start, cut);
      }

    }
  }

  public static int chop(int val, int[] seq) {
    BinaryChopper chopper = new BinaryChopper(seq);
    return chopper.index(val);
  }
}
