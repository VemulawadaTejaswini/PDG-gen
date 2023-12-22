import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.Arrays;
public class Main
{
    static class Scanner
    {
        BufferedReader br;
        StringTokenizer tk=new StringTokenizer("");
        public Scanner(InputStream is) 
        {
            br=new BufferedReader(new InputStreamReader(is));
        }
        public int nextInt() throws IOException
        {
            if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
                return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
            tk=new StringTokenizer("");
            return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
                return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
            long a[]=new long[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextLong();
            return a;
        }
    
    
    }
    public static void main(String args[]) throws IOException
    {
        new Thread(null, new Runnable() {
            public void run() {
                try
                {
                    solve();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 26).start();
        
    }
    static class Solver{
        private int n;
        private int l;
        private int x[];
        private int dp[][];
        Solver(int _x[], int _l){
            n=_x.length;
            x=_x.clone();
            l=_l;
            dp=new int[n][20];
            int en=0;
            for(int i=0;i<n;i++){
                while(en<n-1&&x[en+1]-x[i]<=l){
                    en++;
                }
                dp[i][0]=en;
            }
            for(int i=1;i<20;i++){
                dp[n-1][i]=n-1;
                for(int j=n-2;j>=0;j--){
                    dp[j][i]=dp[dp[j][i-1]][i-1];
                }
            }
        }
        int query(int a,int b){
            int ans=0;
            int y=19;
            int st=a;
            while(y>=0){
                if(dp[st][y]<b){
                    ans+=1<<y;
                    st=dp[st][y];
                }
                y--;
            }
            if(st<b)
                ans++;
            return ans;
        }
    }
    static void solve() throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        int x[]=in.nextIntArray(n);
        for(int i=n-1;i>=0;i--)
            x[i]-=x[0];
        int l=in.nextInt();
        Solver s1=new Solver(x,l);
        for(int i=0;i<n;i++)
            x[i]=x[n-1]-x[i];
        Arrays.sort(x);
        Solver s2=new Solver(x,l);
        int q=in.nextInt();
        while(q--!=0){
            int a=in.nextInt(), b=in.nextInt();
            if(a<b)
                out.println(s1.query(a-1, b-1));
            else
                out.println(s2.query(n-a, n-b));
        }
        out.close();
        
    }
}
