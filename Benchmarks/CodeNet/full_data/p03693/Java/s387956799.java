package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        if (check(r,g,b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean check(int r, int g, int b) {
        return (r * 100 + g * 10 + b) % 4 == 0;
    }
}
