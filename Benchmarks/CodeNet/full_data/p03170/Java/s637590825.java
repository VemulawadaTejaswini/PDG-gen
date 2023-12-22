package com.dp_training;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int k = std.nextInt();
        int[] a = new int[n];
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        for (int i = 0; i < n; i++) {
            a[i] = std.nextInt();
        }
        dp[0] = 0;

        for (int i = 1; i <= k; i++) {
            boolean win = false;
            for (int j = 0; j < n; j++) {
                int to = i - a[j];
                if (to >= 0 && dp[to] == 0) {
                    win = true;
                }
            }

            if (win) {
                dp[i] = 1;
            } else {
                dp[i] = 0;
            }
        }

        if (dp[k] == 1) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}
