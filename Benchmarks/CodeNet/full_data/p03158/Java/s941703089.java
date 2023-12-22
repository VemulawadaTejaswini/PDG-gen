import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static int n;
    static long[] a, sum, sum2;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int Q = sc.nextInt();
        a = new long[n+1]; sum = new long[n+1]; sum2 = new long[n+1];
        for(int i=1;i<=n;i++) {
            a[i]=sc.nextLong();
            sum[i] = sum[i-1]+a[i];
        }
        sum2[1] = a[1];
        for(int i=2;i<=n;i++) sum2[i] = sum2[i-2]+a[i];
        PrintWriter out = new PrintWriter(System.out);
        while(Q>0){
            Q--;
            long x = sc.nextLong();
            out.println(query(x));
        }
        out.flush();
    }
    static long query(long X){
        if(n<=2) return a[n];
        int hi = (n-1)/2;
        if(Math.abs(X-a[n-2*hi])<=Math.abs(X-a[n-hi])){
            return sum[n]-sum[n/2];
        }
        int lo = -1;
        while(hi-lo>1){
            int mid = (hi+lo)/2;
            if(Math.abs(X-a[n-2*mid])>Math.abs(X-a[n-mid])) hi=mid;
            else lo = mid;
        }
        long ans = sum2[n-2*hi];
        ans += sum[n]-sum[n-hi];
        return ans;
    }
}
