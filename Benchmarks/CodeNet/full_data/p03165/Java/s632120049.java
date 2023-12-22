import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        String res = lcs(s, t);
        System.out.println(res);
    }

    private static String lcs(String s, String t) {
        // subproblem:
        // f(k, l) = LCS of s[0..k) and t[0..l)
        // f(s.length, t.length)

        // f(0, *) = ""
        // f(*, 0) = ""
        // f(k, l) = max:
        //         f(k-1, l)
        //         f(k, l-1)
        //         f(k-1, l-1) + s[k-1], if s[k-1] == t[l-1]

        int N1 = s.length();
        int N2 = t.length();
        String[][] dp = new String[N1+1][N2+1];
        for (int i = 0; i <= N1; i++) {
            for (int j = 0; j <= N2; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = "";
                } else {
                    if (s.charAt(i-1) == t.charAt(j-1)) {
                        dp[i][j] = dp[i-1][j-1] + s.charAt(i-1);
                    } else if (dp[i-1][j].length() > dp[i][j-1].length()) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = dp[i][j-1];
                    }
                }
            }
        }
        return dp[N1][N2];
    }
}
