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
        int a[]=new int[n];
        int b[]=new int[n];
        long v=(long)n*(n+1)/2;
        v=(v+1)/2;

        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        sort(b);

        int low=0,high=n,mid=0;
        int d[]=new int[n+1];

        for(int i=0; i<80; i++) {
            mid = low+high>>1;
            bit bt=new bit(n*2+2);
            long s=0;
            bt.add(n+2,1);
            for (int t=1; t<=n; t++) {
                if(b[mid]<=a[t-1])d[t]=d[t-1]+1;                
                else d[t]=d[t-1]-1;
                s+=bt.sum(d[t]+n+2);
                bt.add(d[t]+n+2,1);
            }
            if(v<=s){ low=mid; }
            else {high=mid;}
        }


        out.println(b[mid]);
        out.flush();
    }


    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }  
}

class bit {
    int b[],n;
    bit(int n){
        this.n = n;
        b = new int[n+1];
    }
    int sum(int i){
        int s = 0;
        while(i > 0){
            s += b[i];
            i -= i&-i;
        }
        return s;   
    }
    void add(int i, int x){
        while(i <= n){
            b[i] += x;
            i += i&-i;
        }
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