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
        DColoringDominoes solver = new DColoringDominoes();
        solver.solve(1, in, out);
        out.close();
    }

    static class DColoringDominoes {
        NumberTheory.Mod107 m = new NumberTheory.Mod107();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            char[] s1 = in.next().toCharArray();
            char[] s2 = in.next().toCharArray();

            ArrayList<Boolean> vertical = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s1[i] == s2[i]) {
                    vertical.add(true);
                } else {
                    vertical.add(false);
                    i++;
                }
            }

            NumberTheory.ModularNumber<NumberTheory.Mod107> answer = m.create(1);
            if (vertical.get(0)) {
                answer = answer.mult(3);
            } else {
                answer = answer.mult(6);
            }
            for (int i = 1; i < vertical.size(); i++) {
                boolean cur = vertical.get(i);
                boolean prev = vertical.get(i - 1);
                int ways = 0;
                if (cur) {
                    if (prev) {
                        ways = 2;
                    } else {
                        ways = 1;
                    }
                } else {
                    if (prev) {
                        ways = 2;
                    } else {
                        ways = 3;
                    }
                }
                answer = answer.mult(ways);
            }

            out.println(answer);
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

