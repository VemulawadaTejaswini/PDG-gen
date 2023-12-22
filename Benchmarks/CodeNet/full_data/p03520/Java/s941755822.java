import java.util.*;
import java.io.*;


class Main {
    static ArrayList<Integer>[]g;
    static ArrayList<Integer>[]num;
    static int[][]p;
    static int dfs(int v,int pp){
        int t=1;
        for(int i=0;i<g[v].size();++i){
            int w=g[v].get(i);
            if(w==pp)continue;
            int s=dfs(w,v);
            p[v][i]=s;
            t+=s;
        }
        return t;
    }
    static void dfs2(int v,int pp,int c){
        for(int i=0;i<g[v].size();++i){
            int w=g[v].get(i);
            if(w==pp){
                p[v][i]=g.length-c;
                continue;
            }
            dfs2(w,v,p[v][i]);
        }
    }
    static long dfs3(int v,int pp,long[]s,int forb){
        long t=0;
        for(int i=0;i<g[v].size();++i){
            int w=g[v].get(i);
            if(w==pp)continue;
            t+=dfs3(w,v,s,forb);
            //System.err.println("v="+v+" i="+i+" p="+p[v][i]+" s="+s[num[v].get(i)]);
            if(forb!=num[v].get(i))
                t+=p[v][i]*s[num[v].get(i)];
        }
        //System.err.println("dfs3 " + v + " " + pp + " " + forb + " ->" + t);
        return t;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=Integer.parseInt(sc.next());
        g=new ArrayList[n];
        num=new ArrayList[n];
        Arrays.setAll(g,x->new ArrayList<Integer>());
        Arrays.setAll(num,x->new ArrayList<Integer>());
        int[]c=new int[n-1],d=new int[n-1];
        int[]ci=new int[n-1],di=new int[n-1];        
        for(int i=0;i<n-1;++i){
            int a=Integer.parseInt(sc.next())-1;
            int b=Integer.parseInt(sc.next())-1;
            ci[i]=g[a].size();
            di[i]=g[b].size();
            num[a].add(i);
            num[b].add(i);
            g[a].add(b);
            g[b].add(a);
            c[i]=a;
            d[i]=b;
        }
        long[]s=new long[n];
        for(int i=0;i<n;++i)s[i]=Long.parseLong(sc.next());
        p=new int[n][];
        for(int i=0;i<n;++i)
            p[i]=new int[g[i].size()];
        dfs(0,-1);
        dfs2(0,-1,-1);
        int cent=-1;
        long[]ans=new long[n-1];
        for(int i=0;i<n-1;++i){
            int u=p[c[i]][ci[i]];
            int v=p[d[i]][di[i]];
            if(u!=v)
                ans[i]=(s[c[i]]-s[d[i]])/(u-v);
            else
                cent=i;
        }
        long[]w=new long[n];
        if(cent>=0)
            ans[cent]=(s[c[cent]]-dfs3(c[cent],-1,ans,cent))/(n/2);
        for(long a:ans)out.println(a);
        out.close();
    }
    // http://codeforces.com/blog/entry/7018
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
