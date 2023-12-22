import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CMaximalValue solver = new CMaximalValue();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMaximalValue {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            CMaximalValue.Pair[] a = new CMaximalValue.Pair[n - 1];
            for (int i = 0; i < n - 1; i++) {
                a[i] = new CMaximalValue.Pair(sc.nextInt(), i);
            }
            int[] ans = new int[n];
            Arrays.fill(ans, -1);
            Arrays.sort(a, Comparator.comparingInt(a2 -> a2.x));
            for (int i = 0; i < n - 1; i++) {
                if (ans[a[i].y] == -1) {
                    ans[a[i].y] = a[i].x;
                }
                if (ans[a[i].y + 1] == -1) {
                    ans[a[i].y + 1] = a[i].x;
                }
            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += ans[i];
            }
            out.println(sum);
        }

        static class Pair {
            int x;
            int y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

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

