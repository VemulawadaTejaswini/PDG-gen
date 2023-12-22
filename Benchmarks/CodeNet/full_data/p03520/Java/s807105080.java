import java.util.*;
import java.io.*;


class Main {
    static ArrayList<Integer>[]g;
    static ArrayList<Integer>[]num;
    static int[][]p;
    static long[]s;
    static long[]ans;
    static int cent;
    static int dfs(int v,int pp){
        int t=1;
        for(int i=0;i<g[v].size();++i){
            int w=g[v].get(i);
            if(w==pp)continue;
            int u=dfs(w,v);
            if(2*u!=g.length)
                ans[num[v].get(i)]=(s[v]-s[w])/(2*u-g.length);
            else
                cent=num[v].get(i);
            p[v][i]=u;
            t+=u;
        }
        return t;
    }
    static long dfs3(int v,int pp,int forb){
        long t=0;
        for(int i=0;i<g[v].size();++i){
            int w=g[v].get(i);
            if(w==pp)continue;
            t+=dfs3(w,v,forb);
            //System.err.println("v="+v+" i="+i+" p="+p[v][i]+" s="+s[num[v].get(i)]);
            if(forb!=num[v].get(i))
                t+=p[v][i]*ans[num[v].get(i)];
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
        s=new long[n];
        for(int i=0;i<n;++i)s[i]=Long.parseLong(sc.next());
        p=new int[n][];
        for(int i=0;i<n;++i)
            p[i]=new int[g[i].size()];
        cent=-1;
        ans=new long[n-1];
        dfs(0,-1);
        if(cent>=0)
            ans[cent]=(s[0]-dfs3(0,-1,cent))/(n/2);
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
