import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
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
        DBannedK solver = new DBannedK();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBannedK {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = Integer.parseInt(in.next());
            Map<Integer, Integer> m = new HashMap<>();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = Integer.parseInt(in.next());
                if (m.get(a[i]) == null) {
                    m.put(a[i], 1);
                } else {
                    m.put(a[i], m.get(a[i]) + 1);
                }
            }
            int count = 0;
            int n;
            long val;
            Map<Integer, Long> nm = new HashMap<>();
            for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                n = entry.getValue();
                if (nm.get(n) != null) {
                    count += nm.get(n);
                } else {
                    val = (long) ((Math.pow(n, 2) - n) / 2);
                    nm.put(n, val);
                    count += val;
                }
            }
            for (int i : a) {
                out.println(count - m.get(i) + 1);
            }
        }

    }
}

