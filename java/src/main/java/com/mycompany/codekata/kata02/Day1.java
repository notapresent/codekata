package com.mycompany.codekata.kata02;

/**
 * Hello world!
 *
 */
public class Day1 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static int chop(int val, int[] arr) {
        int start = 0, length = arr.length, c = 0;
        
        while(length > 1){
            c = length / 2;
//            System.out.format("val=%d start=%d length=%d c=%d\n", val, start, length, c);

            if(arr[start + c] > val) {
                length = c;
            } else if (arr[start + c] < val) {
                start = c; length = length - c;
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
