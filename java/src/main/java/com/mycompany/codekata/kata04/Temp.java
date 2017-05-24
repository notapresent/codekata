package com.mycompany.codekata.kata04;


public class Temp {
    private String filename;
    public Temp(String filename) {
        this.filename = filename;
    }

    public static void main(String[] args) {
        String filename;
        if (args.length > 0) {
            filename = args[0];
        } else {
            filename = "weather.dat";
        }

        Temp minSpreadCalculator = new Temp(filename);
        System.out.println(minSpreadCalculator.result());
    }

    int result() {
        return -1;
    }
}
