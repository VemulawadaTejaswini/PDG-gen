// package com.patra.cp.atcoder.practice.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int solve(int[][] happiness, int[][] dp, int lastActivity, int day) {

        if(day >= happiness.length) {
            return 0;
        }

        if(dp[day][lastActivity] != -1) {
            return dp[day][lastActivity];
        }

        int maxHappiness = 0;
        int activityHappiness;

        for(int activity=1; activity <= 3; activity++) {
            if(activity != lastActivity) {
                activityHappiness = happiness[day][activity] + solve(happiness, dp, activity, day + 1);
                maxHappiness = Math.max(activityHappiness, maxHappiness);
            }
        }

        dp[day][lastActivity] = maxHappiness;

        return dp[day][lastActivity];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int N = Integer.parseInt(line);
        String[] splits;
        int[][] happiness = new int[N+1][4];
        int[][] dp = new int[N+1][4];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        for(int i=1; i<=N; i++) {
            line = sc.nextLine();
            splits = line.split(" ");
            for(int j=1; j<=splits.length; j++) {
                happiness[i][j] = Integer.parseInt(splits[j-1]);
            }
        }
        System.out.println(solve(happiness, dp, 0, 1));
    }
}
