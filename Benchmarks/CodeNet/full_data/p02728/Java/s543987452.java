import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    final static int MOD = (int)1e9+7;
    final static long INF = Long.MAX_VALUE / 2;
    
    ModCalculator mc;
    int N;
    ArrayList<ArrayList<Integer>> g;
    int[] num;
    long[] dp1, dp2;
    
    void solve(){
        N = in.nextInt();
        mc = new ModCalculator(N, MOD);
        g = new ArrayList<>();
        for(int i = 0; i < N; i++) g.add(new ArrayList<>());
        for(int i = 0; i < N - 1; i++){
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            g.get(a).add(b);
            g.get(b).add(a);
        }
        
        num = new int[N];
        dfsNum(0, -1);
        dp1 = new long[N];
        dfsDp1(0, -1);
        dp2 = new long[N];
        dfsDp2(0, -1);
        for(int i = 0; i < N; i++) out.println(dp2[i]);
    }
    
    void dfsDp2(int v, int p){
        if(v == 0){
            dp2[0] = dp1[0];
        }else{
            dp2[v] = 1;
            dp2[v] *= mc.modComb(N - 1, num[v] - 1);
            dp2[v] %= MOD;
            dp2[v] *= dp1[v];
            dp2[v] %= MOD;
            
            //dp2[v] *= (dp2[p] / dp1[v]) * mc.modFactInv(N - 1) * mc.modFact(N - 1 - num[v]) * mc.modFact(num[v]);
            dp2[v] *= (dp2[p] * mc.modMultiInv(dp1[v], MOD)) % MOD;
            dp2[v] %= MOD;
            dp2[v] *= (mc.modFactInv(N - 1) * mc.modFact(N - 1 - num[v])) % MOD;
            dp2[v] %= MOD;
            dp2[v] *= mc.modFact(num[v]);
            dp2[v] %= MOD;
        }
        for(int ch : g.get(v)) if(ch != p) dfsDp2(ch, v);
    }
    
    long dfsDp1(int v, int p){
        dp1[v] = 1;
        int all = num[v] - 1;
        for(int ch : g.get(v)){
            if(ch != p){
                dp1[v] *= mc.modComb(all, num[ch]);
                dp1[v] %= MOD;
                dp1[v] *= dfsDp1(ch, v);
                dp1[v] %= MOD;
                all -= num[ch];
            }
        }
        return dp1[v];
    }
    
    int dfsNum(int v, int p){
        for(int ch : g.get(v)) if(ch != p) num[v] += dfsNum(ch, v);
        num[v]++;
        return num[v];
    }
    
    static class ModCalculator{
        //引数の最大値、MOD
        private final int MAX_FAC, MOD;
        //階乗・階乗の逆元・積の逆元のテーブル
        private long[] fact, factInv, inv;
        
        public ModCalculator(){
            this(510000, (int)1e9+7);
        }
        
        public ModCalculator(int max, int mod){
            MAX_FAC = max; MOD = mod;
            init();
        }
        
        //テーブルの初期化
        private void init(){
            fact = new long[MAX_FAC+1];
            factInv = new long[MAX_FAC+1];
            inv = new long[MAX_FAC+1];
            fact[0] = factInv[0] = inv[0] = fact[1] = factInv[1] = inv[1] = 1;
            for (int i = 2; i <= MAX_FAC; ++i) {
                fact[i] = fact[i - 1] * i % MOD;
                inv[i] = MOD - (MOD / i) * inv[(int) (MOD % i)] % MOD;
                factInv[i] = factInv[i - 1] * inv[i] % MOD;
            }
        }
        
        //nPk % MOD
        public long modPerm(int n, int k){
            return (n >= k) ? fact[n] * factInv[n - k] % MOD : 0;
        }
        
        //nCk % MOD
        public long modComb(int n, int k){
            return (n >= k) ? fact[n] * factInv[k] % MOD * factInv[n - k] % MOD : 0;
        }
        
        //nPk % MOD、nが大きくてもO(k)で計算できる
        public long modPermLarge(long n, int k){
            if(n < k) return 0;
            long res = 1;
            for(long i = n; i > n - k; i--) res = (res * (i % MOD)) % MOD;
            return res;
        }
        
        //nCk % MOD、nが大きくてもO(k)で計算できる
        public long modCombLarge(long n, int k){
            if(n < k) return 0;
            long res = 1;
            for(long i = n; i > n - k; i--) res = (res * (i % MOD)) % MOD;
            res = (res * factInv[k]) % MOD;
            return res;
        }
        
        //n! % MOD
        public long modFact(int n){
            return fact[n];
        }
        
        //(n!)^-1 % MOD
        public long modFactInv(int n){
            return factInv[n];
        }
        
        //n^-1 % MOD
        public long modMultiInv(int n){
            return inv[n];
        }
        
        //n^-1 % MOD をlog(MOD)で計算
        public static long modMultiInv(long a, int mod){
            return modPow(a, mod-2, mod);
        }
        
        //a^b % MOD をlog(b)で計算
        public static long modPow(long a, long b, int mod){
            long res = 1;
            while(b > 0){
                if((b & 1) == 1) res = (res * a) % mod;
                a = (a * a) % mod;
                b = b >> 1;
            }
            return res;
        }
    }
    
    public static void main(String[] args) {
        new Main().m();
    }
    
    private void m() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        /*
        try {
            String path = "input.txt";
            out = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
        }catch (IOException e){
            e.printStackTrace();
        }
        */
        solve();
        out.flush();
        in.close();
        out.close();
    }
    
    static class FastScanner {
        private Reader input;
        
        public FastScanner() {this(System.in);}
        public FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}
        public void close() {
            try {
                this.input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        public int nextInt() {return (int) nextLong();}
        
        public long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
        
        public double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }
        
        public char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
        
        public String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
        
        public String nextLine() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (b != -1 && b != '\n') {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
        
        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }
        
        public int[] nextIntArrayDec(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }
        
        public int[] nextIntArray1Index(int n) {
            int[] res = new int[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextInt();
            }
            return res;
        }
        
        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }
        
        public long[] nextLongArrayDec(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }
        
        public long[] nextLongArray1Index(int n) {
            long[] res = new long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }
        
        public double[] nextDoubleArray(int n) {
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextDouble();
            }
            return res;
        }
    }
}