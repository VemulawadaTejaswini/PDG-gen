import java.util.*;
import java.io.*;
import java.math.*;
 
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
    
    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // for(int i=0; i<n; i++) {a[i]=sc.nextInt();}
        int n=sc.nextInt();
        int a[][] = new int[1<<n][2];
        for(int t=0; t<1<<n; t++) {
            a[t][0] = sc.nextInt();
        }

        for(int t=0,v; t<n; t++) {
            for(int i=0; i<1<<n; i++) {
                if( (i>>t)%2 == 1){
                    v = i^(1<<t);
                    if( a[v][0] > a[i][0]){
                        a[i][1] = a[i][0];
                        a[i][0] = a[v][0];
                        if( a[v][1] > a[i][1])
                            a[i][1] = a[v][1];
                    }
                    else if(a[v][0] > a[i][1])
                                a[i][1] = a[v][0];
                }
            }
        }

        int ans=0;
        for(int t=0; t<1<<n; t++) {
            ans = max(ans, a[t][1]+a[t][0]);
            out.println(ans);
        }
      
        // out.println(ans);
        out.flush();
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }
     
    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }
    
    static boolean bit(long x,int k){
        // weather k-th bit (from right) be one or zero
        return  ( 0 < ( (x>>k) & 1 )  )  ? true:false;
    }    

    class P implements Comparable<P>{
        long x;
        double d;
        P(long x, double d) {
            this.x=x;
            this.d=d;
        } 
          
        public int compareTo(P p){
            return (d - p.d)>0?1:-1;//des
        } 
    }
}
class Reader
{ 
    private BufferedReader x;
    private StringTokenizer st;
    
    public Reader(InputStream in)
    {
        x = new BufferedReader(new InputStreamReader(in));
        st = null;
    }
    public String nextString() throws IOException
    {
        while( st==null || !st.hasMoreTokens() )
            st = new StringTokenizer(x.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException
    {
        return Integer.parseInt(nextString());
    }
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}