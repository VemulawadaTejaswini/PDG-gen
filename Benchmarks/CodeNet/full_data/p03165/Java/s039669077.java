import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        int[][] dp = new int[s.length+1][t.length+1];

        for (int i=1; i<=s.length; i++) {
            for (int j=1; j<=t.length; j++) {
                if (s[i-1] == t[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = (dp[i][j-1] < dp[i-1][j]) ?
                            dp[i-1][j] : dp[i][j-1];
                }
            }
        }

//        System.out.println(dp[s.length][t.length]);

        StringBuilder sb = new StringBuilder();

        int i = s.length - 1;
        int j = t.length - 1;
        while (0 <= i && 0 <= j) {
            if (s[i] == t[j]) {
                sb.append(s[i]);
                i--;
                j--;
            } else {
                if (dp[i][j+1] < dp[i+1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }

        System.out.println(sb.reverse().toString());
    }
}

