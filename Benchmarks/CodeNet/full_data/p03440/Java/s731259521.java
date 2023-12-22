
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    private static final long oo = 1L << 58;

    private static class Forest implements Comparable<Forest> {
        PriorityQueue<Long> pq;

        public Forest() {
            pq = new PriorityQueue<>();
            pq.add(oo);
        }

        public void add(long cost) {
            pq.add(cost);
        }

        public long peek() {
            return pq.peek();
        }

        public long poll() {
            return pq.poll();
        }

        public int size() {
            return pq.size();
        }

        public boolean merge(Forest forest) {
            poll();
            forest.poll();
            if (size() > forest.size()) {
                for (long x : forest.pq) add(x);
                return true;
            } else for (long x : pq) forest.add(x);
            return false;
        }

        @Override
        public int compareTo(Forest forest) {
            return Long.compare(pq.peek(), forest.pq.peek());
        }

        @Override
        public String toString() {
            return pq.peek() + " " + pq;
        }
    }

    private static ArrayList<Integer>[] g;
    private static long[] a;
    private static int[] CC;
    private static int CCs;

    private static void dfs(int u) {
        CC[u] = CCs;
        for (int v : g[u])
            if (CC[v] == -1)
                dfs(v);
    }

    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt(), M = sc.nextInt();
        a = new long[N];
        for (int i = 0; i < N; i++)
            a[i] = sc.nextInt();
        g = new ArrayList[N];
        for (int i = 0; i < N; i++)
            g[i] = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            g[u].add(v);
            g[v].add(u);
        }
        CC = new int[N];
        Arrays.fill(CC, -1);
        CCs = 0;
        for (int node = 0; node < N; node++) {
            if (CC[node] == -1) {
                dfs(node);
                CCs++;
            }
        }
        Forest[] forests = new Forest[CCs];
        for (int forest = 0; forest < CCs; forest++)
            forests[forest] = new Forest();
        for (int node = 0; node < N; node++)
            forests[CC[node]].add(a[node]);
        PriorityQueue<Forest> allForests = new PriorityQueue<>();
        for (int forest = 0; forest < CCs; forest++)
            allForests.add(forests[forest]);
        long cost = 0;
        while (allForests.size() > 1) {
            Forest a = allForests.poll(), b = allForests.poll();
            if (a.peek() == oo || b.peek() == oo) {
                out.println(-1);
                out.flush();
                out.close();
                return;
            }
            cost += a.peek() + b.peek();
            boolean mergedA = a.merge(b);
            if (mergedA) allForests.add(a);
            else allForests.add(b);
        }
        out.println(cost);
        out.flush();
        out.close();
    }

    private static class MyScanner {
        StringTokenizer st;
        BufferedReader br;

        public MyScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public MyScanner(String filename) throws IOException {
            br = new BufferedReader(new FileReader(new File(filename)));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}
