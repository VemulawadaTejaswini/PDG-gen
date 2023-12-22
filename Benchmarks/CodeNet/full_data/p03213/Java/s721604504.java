import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long mod = (long)1e9+7;
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i = 2; i <= n; i++){
            HashMap<Long,Integer> tmp = getPrimeFactorizationMap((long)i);
            for(Map.Entry<Long,Integer> e : tmp.entrySet()){
                map.put(e.getKey(),map.getOrDefault(e.getKey(),0)+e.getValue());
            }
        }
        int up74 = 0;
        int up24 = 0;
        int up14 = 0;
        int up4 = 0;
        int up2 = 0;
        for(Map.Entry<Long,Integer> e : map.entrySet()){
            if(e.getValue() >= 74){
                up74++;
            }
            if(e.getValue() >= 24){
                up24++;   
            }
            if(e.getValue() >= 14){
                up14++;
            }
            if(e.getValue() >= 4){
                up4++;
            }
            if(e.getValue() >= 2){
                up2++;
            }
        }
        //System.out.println(up74 + " " + up24 + " " + up14 + " " + up4 + " " + up2);
        System.out.println(nCk(up74,1,mod) + nCk(up24,1,mod)*nCk(up2-1,1,mod) + nCk(up14,1,mod)*nCk(up4-1,1,mod) + nCk(up4,2,mod)*nCk(up2-2,1,mod));
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
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }
    
    public void close() throws Exception{
        this.reader.close();
        return;
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
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
