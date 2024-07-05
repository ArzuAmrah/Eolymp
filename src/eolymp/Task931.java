package eolymp;

import java.util.Scanner;

public class Task931 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        long productOfDigits = 1;
        long sumOfDigits = 0;

        long temp = n;
        while(temp > 0){
            int digit = (int) (temp % 10);
            sumOfDigits += digit;
            productOfDigits *= digit;
            temp /= 10;
        }

        double result = (double) productOfDigits / sumOfDigits;
        System.out.printf("%.3f%n", result);
    }
}
