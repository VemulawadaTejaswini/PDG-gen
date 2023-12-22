import java.io.*;
import java.util.*;

/**
 * @author:26019
 */
public class Main {

    public static void main(String[] args) throws Exception {
        solve();
    }

    private static long gcd(long x, long y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

    private static int cal(int x) {
        int res = 1;
        while (x != 1) {
            if ((x & 1) == 1) {
                x = x * 3 + 1;
            } else {
                x >>= 1;
            }
            res++;
        }
        return res;
    }

    private static void solve() throws Exception {
        FastScanner cin = new FastScanner();
        long t = 1;
        while (t-- > 0) {
            int n = cin.nextInt();
            int[] arr = cin.readArray(n);
            Arrays.sort(arr);
            int res = 0;
            for (int i = 0; i < n; i++) {
                int k = i + 2;
                for (int j = i + 1; j < n; j++) {
                    while (k < n && arr[k] < arr[i] + arr[j]) {
                        k++;
                    }
                    res += k - j - 1;
                }
            }
            System.out.println(res);
        }
    }


    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        FastScanner() throws IOException {
        }

        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        private void close() {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
