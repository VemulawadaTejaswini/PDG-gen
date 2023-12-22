import java.util.*;

public class Main {

    static long mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] sum = new long[n+1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + i;
        }
        long ans = 1L;
        for (int i = k; i <= n; i++) {
            long min = sum[i-1]-1;
            long max = sum[n] - sum[n-i];
            ans = (ans + max - min) %mod;
        }
        System.out.println(ans);
        sc.close();

    }

}
