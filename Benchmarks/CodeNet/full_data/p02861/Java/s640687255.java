import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 998244353;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int[][] cities = new int[n][2];

        for (int i = 0; i < n; i++) {
            int[] city = new int[2];
            city[0] = in.nextInt();
            city[1] = in.nextInt();
            cities[i] = city;
        }

        double totalLength = dfs(cities, new Stack<>());
        out.println(totalLength / (double) factorial(n));
    }

    private static int factorial(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }

    private static double dfs(int[][] cities, Stack<Integer> picked) {
        double length = 0;

        if (picked.size() == cities.length) {
            for (int i = 0; i < cities.length - 1; i++) {
                List<Integer> list = new ArrayList<>(picked);
                length += length(cities[list.get(i)], cities[list.get(i+1)]);
            }
            return length;
        }

        for (int i = 0; i < cities.length; i++) {
            if (!picked.contains(i)) {
                picked.push(i);
                length += dfs(cities, picked);
                picked.pop();
            }
        }

        return length;
    }

    private static double length(int[] a, int[] b) {
        return Math.sqrt(Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2));
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
