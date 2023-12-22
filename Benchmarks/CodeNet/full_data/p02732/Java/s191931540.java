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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            Long a[] = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(in.next());
            }

            Map<Long, Long> ma = new HashMap<>();
            int ans = 0;

            for (int i = 0; i < n; i++) {
                if (ma.containsKey(a[i])) {
                    Long tmp = ma.get(a[i]);
                    tmp++;
                    ma.put(a[i], tmp);
                } else {
                    ma.put(a[i], 1L);
                }
            }

            int res = 0;
            for (Long key : ma.keySet()) {
                res += ma.get(key) * (ma.get(key) - 1) / 2;
            }

            for (int i = 0; i < n; i++) {
                Long val = ma.get(a[i]);
                Long bef = val * (val - 1) / 2;
                Long aft = (val - 1) * (val - 2) / 2;
                out.println(res + aft - bef);
            }

        }

    }
}

