import java.io.*;
import java.util.*;


class Main {
    static void add(ArrayList<Long>[]g,int s,int t,int cap){
        g[s].add((long)t<<32|cap);
    }
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int h=sc.nextInt();
        int w=sc.nextInt();
        String[]s=new String[h];
        for(int i=0;i<h;++i)s[i]=sc.next();
        int nv=2+h+w+2*h*w;
        ArrayList<Long>[]g=new ArrayList[nv];
        Arrays.setAll(g,x->new ArrayList<Long>());
        //row/col->vertex
        int I=10000000;
        for(int i=0;i<h;++i)
            for(int j=0;j<w;++j){
                int src=2+i;
                int dst=2+h+w+2*(i*w+j);
                add(g,src,dst,I);
            }
        for(int i=0;i<h;++i)
            for(int j=0;j<w;++j){
                int src=2+h+j;
                int dst=2+h+w+2*(i*w+j);
                add(g,src,dst,I);
            }
        // vertex->row/col
        for(int i=0;i<h;++i)
            for(int j=0;j<w;++j){
                int src=2+h+w+2*(i*w+j)+1;
                int dst=2+i;
                add(g,src,dst,I);
            }
        for(int i=0;i<h;++i)
            for(int j=0;j<w;++j){
                int src=2+h+w+2*(i*w+j)+1;
                int dst=2+h+j;
                add(g,src,dst,I);
            }
        //vertex
        int sv=-1,tv=-1;
        for(int i=0;i<h;++i)
            for(int j=0;j<w;++j){
                if(s[i].charAt(j)=='S')sv=2+h+w+2*(i*w+j)+1;
                if(s[i].charAt(j)=='T')tv=2+h+w+2*(i*w+j)+1;
            }
        for(int i=0;i<h;++i)
            for(int j=0;j<w;++j){
                if(s[i].charAt(j)=='.')continue;
                int src=2+h+w+2*(i*w+j);
                int dst=2+h+w+2*(i*w+j)+1;
                if(src==sv||dst==tv)add(g,src,dst,I);
                else add(g,src,dst,1);
            }
        // s->S
        add(g,0,sv,I);
        // T->t
        add(g,tv,1,I);
        long minCut=Dinic.maximumFlow(g,0,1);
        out.println(minCut>h*w?-1:minCut);
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

/* 参考: http://www.prefield.com/algorithm/graph/dinic.html */
class Dinic{
    //#define RESIDUE(s,t) (capacity[s][t]-flow[s][t])
    static final long INF=1L<<55;
    static long augment(ArrayList<Long>[] g, long[][] capacity, long[][] flow,
                       int[] level, boolean[] finished, int u, int t, long cur) {
        if (u == t || cur == 0) return cur;
        if (finished[u]) return 0;
        finished[u] = true;
        for(long e:g[u]){
            int dst=(int)(e>>>32);
            int wei=(int)e;
            if (level[dst] > level[u]) {
                long f = augment(g, capacity, flow, level, finished,
                                 dst, t, Math.min(cur, capacity[u][dst]-flow[u][dst]));
                if (f > 0) {
                    flow[u][dst] += f; flow[dst][u] -= f;
                    finished[u] = false;
                    return f;
                }
            }
        }
        return 0;
    }
    // g[i][j] = (dest)<<32|(cap)
    static long maximumFlow(ArrayList<Long>[] g, int s, int t) {
        int n = g.length;
        long[][]flow=new long[n][n], cap=new long[n][n]; // adj. matrix
        for(int u=0;u<n;++u)
            for(long e:g[u]){
                int dst=(int)(e>>>32);
                int wei=(int)e;
                cap[u][dst] += wei;
            }
        
        long total = 0;
        for (boolean cont = true; cont; ) {
            cont = false;
            int[] level=new int[n];
            Arrays.fill(level, -1);
            level[s] = 0; // make layered network
            Queue<Integer> q=new ArrayDeque<Integer>();
            q.add(s);
            for (int d = n; q.size()>0 && level[q.peek()] < d; ) {
                int u=q.poll();
                if (u == t) d = level[u];
                for(long e:g[u]){
                    int dst=(int)(e>>>32);
                    int wei=(int)e;
                    if(cap[u][dst]>flow[u][dst] && level[dst] == -1) {
                        q.add(dst);
                        level[dst]=level[u]+1;
                    }
                }
            }
            boolean[] finished=new boolean[n];// make blocking flows
            for (long f = 1; f > 0; ) {
                f = augment(g, cap, flow, level, finished, s, t, INF);
                if (f == 0) break;
                total += f; cont = true;
            }
        }
        return total;
    }
}
