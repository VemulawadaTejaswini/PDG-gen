import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int[] d = new int[n];
            Map<Integer, Integer> d_cnt = new HashMap<>();
            for (int i = 0; i < n; i++) {
                d[i] = Integer.parseInt(in.next());
                if (!d_cnt.containsKey(d[i])) {
                    d_cnt.put(d[i], 1);
                } else {
                    Integer tmp = d_cnt.get(d[i]);
                    d_cnt.put(d[i], ++tmp);
                }
            }
            int m = Integer.parseInt(in.next());
            int[] t = new int[m];
            Map<Integer, Integer> t_cnt = new HashMap<>();
            for (int i = 0; i < m; i++) {
                t[i] = Integer.parseInt(in.next());
                if (!t_cnt.containsKey(t[i])) {
                    t_cnt.put(t[i], 1);
                } else {
                    Integer tmp = t_cnt.get(t[i]);
                    t_cnt.put(t[i], ++tmp);
                }
            }
            boolean ok = true;

            for (int i = 0; i < m; i++) {
                if (!d_cnt.containsKey(t[i])) {
                    ok = false;
                } else if (t_cnt.get(t[i]) > d_cnt.get(t[i])) {
                    ok = false;
                }
            }
            out.println(ok ? "YES" : "NO");

        }

    }
}

