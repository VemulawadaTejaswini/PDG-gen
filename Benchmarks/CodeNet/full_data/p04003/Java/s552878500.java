import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeMap;
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
                    System.out.println(52/0);
                }
            }
        }, "1", 1 << 26).start();
        
    }
    static class Pair{
        long x;
        int y;
        Pair(long a,int b){
            x=a;y=b;
        }
    }
    static HashMap<Long, ArrayList<Pair>> g;
    static HashMap<Long, Integer> d;
    static HashMap<Long, Boolean> vis;
    static void ensure(long nd){
        if(!g.containsKey(nd)){
            g.put(nd, new ArrayList<>());
            d.put(nd, Integer.MAX_VALUE);
            vis.put(nd, Boolean.FALSE);
        }
    }
    static long make(long u, long v){
        return (u<<20l)|v;
    }
    static void addEdge(int u,int v,int c){
        long u0=make(u,0);
        long v0=make(v,0);
        long uc=make(u,c);
        long vc=make(v,c);
        ensure(u0);
        ensure(v0);
        ensure(uc);
        ensure(vc);
        addEdgeInternal(u0, uc, 1);
        addEdgeInternal(v0, vc, 1);
        addEdgeInternal(uc, vc, 0);
    }
    static void addEdgeInternal(long u, long v, int wt){
        g.get(u).add(new Pair(v,wt));
        g.get(v).add(new Pair(u, wt));
    }
    static void solve() throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        int m=in.nextInt();
        g=new HashMap<>();
        d=new HashMap<>();
        vis=new HashMap<>();
        for(int i=0;i<m;i++){
            int u=in.nextInt();
            int v=in.nextInt();
            int c=in.nextInt();
            addEdge(u, v, c);
        }
        d.put(make(1,0), 0);
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.y, b.y));
        pq.add(new Pair(make(1,0),0));
        while(!pq.isEmpty()){
            Pair nd=pq.poll();
            if(vis.get(nd.x))
                continue;
            vis.put(nd.x, Boolean.TRUE);
            for(Pair edg:g.get(nd.x)){
                int nextWeight=nd.y+edg.y;
                if(nextWeight<d.get(edg.x)){
                    d.put(edg.x,nextWeight);
                    
                    pq.add(new Pair(edg.x, nextWeight));
                }
            }
        }
        out.println((d.get(make(n,0))==Integer.MAX_VALUE)?-1:(d.get(make(n,0)))/2);
        out.close();
        
    }
}
