import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CNextPrime solver = new CNextPrime();
        solver.solve(1, in, out);
        out.close();
    }

    static class CNextPrime {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int max = 100004;
            int a = in.nextInt();
            boolean[] isPrime = new boolean[max];
            Arrays.fill(isPrime, true);
            for (int i = 2; i < Math.sqrt(max); i++) {
                if (isPrime[i]) {
                    for (int j = 2; j * i < max; j++) {
                        isPrime[i * j] = false;
                    }
                }
            }
            for (int i = a; i < max; i++) {
                if (isPrime[i]) {
                    out.println(i);
                    return;
                }
            }
            throw new RuntimeException("Not found");
        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

