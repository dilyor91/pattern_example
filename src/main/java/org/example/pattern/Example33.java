package org.example.pattern;

public class Example33 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10-row; col++) {
                System.out.print((char)(65+col)+" ");
            }
            System.out.println();
        }
    }
}
