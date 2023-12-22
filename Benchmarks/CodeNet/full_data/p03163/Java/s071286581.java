import java.util.*;
import java.io.*;

public class Main {

    FastReader in = new FastReader();
    PrintWriter out = new PrintWriter(System.out);
    int N = (int)5e5+5, mod = (int)1e9+7; 
    

    void solve(){
        int n = in.ni(), w = in.ni();
        int[] val = new int[n+1], wei = new int[n+1];
        long[] dp = new long[w+1];
        for(int i=1;i<=n;i++){
            wei[i] = in.ni();
            val[i] = in.ni();
        }
        for(int i=1;i<=n;i++)
            for(int j=w;j>=1;j--)
                if(j>=wei[i])
                    dp[j] = Math.max(dp[j],val[i]+dp[j-wei[i]]); 
        out.println(dp[w]);
    }



    void run(){
        solve();
        // out.flush();
        out.close();
    }
    public static void main(String[] args) {
        new Main().run();
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
        int nextInt(){return Integer.parseInt(in.next());}
        long nextLong(){return Long.parseLong(in.next());}
        double nextDouble(){return Double.parseDouble(in.next());}
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
        int f,s;
        public pair(int f,int s){
            this.f = f;
            this.s = s;
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