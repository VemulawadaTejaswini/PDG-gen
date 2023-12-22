import java.util.*;
import java.io.*;
import java.text.*;
//Solution Credits: Taranpreet Singh
public class Main{
    //SOLUTION BEGIN
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        int n = ni();
        if(n==1){
            pn(2);
            return;
        }
        int[][] e = new int[n-1][];
        for(int i = 0; i< n-1; i++)e[i] = new int[]{ni()-1, ni()-1};
        int[][] g = makeU(n,e);
        long[][] w = new long[n][2];
        dfs(g, w, 0, -1);
        pn((w[0][0]+w[0][1])%mod);
    }
    void dfs(int[][] g, long[][] w, int u, int p){
        w[u] = new long[]{1,1};
        for(int v:g[u]){
            if(v==p)continue;
            dfs(g,w,v,u);
            w[u][0]*=(w[v][0]+w[v][1])%mod;
            w[u][1]*= w[v][0];
            if(w[u][0]>=mod)w[u][0]%=mod;
            if(w[u][1]>=mod)w[u][1]%=mod;
        }
        
    }
    int[][] makeU(int n, int[][] edge){
        int[][] g = new int[n][];int[] cnt = new int[n];
        for(int i = 0; i< edge.length; i++){cnt[edge[i][0]]++;cnt[edge[i][1]]++;}
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]];
        for(int i = 0; i< edge.length; i++){
            g[edge[i][0]][--cnt[edge[i][0]]] = edge[i][1];
            g[edge[i][1]][--cnt[edge[i][1]]] = edge[i][0];
        }
        return g;
    }
    //SOLUTION END
    void hold()throws Exception{throw new Exception("Hold right there, Sparky!");}
    long mod = (long)1e9+7, IINF = (long)4e18;
    final int INF = (int)2e9, MX = (int)1e6+1;
    DecimalFormat df = new DecimalFormat("0.000000000000000");
    double PI = 3.1415926535897932384626433832792884197169399375105820974944, eps = 1e-8;
    static boolean multipleTC = false, memory = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        in = new FastReader();
        out = new PrintWriter(System.out);
        int T = (multipleTC)?ni():1;
        //Solution Credits: Taranpreet Singh
        pre();for(int i = 1; i<= T; i++)solve(i);
        out.flush();
        out.close();
    }
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
        else new Main().run();
    }
    long gcd(long a, long b){return (b==0)?a:gcd(b,a%b);}
    int gcd(int a, int b){return (b==0)?a:gcd(b,a%b);}
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}
    void p(Object o){out.print(o);}
    void pn(Object o){out.println(o);}
    void pni(Object o){out.println(o);out.flush();}
    String n(){return in.next();}
    String nln(){return in.nextLine();}
    int ni(){return Integer.parseInt(in.next());}
    long nl(){return Long.parseLong(in.next());}
    double nd(){return Double.parseDouble(in.next());}

    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine(){
            String str = "";
            try{   
                str = br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }  
            return str;
        }
    }
}    