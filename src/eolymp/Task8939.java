package eolymp;

import java.util.Scanner;

public class Task8939 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < 4; i++){
            for (int j = 0; j < n; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
