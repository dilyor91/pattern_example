package org.example.pattern;

public class Example23 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int space = 0; space < 9-row ; space++) {
                System.out.print(" "+" ");
            }
            for (int num = 0; num <= row ; num++) {
                System.out.print(9-row+" ");
            }
            System.out.println();
        }
    }
}
