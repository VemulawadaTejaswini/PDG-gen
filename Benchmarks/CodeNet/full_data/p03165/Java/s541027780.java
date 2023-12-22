import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        String[][] dp = new String[s.length+1][t.length+1];

        for (int i=0; i<s.length+1; i++) {
            for (int j=0; j<t.length+1; j++) {
                dp[i][j] = "";
            }
        }

        for (int i=1; i<=s.length; i++) {
            for (int j=1; j<=t.length; j++) {
                if (s[i-1] == t[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + String.valueOf(s[i-1]);
                } else {
                    dp[i][j] = (dp[i][j-1].length() < dp[i-1][j].length()) ?
                            dp[i-1][j] : dp[i][j-1];
                }
            }
        }

        System.out.println(dp[s.length][t.length]);
    }
}

