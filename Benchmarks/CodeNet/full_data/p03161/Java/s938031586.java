// package com.patra.cp.atcoder.practice.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int solve(int[] arr, int[] dp, int currPos, int K) {
        if(currPos >= arr.length) {
            return Integer.MAX_VALUE;
        }
        if(dp[currPos] != -1) {
            return dp[currPos];
        }
        int count = 0;
        int res = Integer.MAX_VALUE;
        if(currPos == arr.length - 1) {
            res = 0;
        }
        for(int i = currPos + 1; i < arr.length; i++) {
            if(count == K) {
                break;
            }
            count++;
            int temp = solve(arr, dp, i, K);
            res = Math.min(res, temp + Math.abs(arr[currPos] - arr[i]));
        }
        dp[currPos] = res;
        return dp[currPos];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] splits = line.split(" ");
        int N = Integer.parseInt(splits[0]);
        int K = Integer.parseInt(splits[1]);
        int[] arr = new int[N];
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        line = sc.nextLine();
        splits = line.split(" ");
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(splits[i]);
        }
        System.out.println(solve(arr, dp, 0, K));
    }
}
