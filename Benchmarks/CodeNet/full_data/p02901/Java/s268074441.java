import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt(); // chests
        int m = in.nextInt(); // keys
        List<Key> keys = new ArrayList<>();
        for (int i=0; i < m; i++) {
            int keyPrice = in.nextInt();
            int b = in.nextInt();
            int[] cap = new int[b];
            for (int j=0; j < b; j++) {
                cap[j] = in.nextInt() - 1; // to  0-indexed
            }
            Key key = new Key(keyPrice, cap);
            keys.add(key);
        }

        int[] dp = new int[(int) Math.pow(2, n)];
        Arrays.fill(dp, (int) MOD);
        dp[0] = 0;
        for (Key key : keys) {
            int current = 0;
            for (int c : key.cap) {
                current |= (1 << c);
            }
            for (int i=0; i < dp.length; i++) {
                dp[i | current] = Math.min(dp[i | current], dp[i] + key.price);
            }
        }

        out.println(dp[dp.length-1] == (int) MOD ? -1 : dp[dp.length-1]);
    }

    private static boolean isRemovable(Key key, int[] caps) {
        for (int c : key.cap) {
            if (caps[c] < 2)
                return false;
        }
        return true;
    }

    private static boolean check(int[] caps) {
        for (int each : caps) {
            if (each == 0)
                return false;
        }
        return true;
    }

    private static class Key {
        private int price;
        private int[] cap;

        private Key(int price, int[] cap) {
            this.price = price;
            this.cap = cap;
        }

        @Override
        public String toString() {
            return price + " " + Arrays.toString(cap);
        }
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
