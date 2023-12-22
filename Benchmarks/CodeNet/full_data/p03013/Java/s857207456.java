import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int mod = 1000000007;
        int[] broken = new int[n + 2];
        if (m > 0) {
            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = scan.nextInt();
            }
            int cnt = 0;
            Arrays.sort(a);
            for (int i = 0;  i < n; i++) {
                if (a[cnt] == i + 1) {
                    broken[i + 1] = 1;
                    cnt++;
                    if (a.length == cnt) {
                        break;
                    }
                }
            }
        }

        long[] dp = new long[n + 2];
        dp[n] = 1;
        for (int i = n - 1; 0 <= i; i--) {
            if (broken[i] == 1) {
                continue;
            }
            dp[i] = dp[i + 1] + dp[i + 2];
        }
        System.out.println(dp[0]%mod);
    }
}