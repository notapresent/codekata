package com.mycompany.codekata.kata02;

import junit.framework.Test;
import junit.framework.TestSuite;

public class Day3Test extends ChopTest {

  public static Test suite() {
    return new TestSuite(Day3Test.class);
  }

  public int chop(int val, int[] seq) {
    return Day3.chop(val, seq);
  }

}
