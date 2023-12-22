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
        TaskAtcoderHitachiB solver = new TaskAtcoderHitachiB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAtcoderHitachiB {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt(), m = in.nextInt();
            int ar[] = new int[a + 1];
            int br[] = new int[b + 1];
            int temp = Integer.MAX_VALUE;
            for (int i = 1; i < a + 1; i++) {
                ar[i] = in.nextInt();
                temp = Math.min(temp, ar[i]);
            }
            long ans = temp;
            temp = Integer.MAX_VALUE;
            for (int i = 1; i < b + 1; i++) {
                br[i] = in.nextInt();
                temp = Math.min(temp, br[i]);
            }
            ans += temp;
            for (int i = 1; i < m + 1; i++) {

                int x = in.nextInt();
                int y = in.nextInt();
                int z = in.nextInt();
                ans = Math.min(ans, ar[x] + br[y] - z);

            }

            out.println(ans);
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

    }
}

