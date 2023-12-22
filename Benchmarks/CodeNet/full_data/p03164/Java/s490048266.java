import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    static HashMap<Pair, Long> hm;
    static int[] w, v;
    static int n;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        int W = sc.nextInt();
        w = new int[n];
        v = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        hm = new HashMap<>();
        out.println(dp(0, W));
        out.flush();
        out.close();

    }

    static long dp(int i, int remW) {
        if (i == n || remW == 0) return 0;
        Pair cur = new Pair(i, remW);
        if (hm.containsKey(cur)) return hm.get(cur);
        long max = dp(i + 1, remW);
        if (remW - w[i] >= 0) max = Math.max(max, v[i] + dp(i + 1, remW - w[i]));
        hm.put(cur, max);
        return max;
    }

    static class Pair implements Comparable<Pair> {
        int i, remW;

        public Pair(int i, int remW) {
            this.i = i;
            this.remW = remW;
        }

        @Override
        public int compareTo(Pair o) {
            return o.remW == remW ? i - o.i : remW - o.remW;
        }
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        public Scanner(String file) throws Exception {
            br = new BufferedReader(new FileReader(file));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public char nextChar() throws IOException {
            return next().charAt(0);
        }

        public Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

        public void waitForInput() throws InterruptedException {
            Thread.sleep(3000);
        }

        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

    }
}