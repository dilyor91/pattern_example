package org.example.pattern;

public class Example57 {
    public static void main(String[] args) {
        for (int rows = 0; rows < 9; rows++) {
            if(rows<5) {
                for (int space = 0; space < 4 - rows; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star < 2*rows+1; star++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int space = 0; space <= rows-5; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star < 17-2*rows; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
