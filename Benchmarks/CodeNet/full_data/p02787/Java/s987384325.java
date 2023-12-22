import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i< n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();

        }

        int[] dp = new int[10001];
        for (int i = 0; i <= h; i++) {
            dp[i] = Integer.MAX_VALUE;
        }


        for(int i = 0; i < n; i++) {
            for(int j = 0; j < a[i]; j++) {
                dp[j] = Math.min(dp[j], b[i]);
            }

            for(int j = a[i]; j < h; j++) {
                dp[j] = Math.min(dp[j], dp[j - a[i]] + b[i]);
            }
        }
        System.out.println(dp[h - 1]);
    }
}

