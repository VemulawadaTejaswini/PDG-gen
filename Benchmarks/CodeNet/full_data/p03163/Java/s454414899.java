import java.io.*;
import java.util.Scanner;

public class Main {

    static int N, W;
    static int[] w;
    static int[] v;
    static boolean[][] vis;
    static long[][] memo;

    static long dp(int idx, int rem) {
        if(idx == N) return 0;
        if(vis[idx][rem]) return memo[idx][rem];
        long ans = 0;
        if(rem - w[idx] >= 0)
            ans = v[idx] + dp(idx + 1, rem - w[idx]);
        ans = Math.max(ans, dp(idx + 1, rem));
        vis[idx][rem] = true;
        return memo[idx][rem] = ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        W = sc.nextInt();
        w = new int[N];
        v = new int[N];
        vis = new boolean[N][W + 1];
        memo = new long[N][W + 1];
        for(int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        System.out.println(dp(0, W));
    }
}
