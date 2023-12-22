import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        ECommonSubsequence solver = new ECommonSubsequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECommonSubsequence {
        private NumberTheory.Mod107 mod = new NumberTheory.Mod107();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            int[] s = new int[n];
            for (int i = 0; i < n; i++)
                s[i] = in.nextInt();
            int[] t = new int[m];
            for (int i = 0; i < m; i++)
                t[i] = in.nextInt();

            NumberTheory.ModularNumber[][] answer = new NumberTheory.ModularNumber[n + 1][m + 1]; // answer[i][j] is the # nonempty using the first i chars and j chars

            for (int i = 0; i <= n; i++)
                for (int j = 0; j <= m; j++)
                    answer[i][j] = mod.create(0);

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (s[i - 1] == t[j - 1]) {
                        answer[i][j] = answer[i][j].add(answer[i - 1][j - 1]).add(1);
                    }
                    answer[i][j] = answer[i][j].add(answer[i - 1][j]);
                    answer[i][j] = answer[i][j].add(answer[i][j - 1]);
                    answer[i][j] = answer[i][j].subtract(answer[i - 1][j - 1]);
                }
            }

            out.println(answer[n][m].add(1));
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
        private static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            ArrayList<NumberTheory.ModularNumber<M>> factorial = new ArrayList<>();

            public abstract long modulus();

            public Modulus() {
                super();
                factorial.add(create(1));
            }

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

            public NumberTheory.ModularNumber<M> add(NumberTheory.ModularNumber<M> other) {
                ASSERT(m.modulus() == other.m.modulus());
                return this.add(other.value);
            }

            public NumberTheory.ModularNumber<M> add(long other) {
                return m.create(value + other);
            }

            public NumberTheory.ModularNumber<M> subtract(NumberTheory.ModularNumber<M> other) {
                ASSERT(m.modulus() == other.m.modulus());
                return this.subtract(other.value);
            }

            public NumberTheory.ModularNumber<M> subtract(long other) {
                return m.create(value - other);
            }

            public String toString() {
                return String.valueOf(value);
            }

        }

    }
}

