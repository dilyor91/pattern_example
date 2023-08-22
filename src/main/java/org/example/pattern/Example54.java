package org.example.pattern;

public class Example54 {
    public static void main(String[] args) {
        for (int rows = 0; rows < 5; rows++) {
            for (int space = 0; space < rows; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 9-2*rows; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
