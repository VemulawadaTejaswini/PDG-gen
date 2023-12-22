// test

import java.util.*;
class Main {
    public static final int mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long ans = 0;

        long aPct = div(a, a+b);
        long bPct = div(b, a+b);
        long comb = 1;
        for(int m = 0; m<n; m++) {
            ans += pow(aPct, n)*pow(bPct, m)%mod*comb%mod*(n+m)%mod;
            ans %= mod;
            ans += pow(bPct, n)*pow(aPct, m)%mod*comb%mod*(n+m)%mod;
            ans %= mod;
            comb = div(comb*(n+m)%mod, m+1);
        }
        long l = div(a+b, 100);
        System.out.println(div(ans, l));

    }
    static long pow (long x, long y) {
        if (y == 0) {
            return 1;
        } else if (y % 2 == 0) {
            long a = pow(x, y/2);
            return a*a%mod;
        } else {
            long a = pow(x, y/2);
                return(a*a%mod)*x%mod;
        }
    }

    static long div (long x, long y) {
        return (x*pow(y, mod-2))%mod;
    }

}