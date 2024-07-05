package eolymp;

import java.util.Scanner;

public class Task8614 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(x < a | x > b){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
