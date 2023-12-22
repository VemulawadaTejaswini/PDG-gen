
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String a = in.next();
        String b = in.next();
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
            }
        }
        int i = a.length();
        int j = b.length();

        String result = "";
        while (i > 0 && j > 0) {
            if (a.charAt(i - 1) == b.charAt(j - 1) && dp[i][j] == dp[i - 1][j - 1] + 1) {
                result =  a.charAt(i - 1) + result;
                --j;
                --i;
            } else if (dp[i][j] == dp[i][j - 1]) {
                --j;
            } else{
                --i;
            }
        }

        System.out.println(result);
    }
}
