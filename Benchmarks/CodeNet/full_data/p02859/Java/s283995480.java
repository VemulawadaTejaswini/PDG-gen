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
public class Solution {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int t = in.nextInt();
            int case_no = 1;
            while (t-- > 0) {
                int n = in.nextInt();
                long[] a = new long[n + 1];

                for (int i = 01; i < n + 1; i++) {
                    a[i] = in.nextLong();
                }
                StringBuffer sb = new StringBuffer();
                int ans = 1, min = 0;
                for (int i = 0; i < n; i++) {
                    int k = i + 1;
                    int te = 0;
                    while (k >= 1) {

                        for (int j = 1; j <= i + 1; j++) {
                            if (a[j] >= k)
                                te++;
                        }
                        if (k > te) k--;
                        else
                            break;
                    }
                    sb.append(k + " ");
                }
                out.println("Case #" + (case_no) + ": " + sb.toString());
                case_no++;
            }
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

