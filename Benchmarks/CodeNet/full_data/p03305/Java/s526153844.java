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
        int m=sc.nextInt();
        int start = sc.nextInt() - 1, goal = sc.nextInt() - 1;

        long d[] = new long[n];
        long g[] = new long[n];
        fill(d, 1L<<62);
        fill(g, 1L<<62);
        d[start] = 0;
        g[goal] = 0;
        
        ArrayList<Long> lise[] = new ArrayList[n];
        ArrayList<Long> liss[] = new ArrayList[n];
        long sf=1L<<20;
        for (int i=0; i<n; i++)lise[i] =  new ArrayList<Long>();
        for (int i=0; i<n; i++)liss[i] =  new ArrayList<Long>();
        for (int i=0; i<m; i++) {
            int a=sc.nextInt()-1,
                b=sc.nextInt()-1;
              long  q=sc.nextLong(),
                    w=sc.nextLong();
                lise[a].add( q*sf + b);
                lise[b].add( q*sf + a);
                liss[a].add( w*sf + b);
                liss[b].add( w*sf + a);
        }

        PriorityQueue<P> que = new PriorityQueue<P>();
        que.add(new P(start, d[start]));

        while(!que.isEmpty()) {
            P p = que.poll();   
            int cr = p.id;
            // db(cr);
            if(d[cr] < p.d) continue;
            long or, es; int to;
            for( int t=0; t<lise[cr].size(); t++ ){
                or = lise[cr].get(t);
                to = (int)( or & (sf-1));
                es = or>>20;
                if( d[to] > d[cr] + es) {
                    d[to] = d[cr] + es;
                    que.add(new P(to, d[to]));
                }
            }
        }
        // db(d);

        que.clear();
        que.add(new P(goal, g[goal]));
        while(!que.isEmpty()) {
            P p = que.poll();
            int cr = p.id;
            // db(cr);
            if(g[cr] < p.d) continue;
            long or, es; int to;
            for( int t=0; t<liss[cr].size(); t++ ){
                or = liss[cr].get(t);
                to = (int)( or & (sf-1));
                es = or>>20;
                // db(to,es);
                if( g[to] > g[cr] + es) {
                    g[to] = g[cr] + es;
                    que.add(new P(to, g[to]));
                }
            }
        }
        P p[] = new P[n];
        for( int t=0; t<n; t++ ){
            p[t] = new P(t, d[t]+g[t] );
        }
        sort(p);
        long M=1000000000000000L;
        int x=0;

        for( int t=0; t<n; t++ ){
            while(p[x].id<=t-1)x++;
            out.println(M - p[x].d);
        }

        // out.println();
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
}

class P implements Comparable<P>{
        long d;
        int id;
        P(int  id, long d) {
            this.id=id;
            this.d=d;
        } 
          
        public int compareTo(P p){
            long r = d - p.d;
            if(r==0)return 0;
            else return r > 0 ? 1 : -1;//des
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