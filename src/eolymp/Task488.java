package eolymp;

import java.util.Scanner;

public class Task488 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[][] arr = new int[n][n];

            int num = 1;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        arr[i][j] = num++;
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        arr[i][j] = num++;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }



