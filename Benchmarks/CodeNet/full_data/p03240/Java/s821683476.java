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
        CPyramid solver = new CPyramid();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPyramid {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            long[] x = new long[n];
            long[] y = new long[n];
            long[] h = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
                h[i] = sc.nextInt();
            }
            for (int cx = 0; cx < 101; cx++) {
                loop:
                for (int cy = 0; cy < 101; cy++) {
                    long infto = Integer.MAX_VALUE;
                    for (int i = 0; i < n; i++) {
                        if (h[i] == 0) {
                            infto = Math.min(infto, Math.abs(cx - x[i]) + Math.abs(cy - y[i]));
                        }
                    }
                    long poss = -1;
                    for (int i = 0; i < n; i++) {
                        long sum = Math.abs(cx - x[i]) + Math.abs(cy - y[i]);
                        if (poss == -1) {
                            if (h[i] == 0) {
                                continue;
                            }
                            poss = h[i] + sum;
                        } else {
                            if (h[i] == 0) {
                                continue;
                            }
                            if (h[i] + sum != poss) {
                                continue loop;
                            }
                        }
                    }
                    if (poss <= infto) {
                        out.println(cx + " " + cy + " " + Math.max(0, poss));
                        return;
                    }
                }
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

