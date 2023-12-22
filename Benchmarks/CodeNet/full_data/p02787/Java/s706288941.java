//package com.company;
import java.util.*;

public class Main {
    static class Pair {
        int a, b;
        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), n = sc.nextInt();
        ArrayList<Pair> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
        {
            int r = sc.nextInt(), t = sc.nextInt();
            a.add(new Pair(r, t));
        }
        int[] dp = new int[21000];
        for (int i = 0; i < 21000; i++)
            dp[i] = (int)1E9;
        dp[0] = 0;
        for (int i = 0; i < h; i++)
            for (int j = 0; j < n; j++) {
                int damage = a.get(j).a;
                int cost = a.get(j).b;
                dp[i + damage] = Math.min(dp[i + damage], dp[i] + cost);
            }
        int ans = (int)1E9;
        for (int i = h; i < 21000; i++)
            ans = Math.min(ans, dp[i]);
        System.out.println(ans);
    }
}
