import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GSmallMultiple solver = new GSmallMultiple();
        solver.solve(1, in, out);
        out.close();
    }

    static class GSmallMultiple {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int k = in.nextInt();
            NumberTheory.ModM m = new NumberTheory.ModM(k);
            HashSet<Long> values = new HashSet<>();
            for (long i = 0, v = 1; i < k; i++) {
                values.add(v);
                v = m.mult(v, 10);
            }

            int[] answer = new int[k + 1];
            Arrays.fill(answer, -1);
            answer[0] = -1;
            Queue<Integer> q = new ArrayDeque<>();
            for (long l : values) {
                int i = (int) l;
                q.add(i);
                answer[i] = 1;
            }
            while (!q.isEmpty()) {
                int cur = q.poll();
                for (long l : values) {
                    int next = (int) m.add(cur, l);
                    if (answer[next] < 0) {
                        answer[next] = answer[cur] + 1;
                        q.add(next);
                        if (next == 0) {
                            out.println(answer[next]);
                            return;
                        }
                    }
                }
            }

            out.println(answer[0]);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class NumberTheory {
        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            ArrayList<Long> factorial = new ArrayList<>();
            ArrayList<Long> invFactorial = new ArrayList<>();

            public abstract long modulus();

            public Modulus() {
                super();
                factorial.add(1L);
                invFactorial.add(1L);
            }

            public long add(long a, long b) {
                long v = a + b;
                return v < modulus() ? v : v - modulus();
            }

            public long mult(long a, long b) {
                return (a * b) % modulus();
            }

        }

        public static class ModM extends NumberTheory.Modulus<NumberTheory.ModM> {
            private final long modulus;

            public ModM(long modulus) {
                this.modulus = modulus;
            }

            public long modulus() {
                return modulus;
            }

        }

    }
}

