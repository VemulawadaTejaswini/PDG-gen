import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        ArrayList<Count> li = new ArrayList<Count>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] al = new Integer[n];
        for(int i = 0; i < n; i++){
            al[i] = sc.nextInt();
        }
        Arrays.sort(al);
        long ans = 0;
        for(int i = k-1; i < n; i++){
            ans += al[i] * nCk(i,k-1,mod) % mod;
            ans %= mod;
        }
        Arrays.sort(al,Comparator.reverseOrder());
        for(int i = k-1; i < n; i++){
            ans -= al[i] * nCk(i,k-1,mod) % mod;
            ans %= mod;
        }
        System.out.println(ans);
    }
    
    public static long nCk(long n,long k,long M) {
        long ret = 1;
        long min = Math.min(k, n-k);
        for(long i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(long i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return ret;
    }

    public static long pow(long a,long b,long M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1){
                ret = (ret * tmp) % M;
            }
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
}

class Count{
    int p,cnt;
    public Count(int p, int c){
        this.p = p;
        this.cnt = c;
    }
}

