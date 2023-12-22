import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRainFlowsIntoDams solver = new DRainFlowsIntoDams();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRainFlowsIntoDams {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] A = new int[n];
            long tot = 0;
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                A[i] = a;
                tot += a;
            }
            tot /= 2;
            long tempTot = 0;
            for (int i = 0; i < n; i += 2) {
                tempTot += A[i];
            }
            long[] res = new long[n];
            res[0] = tempTot - tot;
            for (int i = 0; i < n - 1; i++) {
                res[i + 1] = A[i] - res[i];
            }
            StringBuilder sb = new StringBuilder();
            for (long i : res) {
                sb.append(2 * i).append(" ");
            }
            out.println(sb);
        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
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

