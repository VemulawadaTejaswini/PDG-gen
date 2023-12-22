import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
        String t = in.next();
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];
        Pair[][] backtrack = new Pair[n + 1][m + 1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    backtrack[i][j] = new Pair(-1, -1);
                } else {
                    if (dp[i - 1][j] > dp[i][j - 1]) {
                        dp[i][j] = dp[i - 1][j];
                        backtrack[i][j] = new Pair(-1, 0);
                    } else {
                        dp[i][j] = dp[i][j - 1];
                        backtrack[i][j] = new Pair(0, -1);
                    }
                }
            }
        }
        String res = "";
        boolean[] take = new boolean[n];
        while (n != 0 && m != 0) {
            Pair p = backtrack[n][m];
            if (p.a == p.b) {
                take[n - 1] = true;
            }
            n += p.a;
            m += p.b;
        }
        for (int i = 0; i < take.length; ++i) {
            if (take[i]) {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }

    static class Pair {
        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}