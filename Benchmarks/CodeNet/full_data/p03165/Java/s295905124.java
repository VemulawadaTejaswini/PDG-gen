import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int[][] dp = new int[s.length + 1][t.length + 1];

        for(int i = 1;i <= s.length;i++) {
            for(int j = 1;j <= t.length;j++) {
                if(s[i - 1] == t[j - 1]) dp[i][j] = dp[i - 1][j - 1] + 1;
                else if(dp[i - 1][j] >= dp[i][j - 1]) dp[i][j] = dp[i - 1][j];
                else dp[i][j] = dp[i][j - 1];
            }
        }

        int i = s.length;
        int j = t.length;
        String ans = "";
        while(i > 0 && j > 0) {
            if(dp[i][j] == dp[i - 1][j]) i--;
            else if(dp[i][j] == dp[i][j - 1]) j--;
            else {
                ans = s[i - 1] + ans;
                i--;
                j--;
            }
        }

        System.out.println(ans);
    }

}
