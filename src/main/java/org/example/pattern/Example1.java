package org.example.pattern;

public class Example1 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for(int star = 0; star < 10; star++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
