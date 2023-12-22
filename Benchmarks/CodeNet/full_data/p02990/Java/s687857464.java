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
        DBlueAndRedBalls solver = new DBlueAndRedBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBlueAndRedBalls {
        NumberTheory.Mod107 m = new NumberTheory.Mod107();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();

            NumberTheory.ModularNumber<NumberTheory.Mod107> answer = m.create(0);

            for (int i = 1; i <= k; i++) {
                NumberTheory.ModularNumber<NumberTheory.Mod107> red = ways(n - k, i).mult(2).add(ways(n - k, i + 1)).add(ways(n - k, i - 1));
                NumberTheory.ModularNumber<NumberTheory.Mod107> blue = ways(k, i);
                out.println(red.mult(blue));
            }
        }

        NumberTheory.ModularNumber<NumberTheory.Mod107> ways(int n, int k) {
            if (n == 0) {
                return k == 0 ? m.create(1) : m.create(0);
            }
            return m.ncr(n - 1, k - 1);
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

            public NumberTheory.ModularNumber<M> fact(int n) {
                while (factorial.size() <= n) {
                    factorial.add(factorial.get(factorial.size() - 1).mult(factorial.size()));
                }

                return factorial.get(n);
            }

            public NumberTheory.ModularNumber<M> ncr(int n, int r) {
                ASSERT(n >= 0);
                if (r < 0 || n < r)
                    return create(0);
                return fact(n).div(fact(r).mult(fact(n - r)));
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

            public NumberTheory.ModularNumber<M> mult(NumberTheory.ModularNumber<M> other) {
                ASSERT(m.modulus() == other.m.modulus());
                return this.mult(other.value);
            }

            public NumberTheory.ModularNumber<M> mult(long other) {
                return m.create(value * other);
            }

            public NumberTheory.ModularNumber<M> div(NumberTheory.ModularNumber<M> other) {
                ASSERT(m.modulus() == other.m.modulus());
                return this.mult(other.inv());
            }

            public NumberTheory.ModularNumber<M> inv() {
                long g = MOD, x = 0, y = 1;
                for (long r = value; r != 0; ) {
                    long q = g / r;
                    g %= r;

                    long temp = g;
                    g = r;
                    r = temp;

                    x -= q * y;

                    temp = x;
                    x = y;
                    y = temp;
                }

                ASSERT(g == 1);
                ASSERT(y == MOD || y == -MOD);

                return m.create(x);
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

