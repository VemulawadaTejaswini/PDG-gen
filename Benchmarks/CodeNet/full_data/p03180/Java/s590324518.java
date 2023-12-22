import java.util.*;
import java.io.*;
class Main {
    static long[] maskCount;
    static long[] dp;
    static long recurse(long[][] a, int mask) {
        if(Integer.bitCount(mask)==a.length)
            return 0;
        if(dp[mask]!=-1)
            return dp[mask];
        int n = a.length;
        long res = Long.MIN_VALUE;
        for(int j = 1; j<(1<<n); j++) {
            if((mask&j)!=0)
                continue;
            long x = recurse(a, mask|j);
            if(x==Long.MIN_VALUE) continue;
            res = Math.max(res, maskCount[j]+x);
        }
        return dp[mask] = res;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] a = new long[n][n];
        dp = new long[1<<n];
        Arrays.fill(dp, -1);
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++)
                a[i][j] = sc.nextInt();
        }
        maskCount = new long[1<<n];
        for(int i = 0; i<(1<<n); i++) {
            int mask = i;
            long ans = 0;
            for(int j = 0; j<n; j++) {
                for(int k = j+1; k<n; k++) {
                    int bit1 = (mask>>k)&1;
                    int bit2 = (mask>>j)&1;
                    if(bit1==1 && bit2==1)
                        ans+=a[j][k];
                }
            }
            maskCount[mask] = ans;
        }
        System.out.println(recurse(a, 0));
    }
}