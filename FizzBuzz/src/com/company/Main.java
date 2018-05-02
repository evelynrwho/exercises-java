package com.company;

import javax.annotation.processing.SupportedSourceVersion;

public class Main {

    public static void main(String[] args) {
	    int number = 100;
	    FizzBuzz(number);
    }

    static void FizzBuzz(int number) {
        int count = 1;

        while (count <= number) {

            if(count % (3 * 5) == 0)
                System.out.println("FizzBuzz");
            else if (count % 3 == 0)
                System.out.println("Fizz");
            else if(count % 5 == 0)
                System.out.println("Buzz");
            else System.out.println(count);

            count++;
        }

    }
}
