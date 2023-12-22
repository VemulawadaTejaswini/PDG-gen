import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.BitSet;
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
        CFactorsOfFactorial solver = new CFactorsOfFactorial();
        solver.solve(1, in, out);
        out.close();
    }

    static class CFactorsOfFactorial {
        static final NumberTheory.Mod107 m = new NumberTheory.Mod107();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            Primes primes = new Primes(n);

            NumberTheory.ModularNumber<NumberTheory.Mod107> answer = m.create(1);
            for (int p : primes.primes) {
                while (p == 0)
                    ;
                answer = answer.mult(1 + count(n, p));
            }

            out.println(answer);
        }

        static int count(int n, int p) {
            int c = 0;
            while (n > 0) {
                n /= p;
                c += n;
            }
            return c;
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

    static class Primes {
        public final BitSet isPrime;
        public final int[] primes;

        public Primes(int N) {
            isPrime = new BitSet(N);
            isPrime.set(2, N + 1);
            for (int p = isPrime.nextSetBit(0); p * p <= N; p = isPrime.nextSetBit(p + 1)) {
                for (int composite = p * 2; composite <= N; composite += p) {
                    isPrime.clear(composite);
                }
            }

            primes = new int[isPrime.cardinality()];
            int p = isPrime.nextSetBit(0);
            for (int i = 0; i < primes.length; i++) {
                primes[i] = p;
                p = isPrime.nextSetBit(p + 1);
            }
        }

    }

    static class NumberTheory {
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

            public NumberTheory.ModularNumber<M> mult(long other) {
                return m.create(value * other);
            }

            public String toString() {
                return String.valueOf(value);
            }

        }

    }
}

