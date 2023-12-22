import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        PreparingBoxes solver = new PreparingBoxes();
        solver.solve(1, in, out);
        out.close();
    }

    static class PreparingBoxes {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(in.next());
            }

            List<Integer> list = new ArrayList<>();
            long count = 0;
            int[] b = new int[n + 1];
            for (int i = n; i >= 1; i--) {
                if (i * 2 > n) {
                    b[i] = a[i];
                    if (a[i] == 1) {
                        count++;
                        list.add(i);
                    }
                    continue;
                }
                if (a[i] == 0) {
                    if (b[2 * i] % 2 == 1) {
                        b[i] = b[2 * i] + 1;
                        list.add(i);
                        count++;
                    } else {
                        b[i] = b[2 * i];
                    }
                } else {
                    if (b[2 * i] % 2 == 1) {
                        b[i] = b[2 * 1];
                    } else {
                        b[i] = b[2 * 1] + 1;
                        list.add(i);
                        count++;
                    }
                }
            }

            if (count > n) {
                out.println(-1);
                return;
            }

            Collections.sort(list);
            out.println(count);
            for (Integer i : list) {
                out.print(i + " ");
            }

        }

    }
}

