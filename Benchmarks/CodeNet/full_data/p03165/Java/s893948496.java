import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();

        int l1 = s.length(), l2 = t.length();
        String[][] dp = new String[l1 + 1][l2 + 1];

        for (int i = 0; i <= l1; ++i) {
            for (int j = 0; j <= l2; ++j) {
                if (i == 0 || j == 0) {
                    dp[i][j] = "";
                } else if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + s.charAt(i);
                } else if (dp[i][j - 1].length() > dp[i - 1][j].length()) {
                    dp[i][j] = dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[l1][l2]);
    }
}
