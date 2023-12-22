import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();
        int MAX = 2500;
        long INF = 1L << 60;
        ArrayList<ArrayList<Edge>> G = new ArrayList<>();
        long[] C = new long[N];
        long[] D = new long[N];
        for(int i = 0; i < N; i++){
            G.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            G.get(u).add(new Edge(v,new Pair(a,b)));
            G.get(v).add(new Edge(u,new Pair(a,b)));
        }
        for(int i = 0; i < N; i++){
            C[i] = sc.nextInt();
            D[i] = sc.nextInt();
        }
        if(S >= MAX) S = MAX;
        long[][] dp = new long[N][MAX+1];
        for(int i = 0; i < N; i++){
            Arrays.fill(dp[i],INF);
        }
        PriorityQueue<QueueItem> q = new PriorityQueue<>();
        dp[0][S] = 0;
        q.add(new QueueItem(0,0,S));
        while (q.size() > 0) {
            QueueItem p = q.poll();
            long time = p.t;
            int v = p.v;
            long s = p.s;
            if (time > dp[v][(int)s]) continue;
    
            // 補充
            long ns2 = Math.min(MAX,s + C[v]);
            long ntime2 = time + D[v];
            if(dp[v][(int)ns2] > ntime2){
                dp[v][(int)ns2] = ntime2;
                q.add(new QueueItem(ntime2,v,ns2));
            }
            // 辺を通る
            for (Edge e : G.get(v)){
                if(s < e.p.m){
                    continue;
                }
                int nv = e.v;
                long ns = s-e.p.m;
                long ntime = time + e.p.t;
                if(dp[nv][(int)ns] > ntime){
                    dp[nv][(int)ns] = ntime;
                    q.add(new QueueItem(ntime,nv,ns));
                }
            }
        }
        for (int v = 1; v < N; v++){
            long ans = INF;
            for(int s = 0; s <= MAX; s++){
                ans = Math.min(ans,dp[v][s]);
            }
            pw.println(ans);
        }
        pw.flush();
    }
}

class Pair{
    long m,t;
    public Pair(long m, long t){
        this.m = m;
        this.t = t;
    }
}

class Edge{
    int v;
    Pair p;
    public Edge(int v, Pair p){
        this.v = v;
        this.p = p;
    }
}

class QueueItem implements Comparable<QueueItem>{
    long t,s;
    int v;
    public QueueItem(long t, int v, long s){
        this.t = t;
        this.v = v;
        this.s = s;
    }
    
    public int compareTo(QueueItem q){
        if(this.t < q.t){
            return -1;
        }else if(this.t > q.t){
            return 1;
        }else{
            return 0;
        }
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
