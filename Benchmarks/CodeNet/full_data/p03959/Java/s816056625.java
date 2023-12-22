import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTwoAlpinists solver = new CTwoAlpinists();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTwoAlpinists {
        private NumberTheory.Modulus<NumberTheory.Mod107> mod = new NumberTheory.Mod107();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int[] maxBefore = new int[n + 1]; // maxBefore[0] == 0

            for (int i = 0; i < n; i++) {
                maxBefore[i + 1] = in.nextInt();
            }

            int[] maxAfter = new int[n + 1]; // maxAfter[n] == 0

            for (int i = 0; i < n; i++) {
                maxAfter[i] = in.nextInt();
            }

            int[] min = new int[n];
            Arrays.fill(min, 1);
            int[] max = new int[n];
            Arrays.fill(max, Integer.MAX_VALUE);

            for (int i = 0; i < n; i++) {
                if (maxBefore[i + 1] != maxBefore[i]) {
                    min[i] = Math.max(min[i], maxBefore[i + 1]);
                }
                max[i] = Math.min(max[i], maxBefore[i + 1]);

                if (maxAfter[i] != maxAfter[i + 1]) {
                    min[i] = Math.max(min[i], maxAfter[i]);
                }
                max[i] = Math.min(max[i], maxAfter[i]);
            }

            NumberTheory.ModularNumber<NumberTheory.Mod107> answer = mod.create(1);
            for (int i = 0; i < n; i++) {
                answer = answer.mult(max[i] - min[i] + 1);
            }

            out.println(answer);
        }

    }

    static class NumberTheory {
        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            public abstract long modulus();

            public NumberTheory.ModularNumber<M> create(long value) {
                return new NumberTheory.ModularNumber(value, this);
            }

        }

        public static class Mod107 extends NumberTheory.Modulus<NumberTheory.Mod107> {
            public long modulus() {
                return 1_000_000_007L;
            }

        }

        public static class ModularNumber<M extends NumberTheory.Modulus<M>> {
            public final long value;
            public final M m;
            public final long MOD;

            public ModularNumber(long value, M m) {
                this.m = m;
                this.MOD = m.modulus();
                this.value = (value % MOD + MOD) % MOD;
            }

            public NumberTheory.ModularNumber<M> mult(long other) {
                return m.create(value * other);
            }

            public String toString() {
                return String.valueOf(value);
            }

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
}

