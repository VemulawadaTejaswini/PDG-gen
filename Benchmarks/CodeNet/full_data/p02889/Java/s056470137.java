import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    private FastScanner in = new FastScanner(System.in);
    private PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}

    void solve() throws Exception{
        int N = in.nextInt(), M = in.nextInt(), L = in.nextInt();
        ArrayList<ArrayList<Edge>> G = new ArrayList<>();
        long[][] g = new long[N][N];
        long INF = Long.MAX_VALUE / 2;
        for(int i = 0; i < N; i++){
            //G.add(new ArrayList<>());
            Arrays.fill(g[i], INF);
        }
        for(int i = 0; i < M; i++){
            int from = in.nextInt()-1;
            int to = in.nextInt()-1;
            long cost = in.nextLong();
            /*
            G.get(from).add(new Edge(from, to, cost));
            G.get(to).add(new Edge(to, from, cost));
            */
            g[from][to] = cost;
            g[to][from] = cost;
        }

        long[][] res = warshallFloyd(g, INF);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(new ArrayList<>());
            for(int j = 0; j < N; j++){
                if(j == i) continue;
                if(res[i][j] <= L) list.get(i).add(j);
            }
        }

        int[][] num = new int[N][N];
        for(int i = 0; i < N; i++){
            Arrays.fill(num[i], Integer.MAX_VALUE / 2);
            ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
            queue.addLast(i);
            num[i][i] = -1;

            while(!queue.isEmpty()){
                int v = queue.removeFirst();
                //out.println("v : " + v);
                for(int next : list.get(v)){
                    if(num[i][next] > num[i][v] + 1){
                        num[i][next] = num[i][v] + 1;
                        queue.addLast(next);
                    }
                }
            }

            //out.println(num[t] == Integer.MAX_VALUE / 2 ? "-1" : num[t]);

        }

        int Q = in.nextInt();
        for(int i = 0; i < Q; i++){
            int s = in.nextInt()-1, t = in.nextInt()-1;
            out.println(num[s][t] == Integer.MAX_VALUE / 2 ? "-1" : num[s][t]);
        }
    }

    class Edge implements Comparable<Edge>{
        int from;
        int to;
        long cost;
        public Edge(int f, int t, long c){
            from = f;to = t;cost = c;
        }
        @Override
        public int compareTo(Edge o) {
            return Long.compare(this.cost, o.cost);
        }
    }

    long[][] warshallFloyd(long[][] g, long INF){
        int N = g.length;
        long[][] res = new long[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                res[i][j] = g[i][j];
            }
        }

        for(int k = 0; k < N; k++){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(res[i][k] == INF || res[k][j] == INF) continue;
                    res[i][j] = Math.min(res[i][j], res[i][k] + res[k][j]);
                }
            }
        }

        return res;
    }

    //end solve

    public static void main(String[] args) throws Exception {
        new Main().m();
    }

    private void m() throws Exception {
        solve();
        out.flush();
    }

    static class FastScanner {
        Reader input;

        FastScanner() {this(System.in);}
        FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}

        int nextInt() {return (int) nextLong();}

        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }

        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }

        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[] nextIntArrayDec(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }

        public int[] nextIntArray1Index(int n) {
            int[] res = new int[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextInt();
            }
            return res;
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long[] nextLongArrayDec(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public long[] nextLongArray1Index(int n) {
            long[] res = new long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }

        public double[] nextDoubleArray(int n) {
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextDouble();
            }
            return res;
        }
    }
}