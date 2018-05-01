package com.diamond;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }
}
