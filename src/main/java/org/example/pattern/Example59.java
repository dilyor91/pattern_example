package org.example.pattern;

public class Example59 {
    public static void main(String[] args) {
        for (int rows = 0; rows < 10; rows++) {
            if(rows<5) {
                for (int star = 0; star < 10; star++) {
                    System.out.print("*"+" ");
                }
                System.out.println();
            } else {
                for (int space = 0; space < 6; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star < 4; star++) {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
    }
}
