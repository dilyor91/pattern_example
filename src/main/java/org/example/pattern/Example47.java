package org.example.pattern;

public class Example47 {
    public static void main(String[] args) {
        for (int row = 0; row < 19; row++) {
            if(row<10) {
                for (int star = 0; star <= row; star++) {
                    System.out.print("*"+" ");
                }
            } else {
                for (int star = 0; star < 19-row; star++) {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();

        }
    }
}
