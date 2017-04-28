package com.mycompany.codekata.kata02;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

       
/**
 * Unit test for simple App.
 */
public class Day1Test 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Day1Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Day1Test.class );
    }

    /**
     * Returns -1 if value not found in array
     */
    public void testChopNotFound()
    {
        assertEquals(-1, Day1.chop(0, new int[] {}));
        assertEquals(-1, Day1.chop(0, new int[] {1, 2, 3}));
    }
    
    public void testChopFindsValInTheMiddle() {
        assertEquals(0, Day1.chop(0, new int[] {0}));
        assertEquals(1, Day1.chop(4, new int[] {3, 4, 5}));
        assertEquals(1, Day1.chop(4, new int[] {3, 4, 5, 6}));
        assertEquals(2, Day1.chop(5, new int[] {3, 4, 5, 6}));
    }
    
    public void testChopFindsValAtBoundaries() {
        assertEquals(0, Day1.chop(3, new int[] {3, 4, 5}));
        assertEquals(2, Day1.chop(5, new int[] {3, 4, 5})); 
        assertEquals(0, Day1.chop(3, new int[] {3, 4, 5, 6}));
        assertEquals(3, Day1.chop(6, new int[] {3, 4, 5, 6}));
    }
    
    /**
     * Original tests from kata author
     */
    public void testChopAll()
    {
        assertEquals(-1, Day1.chop(3, new int[] {}));
        assertEquals(-1, Day1.chop(3, new int[] {1}));
        assertEquals(0, Day1.chop(1, new int[] {1}));

        assertEquals(0, Day1.chop(1, new int[] {1, 3, 5}));
        assertEquals(1, Day1.chop(3, new int[] {1, 3, 5}));
        assertEquals(2, Day1.chop(5, new int[] {1, 3, 5}));
        assertEquals(-1, Day1.chop(0, new int[] {1, 3, 5}));
        assertEquals(-1, Day1.chop(2, new int[] {1, 3, 5}));
        assertEquals(-1, Day1.chop(4, new int[] {1, 3, 5}));
        assertEquals(-1, Day1.chop(6, new int[] {1, 3, 5}));

        assertEquals(0, Day1.chop(1, new int[] {1, 3, 5, 7}));
        assertEquals(1, Day1.chop(3, new int[] {1, 3, 5, 7}));
        assertEquals(2, Day1.chop(5, new int[] {1, 3, 5, 7}));
        assertEquals(3, Day1.chop(7, new int[] {1, 3, 5, 7}));
        assertEquals(-1, Day1.chop(0, new int[] {1, 3, 5, 7}));
        assertEquals(-1, Day1.chop(2, new int[] {1, 3, 5, 7}));
        assertEquals(-1, Day1.chop(4, new int[] {1, 3, 5, 7}));
        assertEquals(-1, Day1.chop(6, new int[] {1, 3, 5, 7}));
        assertEquals(-1, Day1.chop(8, new int[] {1, 3, 5, 7}));    
    }
}
