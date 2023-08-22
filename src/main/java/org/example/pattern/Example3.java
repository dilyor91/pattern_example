package org.example.pattern;

public class Example3 {
    public static void main(String[] args) {
        for (int row = 0; row<10; row++) {
            for (int num = 0; num <10; num++) {
                System.out.print((9-num)+" ");
            }
            System.out.println();
        }
    }
}
