import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static class Work {
        private final int days;
        private final int reward;

        private Work(int days, int reward) {
            this.days = days;
            this.reward = reward;
        }
    }

    private static void solve() {
        int n = in.nextInt();
        int m = in.nextInt();

        List<Work> works = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            works.add(new Work(in.nextInt(), in.nextInt()));
        }

        works.sort(Comparator.comparingInt(w -> w.days));

        long ans = 0;
        int nextWork = 0;
        Queue<Work> bestWorks = new PriorityQueue<>((w1, w2) -> w2.reward - w1.reward);
        for (int i = 1; i <= m; i++) {
            for (; nextWork < n && works.get(nextWork).days <= i; nextWork++) {
                bestWorks.add(works.get(nextWork));
            }

            Work best = bestWorks.poll();
            if (best == null) continue;

            ans += best.reward;
        }

        out.println(ans);
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
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
}
