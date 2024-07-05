package eolymp;

import java.util.Scanner;

public class Task7812 {
    private static int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max){
            max = c;
        }
        if (d > max){
            max = d;
        }
        System.out.println(max);
    }
}
