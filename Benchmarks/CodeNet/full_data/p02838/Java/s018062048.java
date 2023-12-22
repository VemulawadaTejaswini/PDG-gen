import java.util.*;

public class Main {
    static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[61];
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            for (int j = 0; j <= 60; j++) {
                if((x >> j & 1) == 1){
                    a[j]++;
                }
            }
        }
        long ans = 0L;
        long b = 1L;
        for (int i = 0; i <= 60; i++) {
            ans = (ans + (b * ((long)a[i] * (long)(n-a[i]))%MOD)%MOD ) % MOD;
            b = (b * 2L) % MOD;
        }
        System.out.println(ans);
        sc.close();

    }

}
