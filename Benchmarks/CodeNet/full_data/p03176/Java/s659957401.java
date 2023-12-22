import java.util.*;
import java.io.*;
import java.text.*;
//Solution Credits: Taranpreet Singh
public class Main{
    //SOLUTION BEGIN
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        int n = ni();
        SegTree t = new SegTree(1+n);
        int[] h = new int[n];
        for(int i = 0; i< n; i++)h[i] = ni();
        for(int i = 0; i< n; i++){
            long a = nl();
            t.update(h[i], t.mx(0,h[i]-1)+a);
        }
        pn(t.t[1]);
    }
    class SegTree{
        int m = 1;
        long[] t;
        public SegTree(int n){
            while(m<n)m<<=1;
            t= new long[m<<1];
        }
        void update(int p, long v){
            t[p+=m] = v;
            for(p>>=1; p>0; p>>=1)t[p] = Math.max(t[p<<1], t[p<<1|1]);
        }
        long mx(int l, int r){
            return mx(l,r,0,m-1,1);
        }
        long mx(int l, int r, int ll, int rr, int i){
            if(l==ll && r==rr)return t[i];
            int mid = (ll+rr)>>1;
            if(r<=mid)return mx(l,r,ll,mid,i<<1);
            else if(l>mid)return mx(l,r,mid+1,rr,i<<1|1);
            else return Math.max(mx(l,mid,ll,mid,i<<1), mx(mid+1, r, mid+1, rr, i<<1|1));
        }
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