package org.example.pattern;

public class Example48 {
    public static void main(String[] args) {
        for (int row = 0; row < 19; row++) {
            if(row<10) {
                for (int space = 0; space < 9-row; space++) {
                    System.out.print(" "+" ");
                }
                for (int star = 0; star <=row; star++) {
                    System.out.print("*"+" ");
                }
                System.out.println();
            } else {
                for (int space = 0; space <= row-10; space++) {
                    System.out.print(" "+" ");
                }
                for (int star = 0; star < 19-row; star++) {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }

        }
    }
}
