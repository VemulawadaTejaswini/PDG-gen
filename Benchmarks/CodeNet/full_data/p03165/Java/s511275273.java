
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(commonSubsequence(s, t));
    }

    private static int[][] commonSubsequenceMatrix(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp;
    }

    public static String commonSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] matrix = commonSubsequenceMatrix(s, t);
        StringBuilder sb = new StringBuilder();
        int i = n;
        int j = m;
        while (i > 0 || j > 0) {
            if (i > 0 && j > 0 && s.charAt(i - 1) == t.charAt(j - 1)) {
                sb.append(s.charAt(i - 1));
                i--;
                j--;
            } else {
                if (i > 0 && j > 0 && matrix[i - 1][j] > matrix[i][j - 1]) i--;
                else {
                    if (i <= 0) j--;
                    else if (j <= 0) i--;
                    else j--;
                }
            }
        }
        return sb.reverse().toString();
    }
}
