import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int[][] dp = new int[s.length() + 1][t.length() + 1];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i + 1][j + 1] = Math.max(dp[i][j] + 1, dp[i + 1][j]);
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j + 1]);
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = s.length(), j = t.length();
        while (i > 0 && j > 0) {
            if (dp[i][j] == dp[i - 1][j]) {
                i--;
            } else if (dp[i][j] == dp[i][j - 1]) {
                j--;
            } else {
                sb.append(s.charAt(i - 1));
                i--;
                j--;
            }

        }

        System.out.println(sb.reverse().toString());
    }
}
