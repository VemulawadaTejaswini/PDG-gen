import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        BBuildingsAreColorful solver = new BBuildingsAreColorful();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBuildingsAreColorful {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long res = Long.MAX_VALUE;
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            for (int i = 0; i < 1 << n; i++) {
                int cntBit = 0;
                // 立ってるbit数の確認
                for (int j = 0; j < n; j++) if ((i & 1 << j) != 0) cntBit++;
                if (cntBit < k) continue;

                // 一回ごとの費用が必要
                long cmp = 0;
                long maxHeight = 0;
                for (int j = 0; j < n; j++) {
                    if ((i & 1 << j) != 0) {
                        // bitが立ってる
                        if (maxHeight < a[j]) {
                            maxHeight = a[j];
                        } else {
                            maxHeight += 1;
                            cmp += maxHeight - a[j];
                        }
                    } else {
                        maxHeight = Math.max(maxHeight, a[j]);
                    }
                }
                res = Math.min(cmp, res);
            }
            out.println(res);

        }

    }
}

