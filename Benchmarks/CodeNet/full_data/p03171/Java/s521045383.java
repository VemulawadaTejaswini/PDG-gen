import java.util.*;
import java.text.*;

public class Main {
    static long MOD = (long)1e9+7;
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for(int i = 0; i< n; i++)a[i] = in.nextLong();
        
        long[][] res = new long[n][n];
        for(int i = 0; i< n; i++)Arrays.fill(res[i], Long.MAX_VALUE);
        System.out.println(res(res, a, 0, n-1));
    }
    static long res(long[][] res, long[] a, int l, int r){
        int t = (a.length-(r-l+1))%2;
        if(t%2 == 0){
            if(l == r)return a[l];
            return Math.max(a[l]+res(res, a, l+1, r), a[r]+res(res, a, l, r-1));
        }else{
            if(l == r)return -a[l];
            return Math.min(-a[l]+res(res, a, l+1, r), -a[r]+res(res, a, l, r-1));
        }
        
    }
}