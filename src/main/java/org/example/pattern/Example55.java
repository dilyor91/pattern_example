package org.example.pattern;

public class Example55 {
    public static void main(String[] args) {
        for (int rows = 0; rows < 19; rows++) {
            if(rows<10) {
                for (int space = 0; space < 9-rows ; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star <= rows; star++) {
                    System.out.print("*"+" ");
                }
                System.out.println();
            } else {
                for (int space = 0; space <= rows-10 ; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star < 19-rows; star++) {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
    }
}
