import java.util.Scanner;

class Main {
    // F - LCS
    public static String lcs(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int n = ss.length, m = tt.length;

        if (n == 0 || m == 0) return "";
        int[][] dp = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (ss[i-1] == tt[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        // System.out.println("lcs.length = " + dp[n][m]);

        int L = dp[n][m];
        if (L == 0) return "";

        char[] ans = new char[L];
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (ss[i-1] == tt[j-1]) {
                ans[--L] = ss[i-1];
                i--;
                j--;
            } else if (dp[i-1][j] > dp[i][j-1]) {
                i--;
            } else {
                j--;
            }
        }

        return new String(ans);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        in.close();

        // call function hear
        String ans = lcs(s, t);
        System.out.println(ans);
    }
}