package jp.ucs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                if (a % 2 == 1) {
                    a = a--;
                }
                a = a / 2;
                b = a + b;
            } else {
                if (b % 2 == 1) {
                    b = b--;
                }
                b = b / 2;
                a = a + b;
            }
        }
        System.out.println(a + " " + b);
    }

}