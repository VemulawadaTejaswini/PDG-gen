import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        FastScanner sc = new FastScanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long ans = 1;
        HashMap<Long,Integer> map = getPrimeFactorizationMap(m);
        for(Map.Entry<Long,Integer> e : map.entrySet()){
            long v = e.getValue();
            ans *= nCk(v+n-1,v,mod);
            ans %= mod;
        }
        System.out.println(ans);
    }
    
    public static long nCk(long n,long k,long M) {
        if(n < 0 || k < 0 || n < k){
            return 0;
        }
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
    private static long rep2(long b, long n, long mod){
        if(n == 0) return 1;
        if(n == 1) return b;
        long bn = rep2(b,n/2,mod)%mod;
        if(n % 2 == 0){
            return (long)(bn%mod*bn%mod)%mod;
        }else{
            return (long)(bn%mod*bn%mod)%mod*b%mod;
        }
    }
    
    static HashMap<Long,Integer> getPrimeFactorizationMap(long x) {
        HashMap<Long,Integer> result = new HashMap<Long,Integer>();
        int cnt = 0;
        while (x >= 2L && x % 2L == 0) {
            cnt++;
            x /= 2;
        }
        if(cnt > 0){
            result.put(2L,cnt);
            cnt = 0;
        }
        long d = 3;
        long q = x / d;
        while (q >= d) {
            cnt = 0;
            while (x % d == 0) {
                cnt++;
                x /= d;
            }
            if(cnt > 0){
                result.put(d,cnt);
            }
            d += 2;
            q = x / d;
        }
        if(x != 1) result.put(x,1);
        
        return result;
    }
}


class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
            return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }
    
    public int nextInt() {
        return Integer.parseInt(next());
    }
    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nextLong();
        return a;
    } 
}
