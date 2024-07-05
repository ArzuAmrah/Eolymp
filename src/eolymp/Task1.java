package eolymp;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //        Task1
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.printf("%d %d\n", number/10, number%10);
    }
}

