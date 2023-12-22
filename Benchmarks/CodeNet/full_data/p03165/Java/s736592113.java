import java.util.List;
import java.util.Scanner;

class Problem {
    private String s;
    private String t;

    Problem() {
        Scanner sc = new Scanner(System.in);

        s = sc.next();
        t = sc.next();
    }

    String solve() {
        int[][] dp = new int[s.length()][t.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = (i > 0 && j > 0 ? dp[i-1][j-1] : 0) + 1;
                } else {
                    int p1 = i > 0 ? dp[i-1][j] : 0;
                    int p2 = j > 0 ? dp[i][j-1] : 0;
                    dp[i][j] = Math.max(p1, p2);
                }
            }
        }

        int i = s.length() - 1;
        int j = t.length() - 1;
        StringBuilder builder = new StringBuilder(dp[i][j]);

        while (i >= 0 && j >= 0) {
            if (s.charAt(i) == t.charAt(j)) {
                builder.insert(0, s.charAt(i));
                i--;
                j--;
            } else {
                int p1 = i > 0 ? dp[i-1][j] : 0;
                int p2 = j > 0 ? dp[i][j-1] : 0;

                if (p1 >= p2) {
                    i--;
                } else {
                    j--;
                }
            }
        }

        return builder.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
