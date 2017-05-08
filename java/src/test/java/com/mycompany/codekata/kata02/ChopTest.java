package com.mycompany.codekata.kata02;

import junit.framework.TestCase;

abstract public class ChopTest extends TestCase {

  /**
   * Returns -1 if value not found in array
   */
  abstract int chop(int val, int[] seq);

  public void testNotFound() {
    assertEquals(-1, chop(0, new int[]{}));
    assertEquals(-1, chop(0, new int[]{1, 2, 3}));
  }

  public void testFindsValInTheMiddle() {
    assertEquals(0, chop(0, new int[]{0}));
    assertEquals(1, chop(4, new int[]{3, 4, 5}));
    assertEquals(1, chop(4, new int[]{3, 4, 5, 6}));
    assertEquals(2, chop(5, new int[]{3, 4, 5, 6}));
  }

  public void testFindsValAtBoundaries() {
    assertEquals(0, chop(3, new int[]{3, 4, 5}));
    assertEquals(2, chop(5, new int[]{3, 4, 5}));
    assertEquals(0, chop(3, new int[]{3, 4, 5, 6}));
    assertEquals(3, chop(6, new int[]{3, 4, 5, 6}));
  }

  /**
   * Original tests from kata author
   */
  public void testAll() {
    assertEquals(-1, chop(3, new int[]{}));
    assertEquals(-1, chop(3, new int[]{1}));
    assertEquals(0, chop(1, new int[]{1}));

    assertEquals(0, chop(1, new int[]{1, 3, 5}));
    assertEquals(1, chop(3, new int[]{1, 3, 5}));
    assertEquals(2, chop(5, new int[]{1, 3, 5}));
    assertEquals(-1, chop(0, new int[]{1, 3, 5}));
    assertEquals(-1, chop(2, new int[]{1, 3, 5}));
    assertEquals(-1, chop(4, new int[]{1, 3, 5}));
    assertEquals(-1, chop(6, new int[]{1, 3, 5}));

    assertEquals(0, chop(1, new int[]{1, 3, 5, 7}));
    assertEquals(1, chop(3, new int[]{1, 3, 5, 7}));
    assertEquals(2, chop(5, new int[]{1, 3, 5, 7}));
    assertEquals(3, chop(7, new int[]{1, 3, 5, 7}));
    assertEquals(-1, chop(0, new int[]{1, 3, 5, 7}));
    assertEquals(-1, chop(2, new int[]{1, 3, 5, 7}));
    assertEquals(-1, chop(4, new int[]{1, 3, 5, 7}));
    assertEquals(-1, chop(6, new int[]{1, 3, 5, 7}));
    assertEquals(-1, chop(8, new int[]{1, 3, 5, 7}));
  }
}
