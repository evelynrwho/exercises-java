package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    var in = new Scanner(System.in);

	    System.out.print("Enter an integer number: ");
	    int n = in.nextInt();


        var result = generate(n).stream()
                .map(m -> m.toString())
                .collect(Collectors.joining(", "));

        System.out.println(result);

    }

    static ArrayList<Integer> generate(int number) {
        var list = new ArrayList<Integer>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                list.add(i);
                number = number / i;
            }
        }

        return list;
    }
}
