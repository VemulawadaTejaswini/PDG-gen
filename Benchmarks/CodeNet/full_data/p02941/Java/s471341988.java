import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CNumbersOnACircle solver = new CNumbersOnACircle();
        solver.solve(1, in, out);
        out.close();
    }

    static class CNumbersOnACircle {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            int[] b = in.nextIntArray(n);


            TreeSet<Pair> ts = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                ts.add(new Pair(b[i], i));
            }
            long ans = 0;
            while (ts.size() > 0) {
                Pair max = ts.pollLast();
                int pos = max.pos;
                if (b[pos] < a[pos]) {
                    out.println(-1);
                    return;
                }
                int neighbors = (b[(pos + 1) % n] + b[(pos + n - 1) % n]);
                if (b[pos] <= neighbors) {
                    out.println(-1);
                    return;
                }
                if ((b[pos] - a[pos]) % neighbors == 0) {
                    ans += (b[pos] - a[pos]) / neighbors;
                    b[pos] = a[pos];
                } else {
                    ans += b[pos] / neighbors;
                    b[pos] %= neighbors;
                    ts.add(new Pair(b[pos], pos));
                }
            }
            out.println(ans);
        }

        class Pair implements Comparable<Pair> {
            int value;
            int pos;

            public Pair(int value, int pos) {
                this.value = value;
                this.pos = pos;
            }

            public int compareTo(Pair pair) {
                if (value != pair.value) {
                    return Integer.compare(value, pair.value);
                }
                return Integer.compare(pos, pair.pos);
            }

        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        public int[] nextIntArray(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

    }
}

