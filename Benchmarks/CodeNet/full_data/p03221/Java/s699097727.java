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
        ABC_113_C solver = new ABC_113_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC_113_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            long[] years = new long[m];
            List[] histories = new List[n];
            for (int i = 0; i < n; i++) {
                ArrayList<Long> history = new ArrayList<Long>();
                histories[i] = history;
            }


            for (int i = 0; i < m; i++) {
                int p = in.nextInt();
                long year = in.nextLong();
                years[i] = year;
                histories[p - 1].add(year);
            }

            for (int i = 0; i < n; i++) {
                Collections.sort(histories[i]);
            }

            for (long year : years) {
                for (int i = 0; i < histories.length; i++) {
                    if (histories[i].contains(year)) {
                        int p = i + 1;
                        int birth = histories[i].indexOf(year) + 1;
                        out.println(String.format("%06d", p) + String.format("%06d", birth));
                        break;
                    }
                }
            }


        }

    }
}

