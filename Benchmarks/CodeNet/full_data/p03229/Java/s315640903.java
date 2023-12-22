import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        CAlign solver = new CAlign();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAlign {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
        /*
        a > b < c > dなら
        端は係数の絶対値が1
        奇数番目が-2
        偶数番目は+2になる
         */

            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            Arrays.sort(a);

            ArrayList<Integer> dec = new ArrayList<>();
            ArrayList<Integer> inc = new ArrayList<>();

            dec.add(1);
            inc.add(-1);

            int even = (n - 1) / 2;
            int odd = n / 2;

            if (n % 2 == 0) {
                // 最後はa>b<c>dになるから+1,-1でoddが減る
                odd--;
                dec.add(-1);
                inc.add(1);
            } else {
                even--;
                dec.add(1);
                inc.add(-1);
            }


            for (int i = 0; i < even; i++) {
                dec.add(2);
                inc.add(-2);
            }
            for (int i = 0; i < odd; i++) {
                dec.add(-2);
                inc.add(2);
            }

            dec.sort(Comparator.naturalOrder());
            inc.sort(Comparator.naturalOrder());

            // out.println(dec);
            // out.println(inc);


            long decSum = 0;
            long incSum = 0;
            for (int i = 0; i < n; i++) {
                decSum += dec.get(i) * a[i];
                incSum += inc.get(i) * a[i];
            }

            out.println(Math.max(decSum, incSum));

        }

    }
}

