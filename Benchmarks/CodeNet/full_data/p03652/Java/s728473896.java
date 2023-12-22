import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BSportsFestival solver = new BSportsFestival();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSportsFestival {
        boolean[] use;
        int[][] fav;
        int[] cnt;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            use = new boolean[m];
            fav = new int[n][m];
            cnt = new int[m];
            Arrays.fill(use, true);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    fav[i][j] = in.nextInt() - 1;
                }
            }

            out.println(f());

        }

        int f() {
            int dec = 0;
            Arrays.fill(cnt, 0);
            for (int i = 0; i < fav.length; i++) {
                for (int j = 0; j < fav[i].length; j++) {
                    if (use[fav[i][j]]) {
                        cnt[fav[i][j]]++;
                        break;
                    }
                    if (j == fav[i].length - 1) return fav.length + 100;
                }
            }
            for (int i = 0; i < cnt.length; i++) {
                if (cnt[dec] < cnt[i]) dec = i;
            }
            use[dec] = false;
            return Math.min(cnt[dec], f());
        }

    }
}

