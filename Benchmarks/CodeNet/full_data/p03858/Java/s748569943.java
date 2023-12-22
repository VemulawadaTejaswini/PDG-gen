import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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
    static ArrayList<Point> p;
    static HashMap<Integer,ArrayList<Integer>> hp,hs;
    static HashSet<Integer> g[];
    static long ans=0;
    static boolean vis[];
    static void sol(int nd){
        if(vis[nd])
            return;
        vis[nd]=true;
        ans+=g[nd].size();
        for(int x:g[nd])
            sol(x);
    }
    static void solve() throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        p=new ArrayList<>();
        int a=in.nextInt()-1;
        int b=in.nextInt()-1;
        for(int i=0;i<n;i++){
            p.add(new Point(in.nextInt(), in.nextInt()));
        }
        hp=new HashMap<>();
        hs=new HashMap<>();
        vis=new boolean[n+1];
        for(int i=0;i<n;i++){
            Point pp=p.get(i);
            if(!hp.containsKey(pp.x+pp.y)){
                hp.put(pp.x+pp.y, new ArrayList<>());
            }
            hp.get(pp.x+pp.y).add(i);
            
            if(!hs.containsKey(pp.x-pp.y)){
                hs.put(pp.x-pp.y, new ArrayList<>());
            }
            hs.get(pp.x-pp.y).add(i);
        }
        for(ArrayList<Integer> arr:hp.values()){
            Collections.sort(arr,(x,y)->Integer.compare(p.get(x).x, p.get(y).x));
        }
        for(ArrayList<Integer> arr:hs.values()){
            Collections.sort(arr,(x,y)->Integer.compare(p.get(x).x, p.get(y).x));
        }
        g=new HashSet[n];
        for(int i=0;i<n;i++){
            g[i]=new HashSet<>();
        }
        int d=Math.abs(p.get(a).x-p.get(b).x)+Math.abs(p.get(a).y-p.get(b).y);
        for(int i=0;i<n;i++){
            Point pp=p.get(i);
            int sm=pp.x+d+pp.y;
            if(hp.containsKey(sm)){
                ArrayList<Integer> arr=hp.get(sm);
                int ind=Collections.binarySearch(arr, pp.x, (aa,bb)->(Integer.compare(p.get(aa).x,bb)));
                if(ind<0){
                    ind=-ind-1;
                }
                while(ind<arr.size()){
                    Point ppp=p.get(arr.get(ind));
                    if(ppp.x>pp.x+d)
                        break;
                    g[i].add(arr.get(ind));
                    ind++;
                }       
            }
            sm=pp.x-d+pp.y;
            if(hp.containsKey(sm)){
                ArrayList<Integer> arr=hp.get(sm);
                int ind=Collections.binarySearch(arr, pp.x-d, (aa,bb)->(Integer.compare(p.get(aa).x,bb)));
                if(ind<0){
                    ind=-ind-1;
                }
                while(ind<arr.size()){
                    Point ppp=p.get(arr.get(ind));
                    if(ppp.x>pp.x)
                        break;
                    g[i].add(arr.get(ind));
                    ind++;
                }       
            }
            
            
            
            
            
            int ss=pp.x+d-pp.y;
            if(hs.containsKey(ss)){
                ArrayList<Integer> arr=hs.get(ss);
                int ind=Collections.binarySearch(arr, pp.x, (aa,bb)->(Integer.compare(p.get(aa).x,bb)));
                if(ind<0){
                    ind=-ind-1;
                }
                while(ind<arr.size()){
                    Point ppp=p.get(arr.get(ind));
                    if(ppp.x>pp.x+d)
                        break;
                    g[i].add(arr.get(ind));
                    ind++;
                }       
            }
            ss=pp.x-d-pp.y;
            if(hs.containsKey(ss)){
                ArrayList<Integer> arr=hs.get(ss);
                int ind=Collections.binarySearch(arr, pp.x-d, (aa,bb)->(Integer.compare(p.get(aa).x,bb)));
                if(ind<0){
                    ind=-ind-1;
                }
                while(ind<arr.size()){
                    Point ppp=p.get(arr.get(ind));
                    if(ppp.x>pp.x)
                        break;
                    g[i].add(arr.get(ind));
                    ind++;
                }       
            }
            
        }
        sol(a);
        out.println(ans/2);
        out.close();
        
    }
}
