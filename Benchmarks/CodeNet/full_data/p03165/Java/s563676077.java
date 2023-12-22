import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static String lcs(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        char[] result = new char[dp[n][m]];
        int k = dp[n][m] - 1;
        int i = n, j = m;
        while(i > 0 && j > 0) {
            if(s.charAt(i - 1) == t.charAt(j - 1)) {
                result[k] = s.charAt(i - 1);
                k--; i--; j--;
            } else if(dp[i][j] == dp[i - 1][j]) {
                i--;
            } else {
                j--;
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(lcs(s, t));
  }
}
