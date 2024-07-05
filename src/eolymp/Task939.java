package eolymp;

import java.util.Scanner;

public class Task939 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = a /10 + (a % 10);
        double power = Math.pow(sum,2);
        System.out.println(power);
    }
}
