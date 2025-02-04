import java.io.*;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        String s = in.next();
        AtomicLong ans = new AtomicLong();

        dfs(s, new boolean[s.length()-1], 0, ans);
        out.println(ans.get());
    }

    private static void dfs(String s, boolean[] plus, int current, AtomicLong ans) {
        if (current == plus.length) {
            ans.addAndGet(value(s, plus));
            return;
        }

        plus[current] = true;
        dfs(s, plus, current+1, ans);
        plus[current] = false;
        dfs(s, plus, current+1, ans);
    }

    private static long value(String s, boolean[] plus) {
        long ret = 0;
        int left = 0;
        for (int i = 0; i < plus.length; i++) {
            if (plus[i]) {
                ret += Long.parseLong(s.substring(left, i+1));
                left = i+1;
            }
        }
        ret += Long.parseLong(s.substring(left));
        return ret;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
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
