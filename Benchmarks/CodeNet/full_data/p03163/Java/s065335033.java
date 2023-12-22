import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n;
    static int w;
    static int k;
    static int[] a;
    static int[] b;
    static long[][][] dp;
    static long[][] memo;

    //再帰メモ化
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        w = sc.nextInt();
        a = new int[n];
        b = new int[n];
        memo = new long[101][10010];

        //初期値として-1を代入する。
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 10010; j++) {
                memo[i][j] = -1;
            }
        }

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        System.out.println(dfs(0, w));
    }

    //next：次の商品 　restW：許容できる重さ
    static long dfs(int next, int restW) {
        //もしメモに値があればそれを返す。
        if (memo[next][restW] >= 0) {
            return memo[next][restW];
        }

        long res;
        if (next == n) {
            res = 0;
        } else if(restW < a[next]) {
            res = dfs(next+1, restW);
            System.out.println(res);
        } else {
            res = Math.max(dfs(next+1, restW), dfs(next+1, restW - a[next]) + b[next]);
        }
        return res;
    }
}