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

    private static void solve() {
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);

        Set<Integer> oddSet = new HashSet<>();
        Set<Integer> evenSet = new HashSet<>();
        for (int i = 0; i <= n / 2; i++) {
            if (i * 2 == n) continue;
            evenSet.add(a[i * 2]);
            if (i * 2 + 1 == n) continue;
            oddSet.add(a[i * 2 + 1]);
        }

//        out.println("evens before sort: " + evenSet.toString());
//        out.println("odds before sort: " + oddSet.toString());

        Arrays.sort(a);

        int[] sortedOdd = new int[n / 2];
        int[] sortedEven = new int[n - (n / 2)];
        for (int i = 0; i <= n / 2; i++) {
            if (i * 2 == n) continue;
            sortedEven[i] = a[i * 2];
            if (i * 2 + 1 == n) continue;
            sortedOdd[i] = a[i * 2 + 1];
        }

//        out.println("evens after sort: " + Arrays.toString(sortedEven));
//        out.println("odds after sort: " + Arrays.toString(sortedOdd));

        int a1 = 0, a2 = 0;
        for (int i : sortedOdd) {
            if (!oddSet.contains(i)) {
                a1++;
            }
        }
        for (int i : sortedEven) {
            if (!evenSet.contains(i)) {
                a2++;
            }
        }

        out.println(Math.max(a1, a2));
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
