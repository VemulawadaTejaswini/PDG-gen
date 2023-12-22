import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String[][] dp = new String[s.length() + 1][t.length() + 1];
        for (int i = 0 ; i < s.length() + 1 ; i++) {
            for (int j = 0; j < t.length() + 1; j++) {
                dp[i][j] = "";
            }
        }
        for (int i = 0 ; i < s.length(); i++) {
            for (int j = 0 ; j < t.length(); j++) {
                if (s.substring(i, i + 1).equals(t.substring(j, j+1))) {
                    dp[i +1][j + 1] = dp[i][j] + s.substring(i, i + 1);
                } else {
                    if (dp[i][j + 1].length() > dp[i + 1][j].length()) {
                        dp[i +1][j + 1] = dp[i][j + 1];
                    } else {
                        dp[i +1][j + 1] = dp[i + 1][j];
                    }
                }
            }
        }
        System.out.println(dp[s.length()][t.length()]);
    }

}
