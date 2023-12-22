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
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E1Or2 solver = new E1Or2();
        solver.solve(1, in, out);
        out.close();
    }

    static class E1Or2 {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] x = new int[m];
            int[] y = new int[m];
            int[] z = new int[m];
            for (int i = 0; i < m; i++) {
                x[i] = sc.nextInt() - 1;
                y[i] = sc.nextInt() - 1;
                z[i] = sc.nextInt();
            }
            long ans = 0;
            boolean[] done = new boolean[n + 1];
            for (int i = 0; i < m; i++) {
                if (!done[x[i]] && !done[y[i]]) {
                    ans++;
                }
                done[x[i]] = true;
                done[y[i]] = true;
            }
            for (int i = 0; i < n; i++) {
                if (!done[i]) {
                    ans++;
                }
            }
            out.println(ans);

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

