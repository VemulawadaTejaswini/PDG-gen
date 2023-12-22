import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        Solver s = new Solver();
        s.solve(1, in, out);
        out.close();
    }

    static class Solver {

        void solve(int test_case, InputReader in, PrintWriter out) throws IOException {
            long x = in.nextLong();
            long y = in.nextLong();
            long m = x;
            int ans = 0;
            while (x <= y) {
                x *= 2;
//                out.println(x);
                ans++;
            }
            out.println(ans);
        }
    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = null;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
