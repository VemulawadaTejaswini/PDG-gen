import java.util.*;
import java.io.*;

public class Main {

    FastReader in = new FastReader();
    PrintWriter out = new PrintWriter(System.out);
    int N = (int)1e5+1, mod = (int)1e9+7,n,m; 


    void solve(){
        int n = in.ni(), k = in.ni();
        long[] dp = new long[n];
        int[] h = new int[n];
        for(int i=0;i<n;i++){
            h[i] = in.ni();
            dp[i] = (int)1e10;
        }
        dp[0] = 0L;
        for(int i=1;i<n;i++)
            for(int j=Math.max(0,i-k);j<i;j++)
                dp[i] = Math.min(dp[i],dp[j]+Math.abs(h[i]-h[j]));
        out.println(dp[n-1]);
    }

    void run(){
        solve();
        // out.flush();
        out.close();
    }
    public static void main(String[] args) {
        boolean memory = false;
        Thread t=new Thread(null, null, "T", 1<<28) {
            public void run() {
                new Main().run();
            }
        };
        if(memory) t.start();
        else new Main().run();
    }
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
        int ni(){return Integer.parseInt(in.next());}
        long nl(){return Long.parseLong(in.next());}
        double nd(){return Double.parseDouble(in.next());}
    }
    class Edges{
        int u,v,w;
        public Edges(int u,int v,int w){
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }
    void pn(Object o){out.println(o);out.flush();}
    long inv(long a, long b){return 1<a ? b - inv(b%a,a)*b/a : 1;}//a^(-1)%b
    long fe(long a,long b){
        long ans = 1L;
        while(b>0){
            if((b&1)>0)ans=ans*a%mod;
            a = a%mod*a%mod;
            b>>=1;
        }
        // pn("ans = "+ans);
        return ans;
    }
    long gcd(long a,long b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
    class pair{
        int x,y;
        public pair(int f,int s){
            this.x = f;
            this.y = s;
        }
    }
    class triple{
        int i,l,r;
        public triple(int i,int l,int r){
            this.i = i;
            this.l = l;
            this.r = r;
        }
    }
}