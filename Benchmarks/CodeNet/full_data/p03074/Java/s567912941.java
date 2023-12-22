import java.util.*;
import java.io.*;

public class Main {

    FastReader in = new FastReader();
    PrintWriter out = new PrintWriter(System.out);
    int N = (int)1e5+1, mod = (int)1e9+7,n,m; 


    void solve(){
        int n = in.ni(), k = in.ni();
        char[] a = in.next().toCharArray();
        ArrayList<Integer> s = new ArrayList<>(), e = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]=='0'){
                int j = i;
                while(j<a.length && a[j]=='0')j++;
                s.add(i);
                e.add(j-1);
                i = j-1;
            }
        }
        int ans = 0;
        if(s.size()<=k)ans = a.length;
        else{
            ans = Math.max(ans,a.length-1-(e.get(s.size()-k-1)+1)+1);
        }
        for(int i=0;i<s.size()-k;i++){
            if(i==0){
                ans = Math.max(ans,s.get(i+k));
            }
            else{
                ans = Math.max(ans,s.get(i+k)-1-(e.get(i-1)+1)+1);
            }
        }

        out.println(ans);
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