package eolymp;

import java.util.Scanner;

public class Task1607 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        sc.close();

        String reversed = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reversed += n.charAt(i);
        }


        System.out.println(reversed);
    }
}
