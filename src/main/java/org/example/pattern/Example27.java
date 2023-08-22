package org.example.pattern;

public class Example27 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int space = 0; space < 9-row; space++) {
                System.out.print(" "+" ");
            }
            for (int col = 0; col <= row ; col++) {
                System.out.print((char)(74-row)+" ");
            }
            System.out.println();
        }
    }
}
