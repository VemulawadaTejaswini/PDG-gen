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
            int count = 0;
            Map<Integer, Integer> newMap = new HashMap<>();
            for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                newMap.put(entry.getKey(), calcMinus(entry.getValue()));
                count += (int) ((Math.pow(entry.getValue(), 2) - entry.getValue()) / 2);
            }
            for (int i : a) {
                out.println(count - newMap.get(i));
            }
        }

        public int calcMinus(int n) {
            int normal = (int) ((Math.pow(n, 2) - n) / 2);
            int minus = (int) ((Math.pow(n - 1, 2) - n + 1) / 2);
            return normal - minus;
        }

    }
}

