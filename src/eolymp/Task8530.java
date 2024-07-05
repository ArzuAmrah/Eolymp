package eolymp;

import java.util.Scanner;

public class Task8530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][]matris = new int [n][n];
        for( int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matris[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
