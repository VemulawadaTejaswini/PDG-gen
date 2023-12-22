import java.util.*;

public class Main {
    static int n;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[100000 + 2];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                dp[num]++;
                dp[num+1]++;
            } else {
                dp[num-1]++;
                dp[num]++;
                dp[num+1]++;
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        System.out.println(max);
    }
}
