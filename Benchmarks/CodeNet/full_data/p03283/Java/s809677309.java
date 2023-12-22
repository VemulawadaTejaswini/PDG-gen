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
        int close[] = new int[510];
        int op=0;


        int mem[][]=new int[502][502];

        for (int i=0; i<m; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            mem[b][a]++;
        }
        for (int i=1; i<501; i++) {
            close[i] += close[i-1];
        }

        for (int i=0; i<501; i++) {
            for (int t=500; 0<=t ; t--) {
                mem[i][t]+=mem[i][t+1];
            }
        }

       
        for (int i=0; i<q; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt(), ans=0;
            for (int t=b; a<=t; t--) {
                ans+=mem[t][a];
            }
            out.println(ans);
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