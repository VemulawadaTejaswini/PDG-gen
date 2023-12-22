import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long[] dp = new long[n + 1];
        dp[0] = 0;
        boolean add = true;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (a[i] > a[j - 1]) {
                    add = false;
                    break;
                }
            }
            if (add) {
                dp[i + 1] = dp[i] + 1;
                add = true;
            } else {
                dp[i + 1] = dp[i];
            }
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
