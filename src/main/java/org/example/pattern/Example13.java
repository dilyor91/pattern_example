package org.example.pattern;

public class Example13 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int num = 0; num <= row; num++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
