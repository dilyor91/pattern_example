package org.example.pattern;

public class Example37 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" "+" ");
            }
            for (int star = 0; star < 10-row; star++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
