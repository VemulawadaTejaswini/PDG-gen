import java.io.*;
import java.util.*;
public class Main implements Runnable{
    long fact[];
    private void solve()throws IOException{
        fact=new long[maxn+1];
        fact[0]=1;
        for(int i=1;i<=maxn;i++)
            fact[i]=(fact[i-1]*i)%mod;
        int r1=nextInt();
        int c1=nextInt();
        int r2=nextInt();
        int c2=nextInt();
        long x=C(r2+c2+2,c2+1);
        long y=C(r1+c2+1,c2+1);
        long z=C(r2+c1+1,c1);
        long z2=C(r1+c1,c1);
        long ans=(x-y+mod)%mod;
        ans=(ans+z2)%mod;
        ans=(ans-z+mod)%mod;
        out.println(ans);
    }
    long C(int n,int r){
        long ret=fact[n];
        ret=(ret*modinv(fact[r]))%mod;
        ret=(ret*modinv(fact[n-r]))%mod;
        return ret;
    }
    long modinv(long x){
        return modpow(x,mod-2);
    }
    long modpow(long a,long b){
        if(b==0)
            return 1;
        long x=modpow(a,b/2);
        x=(x*x)%mod;
        if(b%2==1)
            return (x*a)%mod;
        return x;
    } 

     
    ///////////////////////////////////////////////////////////

    final long mod=(long)(1e9+7);
    final int inf=(int)(1e9+1);
    final int maxn=(int)(2e6+2);
    final long lim=(long)(1e18);

    public void run(){
        try{
            br=new BufferedReader(new InputStreamReader(System.in));
            st=null;
            out=new PrintWriter(System.out);

            solve();

            // int t=nextInt();
            // for(int i=1;i<=t;i++){
            //     // out.print("Case #"+i+": ");
            //     solve();
            // }

            br.close();
            out.close();
        }catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
    public static void main(String args[])throws IOException{
        new Main().run();
    } 
    int max(int ... a){
        int ret=a[0];
        for(int i=1;i<a.length;i++)
        ret=Math.max(ret,a[i]);
        return ret;
    }
    int min(int ... a){
        int ret=a[0];
        for(int i=1;i<a.length;i++)
        ret=Math.min(ret,a[i]);
        return ret;
    }
    void debug(Object ... a){
        System.out.print("> ");
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.println();
    }
    void debug(int a[]){debuga(Arrays.stream(a).boxed().toArray());}
    void debug(long a[]){debuga(Arrays.stream(a).boxed().toArray());}
    void debuga(Object a[]){
        System.out.print("> ");
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.println();
    }
    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;
    String nextToken()throws IOException{
        while(st==null || !st.hasMoreTokens())
        st=new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    String nextLine()throws IOException{
        return br.readLine();
    }
    int nextInt()throws IOException{
        return Integer.parseInt(nextToken());
    }
    long nextLong()throws IOException{
        return Long.parseLong(nextToken());
    }
    double nextDouble()throws IOException{
        return Double.parseDouble(nextToken());
    }
}