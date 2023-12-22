import java.util.*;
import java.io.*;
import java.text.*;
//Solution Credits: Taranpreet Singh
public class Main{
    //SOLUTION BEGIN
    void pre(){}
    void solve(int TC) throws Exception {
        int n = ni(), k = ni();
        StringBuilder[] st = new StringBuilder[k];
        for(int i = 0; i< k; i++)st[i] = new StringBuilder("");
        long[] g = new long[]{nl(), nl(), nl()};
        String t = n();
        for(int i = 0; i< n; i++)st[i%k].append(t.charAt(i));
        long ans = 0;
        for(int i = 0; i< k; i++)ans += play(st[i].toString(), g);
        pn(ans);
    }
    long play(String s, long[] g){
        long[][] ans = new long[3][1+s.length()];
        for(int i = 1; i<= s.length(); i++){
            int w = win(s.charAt(i-1));
            for(int j = 0; j< 3; j++){
                for(int k = 0; k< 3; k++){
                    if(j == k)continue;
                    ans[j][i] = Math.max(ans[j][i], (j == w?g[j]:0)+ans[k][i-1]);
                }
            }
        }
        long max = 0;
        for(int i = 0; i< 3; i++)max = Math.max(max, ans[i][s.length()]);
        return max;
    }
    //rsp
    int win(char ch){
        switch (ch){
            case 'r':return 2;
            case 'p':return 1;
            default:return 0;
        }
    }
    //SOLUTION ENDS
    long mod = (int)1e9+7, IINF = (long)3e18;
    final int MAX = (int)1e6+1, INF = (int)1e9, root = 3;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399375105820974944, eps = 1e-8;
    static boolean multipleTC = false, memory = true;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        long ct = System.currentTimeMillis();
        in = new FastReader();
        out = new PrintWriter(System.out);
        pre();
        int T = (multipleTC)?ni():1;
//      Solution Credits: Taranpreet Singh
        for(int i = 1; i<= T; i++)solve(i);
        out.flush();
        out.close();
        System.err.println(System.currentTimeMillis()-ct);
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
        public FastReader(){br = new BufferedReader(new InputStreamReader(System.in));}
        public FastReader(String s) throws Exception{br = new BufferedReader(new FileReader(s));}
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
            try{str = br.readLine();}catch (IOException e){e.printStackTrace();}
            return str;
        }
    }
}