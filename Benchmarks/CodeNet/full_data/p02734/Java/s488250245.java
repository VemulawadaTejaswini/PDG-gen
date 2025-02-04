import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    //SOLUTION BEGIN
    //Into the Hardware Mode
    void pre() throws Exception{}
    void solve(int TC) throws Exception {
        int n = ni(), s = ni();
        int[] a = new int[n];
        for(int i = 0; i< n; i++)a[i] = ni();
        pn(sum(a, 0, n-1, s));
    }
    long MOD = 998244353;
    long sum(int[] a, int L, int R, int S){
        if(L == R)return a[L] == S?((L+1)*((long)a.length-R))%MOD:0;
        int mid = (L+R)/2;
        long ans = 0;
        int le = mid-L+1, ri = R-mid;
        long[][] ldp = new long[1+le][1+S], rdp = new long[1+ri][1+S];
        long[] lf = new long[1+S], rf = new long[1+S];
        rdp[0][0] = 1;
        ldp[0][0] = 1;
        for(int i = 1, pos = mid+1; i<= ri; i++, pos++){
            for(int sum = 0; sum <= S; sum++){
                rdp[i][sum] = (rdp[i-1][sum]+(sum >= a[pos]?rdp[i-1][sum-a[pos]]:0))%MOD;
                rf[sum] = (rf[sum]+(a.length-pos)*(rdp[i][sum]+MOD-rdp[i-1][sum])%MOD)%MOD;
            }
        }
        for(int i = 1, pos = mid; i <= le; i++, pos--){
            for(int sum = 0; sum <= S; sum++){
                ldp[i][sum] = (ldp[i-1][sum]+(sum >= a[pos]?ldp[i-1][sum-a[pos]]:0))%MOD;
                lf[sum] = (lf[sum]+(pos+1)*(ldp[i][sum]-ldp[i-1][sum]+MOD)%MOD)%MOD;
            }
        }
        for(int i = 1; i< S; i++)ans = (ans+lf[i]*rf[S-i]%MOD)%MOD;
        return (ans+sum(a, L, mid, S)+sum(a, mid+1, R, S))%MOD;
    }
    long brute(int[] a, int n, int s){
        long ans = 0;
        for(int L = 0; L < n; L++){
            for(int R = L; R < n; R++){
                if(L == R){

                    if(a[L] == s){
                        pn(L+" "+R+" "+1);
                    }
                    continue;
                }
                if(a[L]+a[R] > s)continue;
                long[][] ways = new long[2][1+s];
                int t = 0;
                ways[t][a[L]+a[R]] = 1;
                for(int i = L+1; i < R; i++){
                    Arrays.fill(ways[t^1], 0);
                    for(int sum = 0; sum <= s; sum++){
                        ways[t^1][sum] = (ways[t][sum]+(sum >= a[i]?ways[t][sum-a[i]]:0))%MOD;
                    }
                    t ^= 1;
                }
                ans = (ans+ways[t][s]*(L+1)*(n-R));
                pn(L+" "+R+" "+(ways[t][s]*(L+1)*(n-R)));
            }
        }
        return ans;
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    void exit(boolean b){if(!b)System.exit(0);}
    final long IINF = (long)1e15;
    final int INF = (int)1e9+2, MX = (int)2e6+5;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-8;
    static boolean multipleTC = false, memory = false, fileIO = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        long ct = System.currentTimeMillis();
        if (fileIO) {
            in = new FastReader("");
            out = new PrintWriter("");
        } else {
            in = new FastReader();
            out = new PrintWriter(System.out);
        }
        //Solution Credits: Taranpreet Singh
        int T = (multipleTC) ? ni() : 1;
        pre();
        for (int t = 1; t <= T; t++) solve(t);
        out.flush();
        out.close();
        System.err.println(System.currentTimeMillis() - ct);
    }
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
        else new Main().run();
    }
    int[][] make(int n, int[] from, int[] to, int e, boolean f){
        int[][] g = new int[n][];int[]cnt = new int[n];
        for(int i = 0; i< e; i++){
            cnt[from[i]]++;if(f)cnt[to[i]]++;
        }
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]];
        for(int i = 0; i< e; i++){
            g[from[i]][--cnt[from[i]]] = to[i];
            if(f)g[to[i]][--cnt[to[i]]] = from[i];
        }
        return g;
    }
    int[][][] makeS(int n, int[] from, int[] to, boolean f){
        int[][][] g = new int[n][][];int[]cnt = new int[n];
        for(int i:from)cnt[i]++;if(f)for(int i:to)cnt[i]++;
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]][];
        for(int i = 0; i< from.length; i++){
            g[from[i]][--cnt[from[i]]] = new int[]{to[i], i};
            if(f)g[to[i]][--cnt[to[i]]] = new int[]{from[i], i};
        }
        return g;
    }
    int find(int[] set, int u){return set[u] = (set[u] == u?u:find(set, set[u]));}
    int digit(long s){int ans = 0;while(s>0){s/=10;ans++;}return ans;}
    long gcd(long a, long b){return (b==0)?a:gcd(b,a%b);}
    //    int gcd(int a, int b){return (b==0)?a:gcd(b,a%b);}
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}
    void p(Object o){out.print(o);}
    void pn(Object o){out.println(o);}
    void pni(Object o){out.println(o);out.flush();}
    String n()throws Exception{return in.next();}
    String nln()throws Exception{return in.nextLine();}
    int ni()throws Exception{return Integer.parseInt(in.next());}
    long nl()throws Exception{return Long.parseLong(in.next());}
    double nd()throws Exception{return Double.parseDouble(in.next());}

    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

        String next() throws Exception{
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    throw new Exception(e.toString());
                }
            }
            return st.nextToken();
        }

        String nextLine() throws Exception{
            String str;
            try{
                str = br.readLine();
            }catch (IOException e){
                throw new Exception(e.toString());
            }
            return str;
        }
    }
}