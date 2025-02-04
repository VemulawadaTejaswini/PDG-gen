import java.util.*;
import java.io.*; 
import java.math.BigInteger;
import java.text.*;

public class Main{
    long mod = (int)1e9+7, IINF = (long)1e18;
    final int MAX = (int)1e4+1, INF = (int)1e9, root = 3;
    DecimalFormat df = new DecimalFormat("0.00000000");
    double PI = 3.141592653589793238462643383279502884197169399375105820974944;
    static boolean multipleTC = false, memory = false;
    FastReader in;PrintWriter out;
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
        else new Main().run();
    }

    void run() throws Exception{
        in = new FastReader();
        out = new PrintWriter(System.out);
        for(int i = 1, T= (multipleTC)?ni():1; i<= T; i++)solve(i);
        out.flush();
        out.close();
    }
    
    void solve(int TC) throws Exception{
        int n = ni(), ans = 0;
        for(int i = 1; i<= n; i+=2){
            int cnt = 0;
            for(int j = 1; j<= i; j++)if(i%j==0)cnt++;
            if(cnt==8)ans++;
        }
        pn(ans);
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