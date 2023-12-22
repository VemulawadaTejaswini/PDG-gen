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
        int maxComb = Math.min(k - 1, n - k);
        long[] constant = new long[maxComb + 1];
        constant[0] = 1;

        final int mod = 1000000007;

        long ret = constant[0];
        for(int i = 1; i <= maxComb; i++) {
            ret = (ret * pow(i,mod-2,mod)) % mod;
            constant[i] = ret;
        }

        for (int i = k - 1; i < comb.length ; i++) {
            int min = Math.min(k - 1, i - (k - 1));
            long value = constant[min];
            for(int j=i-min+1;j<=i;j++) {
                value = (value * j) % mod;
            }
            comb[i] = value;
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