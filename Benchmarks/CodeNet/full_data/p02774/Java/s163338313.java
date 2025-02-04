import java.util.*;
import java.math.*;
 
public class Main {
  static int mod = (int) 1e9 + 7;
    static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
 
    static int n;
    static long k;
    static long a[];
  public static void main(String[] args) {
    	Scanner fs = new Scanner(System.in);
    	n = fs.nextInt();
        k = fs.nextInt();
    	a = new long[n];
        for(int i = 0; i < n; ++i) {
          a[i] = fs.nextInt();
        }
        Arrays.sort(a);
        long INF = (long)(1e18)+1;
        long l = -INF;
        long r = INF;
        while(l+1<r) {
            long c = (l+r)/2;
            if(check(c))l=c;
            else r = c;
        }
        System.out.println(l);
    }
    //x未満の組合せがk個未満ならtrue
    static boolean check(long x) {
        long tot = 0;
        for(int i=0;i<n;i++) {
            long now = a[i];
            int l = 0, r = n;
            if(now >= 0) {
                while(l<r) {
                    int c = (l+r)/2;
                    if(now * a[c] < x) l = c+1;
                    else r = c;
                }
                tot += l;
            }
            else {
                while(l<r) {
                    int c = (l+r)/2;
                    if(now * a[c] >= x) l = c+1;
                    else r = c;
                }
                tot += (n - l);
            }
            if((long)a[i] * a[i]<x)tot--;
        }
        if(tot/2 < k) return true;
        else return false;
    }
}
    