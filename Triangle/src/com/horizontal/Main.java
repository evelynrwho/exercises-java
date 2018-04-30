package com.horizontal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print('*');
        }
    }
}
