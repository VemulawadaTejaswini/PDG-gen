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
            int n = Integer.parseInt(in.next());
            Map<Integer, Integer> m = new HashMap<>();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                if (m.get(a[i]) == null) {
                    m.put(a[i], 1);
                } else {
                    m.put(a[i], m.get(a[i]) + 1);
                }
            }
            Map<Integer, Result> newMap = new HashMap<>();
            for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                newMap.put(entry.getKey(), new Result(entry.getValue()));
            }
            int count;
            for (int i : a) {
                count = 0;
                for (Map.Entry<Integer, Result> nm : newMap.entrySet()) {
                    if (nm.getKey() == i) {
                        count += nm.getValue().minus;
                    } else {
                        count += nm.getValue().normal;
                    }
                }
                out.println(count);
            }
        }

    }

    static class Result {
        int normal;
        int minus;

        Result(int n) {
            normal = (int) ((Math.pow(n, 2) - n) / 2);
            minus = (int) ((Math.pow(n - 1, 2) - n + 1) / 2);
        }

    }
}

