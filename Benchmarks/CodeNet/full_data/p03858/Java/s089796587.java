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
import java.util.Map;
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
                }
            }
        }, "1", 1 << 26).start();
        
    }
    static ArrayList<Point> p;
    static TreeMap<Integer,Integer> hp,hs;
    static HashMap<Point,Integer> rmp,rms;
    static ArrayList<Integer> ap,as;
    static ArrayList<Point> g[];
    static long ans=0;
    static boolean vis[];
    static void sol(int nd){
        hp.remove(rmp.get(p.get(nd)));
        hs.remove(rms.get(p.get(nd)));
        for(int i=0;i<4;i++){
            if(i<2){
                Point pp=g[nd].get(i);
                if(pp.x>pp.y)
                    continue;
                ans+=(pp.y-pp.x+1);
                Map.Entry<Integer,Integer> e;
                while((e=hp.ceilingEntry(pp.x))!=null&&e.getKey()<=pp.y){
                    sol(e.getValue());
                    int ky=e.getKey();
                    int vl=e.getValue();
                    e=null;
                    hp.remove(ky);
                    hs.remove(rms.get(p.get(vl)));
                }
            }
            else{
                Point pp=g[nd].get(i);
                if(pp.x>pp.y)
                    continue;
                ans+=(pp.y-pp.x+1);
                Map.Entry<Integer,Integer> e;
                while((e=hs.ceilingEntry(pp.x))!=null&&e.getKey()<=pp.y){
                    sol(e.getValue());
                    int ky=e.getKey();
                    int vl=e.getValue();
                    e=null;
                    hs.remove(ky);
                    hp.remove(rmp.get(p.get(vl)));
                }
            }
        }
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
        hp=new TreeMap<>();
        hs=new TreeMap<>();
        ap=new ArrayList<>();
        as=new ArrayList<>();
        rmp=new HashMap<>();
        rms=new HashMap<>();
        for(int i=0;i<n;i++){
            ap.add(i);
            as.add(i);
        }
        Collections.sort(ap, (aa,bb)->{
           Point p1=p.get(aa);
           Point p2=p.get(bb);
           if(p1.x+p1.y<p2.x+p2.y)
               return -1;
           else if(p1.x+p1.y>p2.x+p2.y)
               return 1;
           else if(p1.x<p2.x)
               return -1;
           else if(p1.x>p2.x)
               return 1;
           else if(p1.y<p2.y)
               return -1;
           else if(p1.y>p2.y)
               return 1;
           return 0;
        });
        
        Collections.sort(as, (aa,bb)->{
           Point p1=p.get(aa);
           Point p2=p.get(bb);
           if(p1.x-p1.y<p2.x-p2.y)
               return -1;
           else if(p1.x-p1.y>p2.x-p2.y)
               return 1;
           else if(p1.x<p2.x)
               return -1;
           else if(p1.x>p2.x)
               return 1;
           else if(p1.y<p2.y)
               return -1;
           else if(p1.y>p2.y)
               return 1;
           return 0;
        });
        for(int i=0;i<n;i++){
            hp.put(i,ap.get(i));
            hs.put(i, as.get(i));
            rmp.put(p.get(ap.get(i)), i);
            rms.put(p.get(as.get(i)), i);
        }
        
        g=new ArrayList[n];
        for(int i=0;i<n;i++){
            g[i]=new ArrayList<>();
        }
        
        int d=Math.abs(p.get(a).x-p.get(b).x)+Math.abs(p.get(a).y-p.get(b).y);
        for(int i=0;i<n;i++){
            Point pp=p.get(i);
            int sm=pp.x+d+pp.y;
            Point pst;
            int st=0,en=n-1,ans=-1;
            while(st<=en){
                int mid=(st+en)>>1;
                Point pc=p.get(ap.get(mid));
                if(pc.x+pc.y<sm){
                    st=mid+1;
                }
                else if(pc.x+pc.y>sm){
                    en=mid-1;
                }
                else if(pc.x<pp.x){
                    st=mid+1;
                }
                else if(pc.x>pp.x+d){
                    en=mid-1;
                }
                else{
                    ans=mid;
                    en=mid-1;
                }
            }
            if(ans!=-1)
                pst=new Point(ans,ans);
            else
                pst=new Point(1000000000,-1);
            
            st=0;en=n-1;ans=-1;
            while(st<=en){
                int mid=(st+en)>>1;
                Point pc=p.get(ap.get(mid));
                if(pc.x+pc.y<sm){
                    st=mid+1;
                }
                else if(pc.x+pc.y>sm){
                    en=mid-1;
                }
                else if(pc.x<pp.x){
                    st=mid+1;
                }
                else if(pc.x>pp.x+d){
                    en=mid-1;
                }
                else{
                    ans=mid;
                    st=mid+1;
                }
            }
            if(ans!=-1)
                pst.y=ans;
            g[i].add(pst);

            
            sm=pp.x-d+pp.y;
            Point pen;
            st=0;en=n-1;ans=-1;
            while(st<=en){
                int mid=(st+en)>>1;
                Point pc=p.get(ap.get(mid));
                if(pc.x+pc.y<sm){
                    st=mid+1;
                }
                else if(pc.x+pc.y>sm){
                    en=mid-1;
                }
                else if(pc.x<pp.x-d){
                    st=mid+1;
                }
                else if(pc.x>pp.x){
                    en=mid-1;
                }
                else{
                    ans=mid;
                    en=mid-1;
                }
            }
            if(ans!=-1)
                pen=new Point(ans,ans);
            else
                pen=new Point(1000000000,-1);
            
            st=0;en=n-1;ans=-1;
            while(st<=en){
                int mid=(st+en)>>1;
                Point pc=p.get(ap.get(mid));
                if(pc.x+pc.y<sm){
                    st=mid+1;
                }
                else if(pc.x+pc.y>sm){
                    en=mid-1;
                }
                else if(pc.x<pp.x-d){
                    st=mid+1;
                }
                else if(pc.x>pp.x){
                    en=mid-1;
                }
                else{
                    ans=mid;
                    st=mid+1;
                }
            }
            if(ans!=-1)
                pen.y=ans;
            g[i].add(pen);

            
            
            
            
            
            sm=pp.x+d-pp.y;
            Point sst;
            st=0;en=n-1;ans=-1;
            while(st<=en){
                int mid=(st+en)>>1;
                Point pc=p.get(as.get(mid));
                if(pc.x-pc.y<sm){
                    st=mid+1;
                }
                else if(pc.x-pc.y>sm){
                    en=mid-1;
                }
                else if(pc.x<=pp.x){
                    st=mid+1;
                }
                else if(pc.x>=pp.x+d){
                    en=mid-1;
                }
                else{
                    ans=mid;
                    en=mid-1;
                }
            }
            if(ans!=-1)
                sst=new Point(ans,ans);
            else
                sst=new Point(1000000000,-1);
            
            st=0;en=n-1;ans=-1;
            while(st<=en){
                int mid=(st+en)>>1;
                Point pc=p.get(as.get(mid));
                if(pc.x-pc.y<sm){
                    st=mid+1;
                }
                else if(pc.x-pc.y>sm){
                    en=mid-1;
                }
                else if(pc.x<=pp.x){
                    st=mid+1;
                }
                else if(pc.x>=pp.x+d){
                    en=mid-1;
                }
                else{
                    ans=mid;
                    st=mid+1;
                }
            }
            if(ans!=-1)
                sst.y=ans;
            g[i].add(sst);

            
            sm=pp.x-d-pp.y;
            Point sen;
            st=0;en=n-1;ans=-1;
            while(st<=en){
                int mid=(st+en)>>1;
                Point pc=p.get(as.get(mid));
                if(pc.x-pc.y<sm){
                    st=mid+1;
                }
                else if(pc.x-pc.y>sm){
                    en=mid-1;
                }
                else if(pc.x<=pp.x-d){
                    st=mid+1;
                }
                else if(pc.x>=pp.x){
                    en=mid-1;
                }
                else{
                    ans=mid;
                    en=mid-1;
                }
            }
            if(ans!=-1)
                sen=new Point(ans,ans);
            else
                sen=new Point(1000000000,-1);
            
            st=0;en=n-1;ans=-1;
            while(st<=en){
                int mid=(st+en)>>1;
                Point pc=p.get(as.get(mid));
                if(pc.x-pc.y<sm){
                    st=mid+1;
                }
                else if(pc.x-pc.y>sm){
                    en=mid-1;
                }
                else if(pc.x<=pp.x-d){
                    st=mid+1;
                }
                else if(pc.x>=pp.x){
                    en=mid-1;
                }
                else{
                    ans=mid;
                    st=mid+1;
                }
            }
            if(ans!=-1)
                sen.y=ans;
            g[i].add(sen);
        }
        sol(a);
        out.println(ans/2);
        out.close();
        
    }
}
