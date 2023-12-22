// package com.patra.cp.atcoder.practice.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int solve(int[] weights, int[] values, int[][] dp,  int currPos, int capacity) {
        if(currPos < 0) {
            return 0;
        }
        if(capacity ==  0) {
            return 0;
        }
        if(dp[currPos][capacity] != -1) {
            return dp[currPos][capacity];
        }
        int include = 0;
        int exclude = solve(weights, values, dp,currPos-1, capacity);
        if(capacity >= weights[currPos]) {
            include = solve(weights, values, dp,currPos-1, capacity-weights[currPos]) + values[currPos];
        }
        dp[currPos][capacity] = Math.max(include, exclude);
        return dp[currPos][capacity];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] splits = line.split(" ");
        int N = Integer.parseInt(splits[0]);
        int W = Integer.parseInt(splits[1]);
        int[] weights = new int[N+1];
        int[] values = new int[N+1];
        for(int i=1; i<=N; i++) {
            line = sc.nextLine();
            splits = line.split(" ");
            weights[i] = Integer.parseInt(splits[0]);
            values[i] = Integer.parseInt(splits[1]);
        }
        int[][] dp = new int[N+1][W+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(solve(weights, values, dp, N, W));
    }
}
