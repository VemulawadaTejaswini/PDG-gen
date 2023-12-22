
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] list = new long[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
        }

        Arrays.sort(list);

        long[] comb = new long[n];
        long[] rf = new long[n];
        long[] f = new long[n];
        f[0] = 1;

        final int mod = 1000000007;

        for (int i = 1; i < n; i++) {
            f[i] = (f[i - 1] * i) % mod;
        }
        rf[n - 1] = pow(f[n - 1], mod - 2, mod);
        for (int i = n - 2; i >= 0 ; i--) {
            rf[i] = (rf[i + 1] * (i + 1)) % mod;
        }

        for (int i = k - 1; i < comb.length ; i++) {
            long a = f[i]; // n!
            long b = rf[i - (k - 1)]; // (n-k)!
            long c = rf[k - 1]; // k!
            long bc = (b * c) % mod;

            comb[i] = (a * bc % mod);
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            long min = comb[n - i - 1];
            long max = comb[i];
            long gap = max - min;
            ans += list[i] * gap % mod;
            ans %= mod;
        }

        System.out.println(ans);
    }

    //return a^b mod M O(logB)
    private static long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
}