import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    // private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int q = in.nextInt();
        char[] ch = in.next().toCharArray();

        // special case
        if (q == 2 || q == 5) {
            long ans = 0;
            for (int i = 0; i < ch.length; i++) {
                int c = ch[i] - '0';
                if (c % q == 0) {
                    ans += (i + 1);
                }
            }
            out.println(ans);
            return;
        }

        int[] counts = new int[q];
        counts[0]++;
        int power10 = 1;
        int current = 0;
        long ans = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            int c = ch[i] - '0';
            c = multiply(c, power10, q);
            current = add(current, c, q);

            ans += counts[current];
            counts[current]++;

            power10 = multiply(power10, 10, q);
        }

        out.println(ans);
    }

    // a + b (mod m)
    private static int add(int a, int b, int mod) {
        return (a + b) % mod;
    }

    // a * b (mod m)
    private static int multiply(int a, int b, int mod) {
        return (a * b) % mod;
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
