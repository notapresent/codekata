package com.mycompany.codekata.kata02;

import junit.framework.Test;
import junit.framework.TestSuite;

public class Day4Test extends ChopTest {

  public static Test suite() {
    return new TestSuite(Day4Test.class);
  }

  public int chop(int val, int[] seq) {
    return Day4.chop(val, seq);
  }

}
