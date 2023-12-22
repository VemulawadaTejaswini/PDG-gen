import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
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
        CExamAndWizard solver = new CExamAndWizard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CExamAndWizard {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // Aの余りを大きい順に取っていく。
            // ・不足している分を足す
            // ・余りが不足以上になるまで足す
            int n = in.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            ArrayList<Long> amari = new ArrayList<>();
            long husoku = 0;
            long res = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
                if (a[i] > b[i]) {
                    amari.add(a[i] - b[i]);
                }
                if (b[i] > a[i]) {
                    husoku += b[i] - a[i];
                    res++;
                }
            }
            amari.sort(Comparator.reverseOrder());
            int index = 0;

            while (husoku > 0) {
                if (index == amari.size()) {
                    out.println(-1);
                    return;
                }
                husoku -= amari.get(index++);
                res++;
            }
            out.println(res);
        }

    }
}

