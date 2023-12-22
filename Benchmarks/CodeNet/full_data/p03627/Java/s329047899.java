import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> cnt = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if (cnt.containsKey(a[i])) {
                    cnt.put(a[i], cnt.get(a[i]) + 1);
                } else {
                    cnt.put(a[i], 1);
                }
            }

            Arrays.sort(a);
            long ans = 0;
            long best4 = 0;
            long best1 = 0;
            long best2 = 0;
            for (Map.Entry<Integer, Integer> e : cnt.entrySet()) {
                long k = e.getKey();
                long v = e.getValue();
                if (v >= 4) {
                    if (k > best4) {
                        best4 = k;
                    }
                }
                if (v >= 2) {
                    if (k > best1) {
                        best2 = best1;
                        best1 = k;
                    } else if (k > best2) {
                        best2 = k;
                    }
                }
            }

            ans = Math.max(best4 * best4, best1 * best2);
            out.println(ans);
        }

    }
}

