package eolymp;

import java.util.Scanner;

public class Task2042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1, 2, 3 -> System.out.println("1");
            case 4, 5, 6 -> System.out.println("2");
            case 7, 8, 9 -> System.out.println("3");
            case 10, 11, 12 -> System.out.println("4");
            default -> System.out.println("(1 ≤ N ≤ 12)");
        }
    }
    }

