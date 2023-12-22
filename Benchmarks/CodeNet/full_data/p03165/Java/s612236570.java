import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("");
        String[] t = sc.next().split("");
        String[] dp = new String[t.length];
        Arrays.fill(dp, "");

        for (String value : s) {
            String v = "";
            for (int j = 0; j < t.length; j++) {
                if (value.equals(t[j])) {
                    dp[j] = dp[j] + t[j];
                    v = dp[j];
                } else {
                    dp[j] = v.length() > dp[j].length() ? v : dp[j];
                }
            }
        }

        System.out.println(dp[t.length - 1]);
    }
}