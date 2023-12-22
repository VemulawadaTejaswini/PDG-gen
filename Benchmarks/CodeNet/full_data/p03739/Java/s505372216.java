import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        CSequence solver = new CSequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSequence {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int[] tab = new int[n];
            for (int i = 0; i < n; i++) {
                tab[i] = sc.nextInt();
            }
            long ans = Long.MAX_VALUE;
            long sum = 0;
            long act = 0;
            if (tab[0] <= 0) {
                act += -tab[0] + 1;
                sum = 1;
            } else {
                sum = tab[0];
            }
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    if (sum + tab[i] > 0) {
                        sum += tab[i];
                        continue;
                    }
                    act += 1 - (sum + tab[i]);
                    sum = 1;
                } else {
                    if (sum + tab[i] < 0) {
                        sum += tab[i];
                        continue;
                    }
                    act += 1 + (sum + tab[i]);
                    sum = -1;
                }
            }
            ans = Math.min(ans, act);

            sum = 0;
            act = 0;
            if (tab[0] >= 0) {
                act += tab[0] + 1;
                sum = -1;
            } else {
                sum = tab[0];
            }
            for (int i = 1; i < n; i++) {
                if (i % 2 == 1) {
                    if (sum + tab[i] > 0) {
                        sum += tab[i];
                        continue;
                    }
                    act += 1 - (sum + tab[i]);
                    sum = 1;
                } else {
                    if (sum + tab[i] < 0) {
                        sum += tab[i];
                        continue;
                    }
                    act += 1 + (sum + tab[i]);
                    sum = -1;
                }
            }
            ans = Math.min(ans, act);
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

