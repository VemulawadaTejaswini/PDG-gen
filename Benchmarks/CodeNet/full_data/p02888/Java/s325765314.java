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
        int n = in.nextInt();
        int[] l = in.nextIntArray(n);
        Arrays.sort(l);
        // out.println("Sorted " + Arrays.toString(l));

        long ans = 0;
        for (int i=0; i < n-1; i++) {
            for (int j=i+1; j < n; j++) {
                int a = l[j];
                int b = l[i];
                int max = Arrays.binarySearch(l, a+b-1);
                int min = Arrays.binarySearch(l, a-b+1);
                if (max < 0) {
                    max = ~max;
                    max--;
                }
                if (min < 0) {
                    min = ~min;
                }
                // out.println("Checking a: " + a + " (index " + j + "), b: " + b + " (index " + i + "), min index: " + min + ", max index: " + max);

                min = Math.max(j+1, min);
                max = Math.max(j, max);
                int toAdd = max - min + 1;
                //out.println("Adding " + toAdd);
                /*
                for (int k=min; k <= max; k++) {
                    int c = l[k];
                    int[] t = new int[3];
                    t[0] = a;
                    t[1] = b;
                    t[2] = c;
                    Arrays.sort(t);
                    out.println("Triangle " + Arrays.toString(t));

                }

                 */
                ans += Math.max(0, toAdd);
            }
        }
        out.println(ans);
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
