import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    //SOLUTION BEGIN
    //This code is not meant for understanding, you have been warned.
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        int n = ni();
        int[][] e = new int[n-1][];
        for(int i = 0; i< n-1; i++)e[i] = new int[]{ni()-1, ni()-1, ni()%2};
        int[][][] g = makeUS(n, e);
        int[] color = new int[n];
        color(g, color, 0, -1);
        for(int i:color)pn(i);
    }
    void color(int[][][] g, int[] col, int u, int p){
        for(int[] v:g[u]){
            if(v[0]==p)continue;
            col[v[0]] = col[u]^v[1];
            color(g, col, v[0], u);
        }
    }
    int[][][] makeUS(int n, int[][] edge){
        int[][][] g = new int[n][][];int[] cnt = new int[n];
        for(int i = 0; i< edge.length; i++){cnt[edge[i][0]]++;cnt[edge[i][1]]++;}
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]][];
        for(int i = 0; i< edge.length; i++){
            g[edge[i][0]][--cnt[edge[i][0]]] = new int[]{edge[i][1], edge[i][2]};
            g[edge[i][1]][--cnt[edge[i][1]]] = new int[]{edge[i][0], edge[i][2]};
        }
        return g;
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    long mod = (long)998244353, IINF = (long)1e18;
    final int INF = (int)1e9, MX = (int)5e5+1;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-8;
    static boolean multipleTC = false, memory = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        in = new FastReader();
        out = new PrintWriter(System.out);
        //Solution Credits: Taranpreet Singh
        int T = (multipleTC)?ni():1;
        pre();for(int t = 1; t<= T; t++)solve(t);
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
            String str = "";
            try{   
                str = br.readLine();
            }catch (IOException e){
                throw new Exception(e.toString());
            }  
            return str;
        }
    }
}