import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String tmp;
        dp = new int[n][26];
        for (int i = 0; i < n; i++) {
            tmp = sc.next();
            for (int j = 0; j < tmp.length(); j++) {
                dp[i][tmp.charAt(j)-'a']++;
            }
        }
        int[] ans = new int[26];
        Arrays.fill(ans,-1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 26; j++) {
                if (ans[j] == -1) {
                    //初登場であればそのまま代入
                    ans[j] = dp[i][j];
                } else {
                    //２回目以降は最小値を入力
                    ans[j] = Math.min(ans[j], dp[i][j]);
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < ans[i]; j++) {
                System.out.print((char)(97+i));
            }
        }
        System.out.println();
    }
}
