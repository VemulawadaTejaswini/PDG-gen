import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int[][] dp = new int[s.length() + 1][t.length() + 1];

        for (int i = 0 ; i < s.length(); i++) {
            for (int j = 0 ; j < t.length(); j++) {
                if (s.substring(i, i + 1).equals(t.substring(j, j+1))) {
                    dp[i +1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i +1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        String ans = "";
        for (int i = 1 ; i <= s.length() ; i++) {
            if (dp[i][t.length()] > dp[i - 1][t.length()]) {
                ans += s.substring(i -1, i );
            }
        }
        System.out.println(ans);
    }

}
