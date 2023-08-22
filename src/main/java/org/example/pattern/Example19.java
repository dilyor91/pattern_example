package org.example.pattern;

public class Example19 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int space = 0; space < 9-row; space++) {
                System.out.print(" "+" ");
            }
            for (int star = 0; star <= row; star++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
