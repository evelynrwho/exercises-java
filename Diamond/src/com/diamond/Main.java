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

            System.out.println();
        }

        for (int l = (n - 1); l > 0; l--) {
            for (int k = 0; k <= n - l; k++) {
                System.out.print(" ");
            }

            for (int m = 0; m < (l * 2) - 1; m++) {
                System.out.print('*');
            }

            System.out.println();
        }

    }
}
