import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    //SOLUTION BEGIN
    //Into the Hardware Mode
    void pre() throws Exception{}
    void solve(int TC)throws Exception{
        int n = ni();long k = nl();
        int[] a = new int[n];
        for(int i = 0; i< n; i++)a[i] = ni();
        long ans = 0;
        for(int i = 0; i< n; i++){
            for(int j = i+1; j< n; j++){
                if(a[i]>a[j]){
                    ans += k;
                    if(ans >= mod)ans -= mod;
                }
            }
        }
        int[] c = new int[2001];
        for(int i = 0; i< n; i++)c[a[i]]++;
        long sum = c[0];
        long ap = sum(k)%mod;
        for(int i = 1; i<= 2000; i++){
            ans += c[i]*sum*ap;
            ans %= mod;
            sum += c[i];
        }
        pn(ans);
    }
    long sum(long n){
        return (n*n-n)/2;
    }
    long sort(int[] a){
        if(a.length==1)return 0;
        int n = a.length;
        int[] left = Arrays.copyOfRange(a, 0, n/2), right = Arrays.copyOfRange(a, n/2, n);
        long ans = 0;
        ans += sort(left);
        ans += sort(right);
        int j = 0, k = 0;
        for(int i = 0; i< n; i++){
            if(j == left.length)a[i] = right[k++];
            else if(k == right.length){
                ans += k;
                a[i] = left[j++];
            }else{
                if(left[j] < right[k]){
                    ans += k;
                    a[i] = left[j++];
                }else{
                    ans += left.length-j;
                    a[i] = right[k++];
                }
            }
        }   
        return ans;
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    void exit(boolean b){if(!b)System.exit(0);}
    long IINF = (long)1e18, mod = (long)1e9+7;
    final int INF = (int)1e9, MX = (int)2e6+5;
    DecimalFormat df = new DecimalFormat("0.00000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-6;
    static boolean multipleTC = false, memory = false, fileIO = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        if(fileIO){
            in = new FastReader("input.txt");
            out = new PrintWriter("output.txt");
        }else {
            in = new FastReader();
            out = new PrintWriter(System.out);
        }
        //Solution Credits: Taranpreet Singh
        int T = (multipleTC)?ni():1;
        pre();
        for(int t = 1; t<= T; t++)solve(t);
        out.flush();
        out.close();
    }
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
        else new Main().run();
    }
    
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