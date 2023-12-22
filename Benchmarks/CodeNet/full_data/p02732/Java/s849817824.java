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
            Map<Integer, Integer> newMap;
            int count;
            for (int i : a) {
                count = 0;
                newMap = new HashMap<>(m);
                newMap.put(i, newMap.get(i) - 1);
                for (Integer value : newMap.values()) {
                    count += (Math.pow(value, 2) - value) / 2;
                }
                out.println(count);
            }
        }

    }
}

