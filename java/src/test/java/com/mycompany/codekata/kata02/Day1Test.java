package com.mycompany.codekata.kata02;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Day1Test extends ChopTest
{
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Day1Test.class );
    }

    public int chop(int val, int[] seq) {
        return Day1.chop(val, seq);
    }
}
