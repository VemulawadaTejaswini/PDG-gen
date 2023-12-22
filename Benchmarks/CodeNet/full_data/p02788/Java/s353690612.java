import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.Comparator;
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
        FSilverFoxVsMonster solver = new FSilverFoxVsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSilverFoxVsMonster {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int d = in.nextInt();
            int a = in.nextInt();

            Pair<Integer, Integer>[] monsters = new Pair[n];
            for (int i = 0; i < n; i++) {
                monsters[i] = Pair.of(in.nextInt(), in.nextInt());
            }
            Arrays.sort(monsters, Comparator.comparingInt(p -> p.first));

            Queue<Pair<Integer, Integer>> bombs = new ArrayDeque<>();

            long damage = 0;
            long answer = 0;
            for (Pair<Integer, Integer> monster : monsters) {
                while (!bombs.isEmpty() && bombs.peek().first <= monster.first) {
                    damage += bombs.poll().second;
                }

                if (monster.second >= damage) {
                    int remain = (int) (monster.second - damage);
                    int attack = a * ((remain + a - 1) / a);
                    answer += attack / a;
                    damage += attack;
                    bombs.add(Pair.of((int) Math.min(Integer.MAX_VALUE, (long) monster.first + 2 * d + 1), -attack));
                }
            }

            out.println(answer);
        }

    }

    static class Pair<F, S> {
        public final F first;
        public final S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public static <F, S> Pair<F, S> of(F first, S second) {
            return new Pair<>(first, second);
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

        public int hashCode() {
            return Objects.hash(first, second);
        }

        public String toString() {
            return "(" + first + ", " + second + ')';
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

