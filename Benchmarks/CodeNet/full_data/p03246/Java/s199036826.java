import java.util.*;
import java.io.*;
 
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
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        int n=sc.nextInt();
        int mx=100000;
        long a[]=new long[mx+1];
        long b[]=new long[mx+1];
        int bt=1<<20;bt--;

        for (int i=0; i<n; i++) {
            if(i%2==0)a[sc.nextInt()]++;
            else b[sc.nextInt()]++;
        }
        for (int i=1; i<mx; i++) {
            a[i]=(a[i])<<20;
            a[i]+=i;
            b[i]=(b[i])<<20;
            b[i]+=i;
        }

        sort(a);
        sort(b);
        long ans=0,A=n/2,B=n/2;
        if(n%2==1)A++;
        if((a[mx]&bt) == (b[mx]&bt)){
            ans=min( A-(a[mx]>>20)+B-(b[mx-1]>>20),A-(a[mx-1]>>20)+B-(b[mx]>>20));
        }
        else {
            ans=A-(a[mx]>>20)+B-(b[mx]>>20);
        }

        out.println(ans);
        out.flush();
    }


    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }  

    static long gcd(long a, long b){
        if(min(a,b) == 0)return max(a,b);
        return gcd(max(a,b) % min(a,b),min(a,b));
    }
}

class P implements Comparable<P>{
    int id, d;
    P(int  id, int d) {
        this.id=id;
        this.d=d;
    }
    public int compareTo(P p){
        return d-p.d; //des
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
