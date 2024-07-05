package eolymp;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int number = sc.nextInt();

        int firstDigit = number / 100;
        int secondDigit = number % 10;

        if (firstDigit > secondDigit){
            System.out.println(firstDigit);
        } else if (secondDigit > firstDigit) {
            System.out.println(secondDigit);
        }else{
            System.out.println("=");
        }
    }
}
