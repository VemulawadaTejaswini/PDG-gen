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
        IslandsWar solver = new IslandsWar();
        solver.solve(1, in, out);
        out.close();
    }

    static class IslandsWar {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            List<Pair> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                list.add(new Pair(a, b));
            }
            Collections.sort(list);
            int border = 0;
            long result = 0;
            for (Pair p : list) {
                if (border <= p.left) {
                    border = p.right;
                    result++;
                }
            }
            out.println(result);
        }

        public class Pair implements Comparable<Pair> {
            int left;
            int right;

            public Pair(int left, int right) {
                this.left = left;
                this.right = right;
            }

            public int compareTo(Pair o) {
                // 昇順
                return Integer.compare(this.right, o.right);
            }

        }

    }
}

