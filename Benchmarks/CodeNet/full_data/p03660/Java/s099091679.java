import java.io.*;
import java.util.*;


class Main {
    static ArrayList<Integer>[]g;
    static void dfs(int v,int p,int c,int[]d){
        d[v]=c;
        for(int w:g[v])
            if(w!=p)
                dfs(w,v,c+1,d);
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        g=new ArrayList[n];
        Arrays.setAll(g,x->new ArrayList<Integer>());
        for(int i=0;i<n-1;++i){
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            g[a].add(b);
            g[b].add(a);
        }
        int[]d0=new int[n],dn1=new int[n];
        dfs(0,-1,0,d0);
        dfs(n-1,-1,0,dn1);
        int fennec=0,snuke=0;
        for(int i=0;i<n;++i)
            if(d0[i]<=dn1[i])fennec++;
            else snuke++;
        out.println(fennec>snuke?"Fennec":"Snuke");
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
