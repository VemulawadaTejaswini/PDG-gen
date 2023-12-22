import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        ArrayList<Pair<Integer, Integer>> minChanges(int[] a, int off) {
            int[] dp = new int[100_001];
            int m = 0;
            for (int i = off; i < a.length; i += 2) {
                dp[a[i]]++;
                m++;
            }
            for (int i = 0; i < dp.length; i++) {
                dp[i] = m - dp[i];
            }
            ArrayList<Pair<Integer, Integer>> res = new ArrayList<>();
            for (int i = 0; i < dp.length; i++) {
                res.add(new Pair<>(i, dp[i]));
            }
            res.sort(Comparator.comparingInt(o -> o.second));
            return res;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.NextInt();
            int[] v = in.NextIntArray(n);
            ArrayList<Pair<Integer, Integer>> res1 = minChanges(v, 0), res2 = minChanges(v, 1);
            int best = n;
            for (Pair<Integer, Integer> i : res1) {
                best = Math.min(best, i.second + getBest(i.first, res2));
            }
            out.println(best);
        }

        private int getBest(int first, ArrayList<Pair<Integer, Integer>> res2) {
            for (int i = 0; i < res2.size(); i++) {
                Pair<Integer, Integer> v = res2.get(i);
                if (v.first == first) continue;
                return v.second;
            }
            return 0;
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

        public int[] NextIntArray(int n) {
            return NextIntArray(n, 0);
        }

        public int[] NextIntArray(int n, int offset) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = NextInt() + offset;
            }
            return a;
        }

    }

    static class Pair<T1, T2> {
        public T1 first;
        public T2 second;

        public Pair(T1 f, T2 s) {
            first = f;
            second = s;
        }

    }
}

