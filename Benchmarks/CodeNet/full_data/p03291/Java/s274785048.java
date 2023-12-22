import java.util.Scanner;

//D - We Love ABC
public class Main {
    private static final long M = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        dp(s);
        sc.close();
    }

    public static void dp(String s) {
        long[][] dp = new long[s.length()][3];
        long a = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == '?') {
                dp[i][0] = a;
            }
            if (ch == '?') a = (a * 3) % M;
        }
        a = dp[0][0];
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'B' || ch == '?') {
                dp[i][1] = a;
            }
            if (ch == '?')
                a = (dp[i][0] + a * 3) % M;
            else
                a = (dp[i][0] + a) % M;
        }

        a = dp[1][1];
        for (int i = 2; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'C' || ch == '?') {
                dp[i][2] = a;
            }
            if (ch == '?')
                a = (dp[i][1] + a * 3) % M;
            else
                a = (dp[i][1] + a) % M;
        }
        long total = 0;
        a = 1;
        for (int i = s.length() - 1; i >= 2; i--) {
            char ch = s.charAt(i);
            if (dp[i][2] > 0)
                total = (total + dp[i][2] * a) % M;
            if (ch == '?') a = (a * 3) % M;
        }
        System.out.println(total);
    }

}
