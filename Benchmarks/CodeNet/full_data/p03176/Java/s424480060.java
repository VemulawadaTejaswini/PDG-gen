import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        QFlowers solver = new QFlowers();
        solver.solve(1, in, out);
        out.close();
    }

    static class QFlowers {
        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            int n = sc.nextInt();
            int[] height = new int[n];
            int[] beauty = new int[n];
            for (int i = 0; i < n; i++)
                height[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                beauty[i] = sc.nextInt();
            FenwickTree ft = new FenwickTree(n);
            long max = 0;
            for (int i = 0; i < n; i++) {
                long query = beauty[i] + ft.rsq(height[i] - 1);
                max = Math.max(max, query);
                ft.point_update(height[i], query);
            }
            pw.println(max);
        }

        public class FenwickTree {
            int n;
            long[] ft;

            FenwickTree(int size) {
                n = size;
                ft = new long[n + 1];
            }

            long rsq(int b) {
                long max = 0;
                while (b > 0) {
                    max = Math.max(ft[b], max);
                    b -= b & -b;
                }        //min?
                return max;
            }

            void point_update(int k, long val) {
                while (k <= n) {
                    ft[k] = Math.max(val, ft[k]);
                    k += k & -k;
                }        //min?
            }

        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

