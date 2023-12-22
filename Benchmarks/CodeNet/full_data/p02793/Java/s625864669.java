import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long[] a = sc.nextLongArray(n);
        Sieve s = new Sieve(1000002);
        HashMap<Long, Integer> map = new HashMap<Long,Integer>();
        for(long aa : a){
            HashMap<Integer, Integer> tmp = s.factor((int)aa);
            for(Map.Entry<Integer,Integer> e : tmp.entrySet()){
                long k = e.getKey();
                int v = e.getValue();
                if(map.containsKey(k)){
                    map.put(k,Math.max(map.get(k),v));
                }else{
                    map.put(k,v);
                }
            }
        }
        long ans = 0;
        for(long aa : a){
            HashMap<Integer, Integer> tmp = s.factor((int)aa);
            long now = 1;
            for(Map.Entry<Long,Integer> e : map.entrySet()){
                long k = e.getKey();
                int v = e.getValue();
                if(tmp.containsKey((int)k)){
                    now *= rep2(k,(long)(v-tmp.get((int)k)),mod);
                    now %= mod;
                }else{
                    now *= rep2(k,(long)v,mod);
                    now %= mod;
                }
            }
            ans += now;
            ans %= mod;
        }
        System.out.println(ans);
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
}


class Sieve{
    static int n;
    static int[] f;
    static ArrayList<Integer> prime;
    public Sieve(int n){
        long ln = n;
        prime = new ArrayList<Integer>();
        f = new int[n+1];
        f[0] = f[1] = -1;
        for(int i = 2; i <= n; i++){
            if(f[i] != 0){
                continue;
            }
            f[i] = i;
            prime.add(i);
            long li = (long)i;
            for(long j = li*li; j <= ln; j += li){
                if(f[(int)j] == 0){
                    f[(int)j] = i;
                }
            }
        }
    }
    
    public static boolean isPrime(int x){
        return f[x] == x;
    }
    
    public static ArrayList<Integer> factorList(int x){
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(x != 1){
            res.add(f[x]);
            x /= f[x];
        }
        return res;
    }
    
    public static HashMap<Integer,Integer> factor(int x){
        ArrayList<Integer> fl = factorList(x);
        HashMap<Integer,Integer> res = new HashMap<Integer,Integer>();
        if(fl.size()==0){
            return new HashMap<Integer,Integer>();
        }
        int prev = fl.get(0);
        int cnt = 0;
        for(int p : fl){
            if(prev == p){
                cnt++;
            }else{
                res.put(prev,cnt);
                prev = p;
                cnt = 1;
            }
        }
        res.put(prev,cnt);
        return res;
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
