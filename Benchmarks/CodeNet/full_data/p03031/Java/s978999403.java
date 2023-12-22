import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

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
        CSwitches solver = new CSwitches();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSwitches {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<Integer>[] list = new ArrayList[m];
            for (int i = 0; i < m; i++) {
                list[i] = new ArrayList<>();
                int k = in.nextInt();
                for (int j = 0; j < k; j++) {
                    list[i].add(in.nextInt() - 1);
                }
            }

            boolean[] p = new boolean[m];
            for (int i = 0; i < m; i++) {
                p[i] = in.nextInt() == 0;
            }

            // 電灯はn個あるから状態数は2^N
            int cnt = 0;
            for (int i = 0; i < Math.pow(2, n); i++) {
                // 電球がonかどうかのflag
                boolean[] f = new boolean[m];
                System.arraycopy(p, 0, f, 0, m);
                for (int j = 0; j < n; j++) {
                    // j番目のbitが立っていれば
                    if ((i & (int) Math.pow(2, j)) == (int) Math.pow(2, j)) {
                        for (int k = 0; k < list.length; k++) {
                            // リストに入っていれば
                            // 偶数個なので=!でいい
                            if (list[k].contains(j)) f[k] = !f[k];
                        }
                    }
                }

                boolean allon = true;
                for (int j = 0; j < m; j++) {
                    if (!f[j]) {
                        allon = false;
                        break;
                    }
                }
                if (allon) cnt++;

            }

            out.println(cnt);


        }

    }
}

