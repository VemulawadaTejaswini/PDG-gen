import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    //SOLUTION BEGIN
    //Into the Hardware Mode
    void pre() throws Exception{}
    void solve(int TC)throws Exception {
        int n = ni();
        long[][] p = new long[n][];
        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0; i< n; i++){
            p[i] = new long[]{nl(), nl()};
            set.add(p[i][0]);
            set.add(p[i][0]+p[i][1]);
        }
        HashMap<Long, Integer> mp = new HashMap<>();
        int c = 0;
        for(long l:set)mp.put(l, c++);
        c++;
        long[] dp = new long[c];
        Arrays.sort(p, (long[] l1, long[] l2) -> Long.compare(l1[0], l2[0]));
        int ptr = n-1;
        long MOD = 998244353;
        SegTree t = new SegTree(c);
        int[] end = new int[n];
        for(int i = c-1; i>= 0; i--){
            if(mp.get(p[ptr][0]) == i){
                int u = mp.get(p[ptr][0]), v = mp.get(p[ptr][0]+p[ptr][1]);
                end[ptr] = Math.max(v, t.mx(u, v-1));
                t.u(u, v, end[ptr]);
                ptr--;
            }
        }
        ptr = n-1;
        for(int i = c-1; i >= 0; i--){
            if(i+1 < c)dp[i] = dp[i+1];
            if(mp.get(p[ptr][0]) == i){
                dp[i] += dp[end[ptr]]+1;
                if(dp[i] >= MOD)dp[i] -= MOD;
                ptr--;
            }
        }
        pn((dp[0]+1)%MOD);
    }
    class SegTree{
        int m = 1;
        int[] mx, lazy;
        public SegTree(int n){
            while(m<n)m<<=1;
            mx = new int[m<<1];
            lazy = new int[m<<1];
        }
        void push(int i){
            if(lazy[i] != 0){
                mx[i] = Math.max(mx[i], lazy[i]);
                if(i< m){
                    lazy[i<<1] = Math.max(lazy[i<<1], lazy[i]);
                    lazy[i<<1|1] = Math.max(lazy[i<<1|1], lazy[i]);
                }
                lazy[i] = 0;
            }
        }
        void u(int l, int r, int x){u(l, r, x, 0, m-1, 1);}
        void u(int l, int r, int x, int ll, int rr, int i){
            push(i);
            if(l == ll && r == rr){
                lazy[i] = x;
                push(i);
                return;
            }
            int mid = (ll+rr)>>1;
            if(r <= mid){
                u(l, r, x, ll, mid, i<<1);
                push(i<<1|1);
            }else if(l > mid){
                push(i<<1);
                u(l, r, x, mid+1, rr, i<<1|1);
            }else{
                u(l, mid,x, ll, mid, i<<1);
                u(mid+1, r, x, mid+1, rr, i<<1|1);
            }
            mx[i] = Math.max(mx[i<<1], mx[i<<1|1]);
        }
        int mx(int l, int r){return mx(l, r, 0, m-1, 1);}
        int mx(int l, int r, int ll, int rr, int i){
            push(i);
            if(l == ll && r == rr)return mx[i];
            int mid = (ll+rr)>>1;
            if(r <= mid)return mx(l, r, ll, mid, i<<1);
            else if(l > mid)return mx(l, r, mid+1, rr, i<<1|1);
            else return Math.max(mx(l, mid, ll, mid, i<<1), mx(mid+1, r, mid+1, rr, i<<1|1));
        }
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    void exit(boolean b){if(!b)System.exit(0);}
    //    long IINF = (long)1e15;
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
    int[][] make(int n, int[] from, int[] to, boolean f){
        int[][] g = new int[n][];int[]cnt = new int[n];
        for(int i:from)cnt[i]++;if(f)for(int i:to)cnt[i]++;
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]];
        for(int i = 0; i< from.length; i++){
            g[from[i]][--cnt[from[i]]] = to[i];
            if(f)g[to[i]][--cnt[to[i]]] = from[i];
        }
        return g;
    }
    int find(int[] set, int u){return set[u] = (set[u] == u?u:find(set, set[u]));}
    int digit(long s){int ans = 0;while(s>0){s/=10;ans++;}return ans;}
    long gcd(long a, long b){return (b==0)?a:gcd(b,a%b);}
    int gcd(int a, int b){return (b==0)?a:gcd(b,a%b);}
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