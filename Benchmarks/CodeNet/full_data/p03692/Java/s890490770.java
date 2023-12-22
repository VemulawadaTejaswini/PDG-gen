import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author Pavel Mavrin
 */
public class Main {

    private static final long MOD = (long) (1e9 + 7);
    boolean[][] a;

    private void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();
        a = new boolean[n][n];
        for (int i = 0; i < m; i++) {
            int x = n - nextInt();
            int y = n - nextInt();
            a[x][y] = true;
        }
        Map<State, Integer> d = new HashMap<>();
        d.put(new State(new int[]{0}), 1);
        for (int i = 1; i < n; i++) {
            Map<State, Integer> d2 = new HashMap<>();
            for (Map.Entry<State, Integer> entry : d.entrySet()) {
                State state = entry.getKey();
                int num = entry.getValue();
                int[] p = new int[n];
                int dd = 0;
                for (int j = 0; j < i; j++) {
                    if (a[i][j]) {
                        p[state.g[j]]++;
                        dd++;
                    }
                }
                long c = num;
                for (int q = 0; q < n; q++) {
                    dd -= p[q];

                    if (i < n - 1 || q == state.g[n - 2]) {

                        long cc = c * (1 << dd);
                        cc %= MOD;

                        State state1 = new State(new int[i + 1]);
                        System.arraycopy(state.g, 0, state1.g, 0, i);
                        state1.g[i] = q;

                        Integer qq = d2.get(state1);
                        if (qq == null) {
                            d2.put(state1, (int) cc);
                        } else {
                            d2.put(state1, (int) (qq + cc));
                        }
                    }

                    c = c * ((1 << p[q]) - 1);
                    c %= MOD;
                    if (c == 0) break;
                }
            }
            d = d2;
//            System.out.println(d);
        }
        long res = 1;
        for (int i = 0; i < m; i++) {
            res *= 2;
            res %= MOD;
        }
        for (Map.Entry<State, Integer> entry : d.entrySet()) {
            res -= entry.getValue();
            res += MOD;
            res %= MOD;
        }

        out.println(res);

    }


    class State {
        int[] g;

        public State(int[] g) {
            this.g = g;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            State state = (State) o;

            return Arrays.equals(g, state.g);

        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(g);
        }

        @Override
        public String toString() {
            return Arrays.toString(g);
        }
    }

    // ------------------

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    PrintWriter out = new PrintWriter(System.out);

    String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        solve();
        out.close();
    }

}
