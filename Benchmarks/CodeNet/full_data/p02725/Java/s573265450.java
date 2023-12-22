import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author EDGE
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task160C solver = new Task160C();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task160C {
        public void solve(int testNumber, FastReader in, PrintWriter out) {

            int n = in.nextInt(), k = in.nextInt();
            int[] a = in.nextIntArray(k);

            long ans = 0;

            for (int i = 0; i < k - 1; i++) {
                if (i == k - 2)
                    ans += Math.min(a[i + 1] - a[i], n + a[0] - a[i + 1]);
                else
                    ans += Math.min(a[i + 1] - a[i], n - a[i + 1] + a[i]);

            }

            out.print(ans);

        }

    }

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
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

    }
}

