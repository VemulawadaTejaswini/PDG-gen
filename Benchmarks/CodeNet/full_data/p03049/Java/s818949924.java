import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    //SOLUTION BEGIN
    //This code is not meant for understanding, proceed with caution
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        int n = ni(), ans = 0;
        int[] cnt = new int[4];
        for(int i = 0; i< n; i++){
            String s= n();
            for(int j = 0; j< s.length()-1; j++)if(s.charAt(j)=='A' && s.charAt(j+1)=='B')ans++;
            int ty = 0;
            if(s.charAt(0)=='B')ty+=1;
            if(s.charAt(s.length()-1)=='A')ty+=2;
            cnt[ty]++;
        }
        if(cnt[2]+cnt[3]>0){
            if(cnt[2]>0)ans+=cnt[3]+Math.min(cnt[1], cnt[2]);
            else ans+= cnt[3]-1+(cnt[1]>0?1:0);
        }
        pn(ans);
    }
    class Pair{
        int ty;
        String s;
        public Pair(String S){
            s = S;
            if(s.charAt(0)=='B')ty+=1;
            if(s.charAt(s.length()-1)=='A')ty+=2;
            
        }
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    long mod = (long)998244353, IINF = (long)1e18;
    final int INF = (int)1e9, MX = (int)1e5+1;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.1415926535897932384626433832792884197169399375105820974944, eps = 1e-8;
    static boolean multipleTC = false, memory = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        in = new FastReader();
        out = new PrintWriter(System.out);
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