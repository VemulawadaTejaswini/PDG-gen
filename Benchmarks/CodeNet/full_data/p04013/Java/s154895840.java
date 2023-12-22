import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTakAndCards solver = new CTakAndCards();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTakAndCards {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int[] tab = new int[n];
            for (int i = 0; i < n; i++) {
                tab[i] = sc.nextInt();
            }
            ArrayList<Integer> sup = new ArrayList<>();
            ArrayList<Integer> inf = new ArrayList<>();
            ArrayList<Integer> eq = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (tab[i] > a)
                    sup.add(tab[i] - a);
                if (tab[i] < a)
                    inf.add(a - tab[i]);
                if (tab[i] == a)
                    eq.add(tab[i]);
            }
            if (sup.size() == 0 || inf.size() == 0) {
                out.println((1L << eq.size()) - 1);
                return;
            }
            long ans = (1L << eq.size()) - 1;
            long[][] dp1 = new long[inf.size()][2501];
            boolean[][] go = new boolean[inf.size()][2501];
            go[0][inf.get(0)] = true;
            dp1[0][inf.get(0)]++;
            for (int i = 1; i < inf.size(); i++) {
                go[i][inf.get(i)] = true;
                dp1[i][inf.get(i)]++;
                for (int j = 1; j < 2501; j++) {
                    if (go[i - 1][j]) {
                        go[i][j] = true;
                        dp1[i][j] += dp1[i - 1][j];
                        go[i][j + inf.get(i)] = true;
                        dp1[i][j + inf.get(i)] += dp1[i - 1][j];
                    }
                }
            }
            long[][] dp2 = new long[sup.size()][2501];
            go = new boolean[sup.size()][2501];
            go[0][sup.get(0)] = true;
            dp2[0][sup.get(0)]++;
            for (int i = 1; i < sup.size(); i++) {
                go[i][sup.get(i)] = true;
                dp2[i][sup.get(i)]++;
                for (int j = 1; j < 2501; j++) {
                    if (go[i - 1][j]) {
                        go[i][j] = true;
                        dp2[i][j] += dp2[i - 1][j];
                        go[i][j + sup.get(i)] = true;
                        dp2[i][j + sup.get(i)] += dp2[i - 1][j];
                    }
                }
            }

            long mid = (1L << eq.size()) - 1;
            for (int i = 1; i < 2501; i++) {
                ans += dp1[inf.size() - 1][i] * dp2[sup.size() - 1][i] * (mid + 1);
            }
            out.println(ans);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

