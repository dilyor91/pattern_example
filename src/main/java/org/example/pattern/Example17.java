package org.example.pattern;

public class Example17 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print((char)(65+row)+" ");
            }
            System.out.println();
        }
    }
}
