package org.example.pattern;

public class Example9 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print((char)(74-row)+" ");
            }
            System.out.println();
        }
    }
}
