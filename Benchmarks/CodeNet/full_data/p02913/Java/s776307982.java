package abc.abc141;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Z-Algorithm or ローリングハッシュが想定解？
 * http://drken1215.hatenablog.com/entry/2019/09/16/014600
 * LCP(Longest Common Prefix)配列をどう求めるかで方針が異なる．
 * LCP Array: https://blog.shibayu36.org/entry/2017/01/06/103956
 */
public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        test();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        int ans = solveDP(N, S);

        System.out.println(ans);
    }
  
      private static int solveDP(int N, String S) {
        int count = 0;
        // dp[i][j]: i文字目からとj文字目からとで一致する文字列長
        int[][] dp = new int[N+1][N+1];


        for (int i=N-1; i>=0; i--) {
            for (int j=N-1; j>i; j--) {
                if (S.charAt(i) == S.charAt(j)) {
                    dp[i][j] = Math.max(dp[i][j], dp[i+1][j+1]+1);
                }

                count = Math.max(count, Math.min(dp[i][j], j-i));
            }
        }


        return count;
    }
}