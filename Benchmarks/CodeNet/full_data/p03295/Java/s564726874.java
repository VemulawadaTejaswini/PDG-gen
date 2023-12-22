import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DIslandsWar solver = new DIslandsWar();
        solver.solve(1, in, out);
        out.close();
    }

    static class DIslandsWar {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            DIslandsWar.Conflict[] c = new DIslandsWar.Conflict[m];
            boolean[] solved = new boolean[m];
            int[] d = new int[n];
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1, b = in.nextInt() - 1;
                c[i] = new DIslandsWar.Conflict(a, b);
                d[a]++;
                d[b]--;
            }
            //Arrays.sort(c, Comparator.comparing(i -> i.a));
            int first = 0;
            int[] sum = new int[n - 1];
            int remain = m;
            int ans = 0;
            while (remain > 0) {
                int maxValue = 0;
                int maxIndex = -1;
                for (int i = 0; i < n - 1; i++) {
                    sum[i] = (i == 0 ? 0 : sum[i - 1]) + d[i];
                    if (sum[i] > maxValue) {
                        maxIndex = i;
                        maxValue = sum[i];
                    }
                }
                for (int i = 0; i < m; i++) {
                    if (solved[i]) {
                        continue;
                    }
                    DIslandsWar.Conflict t = c[i];
                    if (t.contains(maxIndex)) {
                        solved[i] = true;
                        d[t.a]--;
                        d[t.b]++;
                        remain--;
                    }
                }
                ans++;
            }
            out.println(ans);
        }

        private static class Conflict {
            int a;
            int b;

            Conflict(int a, int b) {
                this.a = a;
                this.b = b;
            }

            boolean contains(int i) {
                return a <= i && i < b;
            }

            public String toString() {
                return a + "<->" + b;
            }

        }

    }
}

