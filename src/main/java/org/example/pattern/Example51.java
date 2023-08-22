package org.example.pattern;

public class Example51 {
    public static void main(String[] args) {
        for (int rows = 0; rows < 5; rows++) {
            for (int space = 0; space < 4-rows; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2*rows+1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
