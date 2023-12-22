package com.boqi.atcoders.abc158;

import java.util.Scanner;

/**
 * 数球
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    {
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(N/(A+B)*A+Math.min(A, N%(A+B)));
    }
}
