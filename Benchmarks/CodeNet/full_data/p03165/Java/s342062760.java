import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int[][] dp = new int[s.length() + 1][];
        dp[0] = new int[t.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            int v = 0;
            dp[i + 1] = dp[i].clone();
            for (int j = 0; j < t.length(); j++) {
                if (dp[i + 1][j] == dp[i + 1][j + 1] && s.charAt(i) == t.charAt(j)) {
                    dp[i + 1][j + 1]++;
                    v = dp[i + 1][j + 1];
                } else {
                    dp[i + 1][j + 1] = Math.max(v, dp[i + 1][j + 1]);
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        int sI = s.length();
        int tI = t.length();

        while (dp[sI][tI] > 0) {
            if (dp[sI][tI] == dp[sI - 1][tI]) {
                sI--;
            } else if (dp[sI][tI] == dp[sI][tI - 1]) {
                tI--;
            } else {
                builder.insert(0, t.charAt(tI - 1));
                tI--;
                sI--;
            }
        }

        System.out.println(builder);
    }
}
