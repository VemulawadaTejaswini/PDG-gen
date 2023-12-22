
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        String[][] dp = new String[s.length() + 1][t.length() + 1];
        for (String[] x : dp) {
            Arrays.fill(x, "");
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + s.charAt(i);
                } else {
                    if (dp[i][j + 1].length() > dp[i + 1][j].length()) {
                        dp[i + 1][j + 1] = dp[i][j + 1];
                    } else {
                        dp[i + 1][j + 1] = dp[i + 1][j];
                    }
                }
            }
        }

        System.out.println(dp[s.length()][t.length()]);


    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
