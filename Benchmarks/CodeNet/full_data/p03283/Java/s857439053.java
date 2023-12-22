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
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        int n=sc.nextInt();
        int m=sc.nextInt();
        int q=sc.nextInt();
        int d[] = new int[510];
        int rc[] = new int[510];
        int open[] = new int[510];
        int close[] = new int[510];
        int op=0;

        // ArrayList<Integer> l[]=new ArrayList[510];
        // ArrayList<Integer> rmap[]=new ArrayList[510];

        // for (int i=0; i<l.length; i++) {
        //     l[i]=new ArrayList<Integer>();
        //     r[i]=new ArrayList<Integer>();
        // }

        for (int i=0; i<m; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            open[a]++;
            close[b]++;
        }

        for (int i=1; i<510; i++) {
            rc[i]+=rc[i-1]+close[i];
        }

        for (int i=1; i<510; i++) {
            d[i]+=op;
            op+=open[i];
            op-=close[i];
        }
       
        for (int i=0; i<q; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            out.println(rc[b]-rc[a-1]-d[a]);
        }

        // out.println(ans);
        out.flush();
    }


    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
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