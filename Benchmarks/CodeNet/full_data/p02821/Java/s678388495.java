import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.stream.Stream;
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
        AtCoder149E solver = new AtCoder149E();
        solver.solve(1, in, out);
        out.close();
    }

    static class AtCoder149E {
        int n;
        int m;
        Long[] a;
        long[] t = new long[1_000_01];

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            if (true)
                return;
            a = toArray(in.nextArrLong(n));
            t = new long[n + 1];

            Arrays.sort(a, (a1, a2) -> Long.compare(a2, a1));
            long res = solveMe();
            out.println(res);
            //out.print("Case #"+ testNumber + ": ");
        }

        private long solveMe() {
            Arrays.sort(a, (a1, a2) -> Long.compare(a2, a1));
            for (int i = 0; i < n; i++) t[i + 1] = t[i] + a[i];
            long total = 0;
            int left = 0;
            int right = 2_000_00;
            AtCoder149E.Tuple tuple;
            long lastTarget = left;
            int currentNb = 0;

            while (left <= right) {
                int mid = (left + right) / 2;
                tuple = new AtCoder149E.Tuple(0, 0L); //solveMe_calculateSumAndNPairsThatHaveAtLeast(mid);
                if ((int) tuple.elements[0] > m) {
                    left = mid + 1;
                    lastTarget = mid;
                } else {
                    right = mid - 1;
                    total = (long) tuple.elements[1];
                    currentNb = (int) tuple.elements[0];
                }
            }

            total += (long) (m - currentNb) * lastTarget;
            return total;
        }

        private Long[] toArray(long[] a) {
            return Arrays.stream(a).boxed().toArray(Long[]::new);
        }

        public static class Tuple implements Comparable<AtCoder149E.Tuple> {
            Object[] elements;

            public Tuple(Object... elements) {
                this.elements = elements;
            }

            public String toString() {
                return Arrays.deepToString(elements);
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                AtCoder149E.Tuple tuple = (AtCoder149E.Tuple) o;
                return Arrays.equals(elements, tuple.elements);
            }

            public int hashCode() {
                return Objects.hash(elements);
            }

            public int compareTo(AtCoder149E.Tuple t2) {
                if (t2.elements.length != elements.length)
                    throw new RuntimeException("Elements has 2 different sizes!");
                if (getClass() != t2.getClass())
                    throw new RuntimeException("Elements are not of the same class!");
                for (int i = 0; i < elements.length; i++) {
                    if (!(elements[i] instanceof Comparable)) {
                        throw new RuntimeException("Element is not comparable!");
                    }
                    int val = ((Comparable) elements[i]).compareTo(t2.elements[i]);
                    if (val != 0)
                        return val;
                }
                return 0;
            }

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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] nextArrLong(int n) {
            long[] a = new long[n];
            for (int i = 0; i < a.length; i++)
                a[i] = nextLong();
            return a;
        }

    }
}

