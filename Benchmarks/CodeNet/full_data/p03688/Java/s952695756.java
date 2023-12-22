import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);
        if (a.length == 0) {
            throw new Error("Empty");
        }

        int max = Arrays.stream(a).max().getAsInt();
        boolean valid = Arrays.stream(a).filter(i -> i == max || i == max - 1).count() == a.length;
        if (!valid) {
            out.println("No");
            return;
        }

        int uniqueCount = (int) Arrays.stream(a).filter(i -> i == max - 1).count();
        if (uniqueCount == 0) {
            // all numbers == max
            // we don't know if this is the true color count or "unique" count
            // true count
            if (n / 2 >= max) {
                out.println("Yes");
                return;
            }
            // "unique" count
            if (max == n - 1) {
                out.println("Yes");
            } else {
                out.println("No");
            }
            return;
        }

        // true count is known == max
        int trueCounts = n - uniqueCount;
        int maxColors = trueCounts / 2 + uniqueCount;
        int minColors = uniqueCount + 1;
        if (minColors <= max && max <= maxColors) {
            out.println("Yes");
        } else {
            out.println("No");
        }
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
