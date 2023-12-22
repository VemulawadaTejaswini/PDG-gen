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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSemiCommonMultiple solver = new DSemiCommonMultiple();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSemiCommonMultiple {
        long gcd(long a, long b) {
            return (a % b == 0) ? b : gcd(b, a % b);
        }

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            long lcm = 1;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt() / 2;
                lcm = (a[i] * lcm) / gcd(a[i], lcm);
            }
            if (lcm > m) {
                out.println(0);
                return;
            }
            long alpha = ((m / lcm) - 1) / 2;
            out.println(alpha + 1);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
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

