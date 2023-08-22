package org.example.pattern;

public class Example40 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" "+" ");
            }
            for (int num = 0; num < 10-row; num++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
