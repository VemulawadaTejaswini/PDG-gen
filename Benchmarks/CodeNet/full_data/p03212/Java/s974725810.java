import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            ArrayList<Long> list = new ArrayList<Long>();

            list = perm(String.valueOf(n).length());
            long cnt = 0;
            for (long l : list) {
                if (l <= n) {
                    String str = String.valueOf(l);
                    if (str.contains("3") &&
                            str.contains("5") &&
                            str.contains("7")) {
                        cnt++;
                    }
                }
            }

            out.print(cnt);
        }

        private ArrayList<Long> perm(long n) {
            ArrayList<Long> list;
            if (n == 1) {
                list = new ArrayList<>();
                list.add((long) 3);
                list.add((long) 5);
                list.add((long) 7);
                return list;
            } else {
                list = perm(n - 1);
                ArrayList<Long> copy = new ArrayList<>(list);
                for (long l : perm(n - 1)) {
                    if (String.valueOf(l).length() == n - 1) {
                        copy.add(l * 10 + 3);
                        copy.add(l * 10 + 5);
                        copy.add(l * 10 + 7);
                    }

                }
                return copy;
            }
        }

    }
}

