import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hsy
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            List<TaskB.Pair> list = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (a[i] >= a[i - 1]) {
                    continue;
                } else {
                    while (a[i] < a[i - 1]) {
                        int tempindex = getMax(a);
                        TaskB.Pair pair = new TaskB.Pair();
                        pair.a = tempindex + 1;
                        pair.b = i + 1;
                        a[i] += a[tempindex];
                        list.add(pair);
                    }
                }
            }
            out.println(list.size());
            if (list.size() == 0) {
                return;
            }
            for (TaskB.Pair pair : list) {
                out.println(pair.a + " " + pair.b);
            }
        }

        private int getMax(int[] a) {
            int Max = -10000010;
            int pos = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > Max) {
                    Max = a[i];
                    pos = i;
                }
            }
            return pos;
        }

        static class Pair {
            int a;
            int b;

        }

    }
}

