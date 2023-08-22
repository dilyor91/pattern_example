package org.example.pattern;

public class Example20 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int spaces = 0; spaces < 9-row; spaces++) {
                System.out.print(" "+" ");
            }
            for (int num = 0; num <= row ; num++) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
