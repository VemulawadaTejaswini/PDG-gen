import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            int C = in.nextInt();
            char[] S = in.next().toCharArray();

            Set<Integer> ans;

            int p = 0;
            Set<Integer> set = new TreeSet<>();
            while (p < N) {
                while (p < N && S[p] == 'x') p++;
                if (p >= N) break;
                set.add(p + 1);
                p += C + 1;
                if (set.size() == K) break;
            }
            if (set.size() == K) ans = new TreeSet<>(set);
            else return;

            p = N - 1;
            set.clear();
            while (p >= 0) {
                while (p >= 0 && S[p] == 'x') p--;
                if (p < 0) break;
                set.add(p + 1);
                p -= C + 1;
                if (set.size() == K) break;
            }
            if (set.size() == K) ans = ans.stream().filter(set::contains).collect(Collectors.toSet());
            else return;
            ans.stream().sorted().forEach(out::println);
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

