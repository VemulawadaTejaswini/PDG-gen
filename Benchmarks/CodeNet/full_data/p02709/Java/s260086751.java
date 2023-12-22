
import java.io.*;
import java.util.*;

public class Main {
    private void solve() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = i;
        }


        long ans = 0;
        for (int i = 0; i < n; i++) {
            long max = 0;
            int maxj = i;
            for (int j = 0; j < n; j++) {
                long before = (long) Math.abs(b[i] - i) * a[i] + Math.abs(b[j] - j) * a[j];
                long after = (long) Math.abs(b[j] - i) * a[i] + Math.abs(b[i] - j) * a[j];

                long inc = after - before;
                if (inc > max) {
                    max = inc;
                    maxj = j;
                }
            }

            int tmp = b[maxj];
            b[maxj] = b[i];
            b[i] = tmp;
            ans += max;
        }

        out.println(ans);
    }

    private static PrintWriter out;
    private static MyScanner sc;

    private static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        private MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
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
    }

    public static void main(String[] args) {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        sc = new MyScanner();
        new Main().solve();
        out.close();
    }
}
