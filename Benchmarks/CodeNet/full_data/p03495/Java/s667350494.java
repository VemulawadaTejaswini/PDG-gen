import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CNotSoDiverse solver = new CNotSoDiverse();
        solver.solve(1, in, out);
        out.close();
    }

    static class CNotSoDiverse {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();
            Map<Integer, Integer> p = new HashMap<>();
            Map<Integer, Integer> r = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                p.merge(a, 1, (x, y) -> x + y);
            }
            int d = p.size() - k;
            if (d <= 0) {
                out.println(0);
                return;
            }
            for (Map.Entry<Integer, Integer> e : p.entrySet()) {
                r.merge(e.getValue(), 1, (x, y) -> x + y);
            }
            Iterator<Map.Entry<Integer, Integer>> it = r.entrySet().iterator();
            long ans = 0;
            while (d > 0) {
                Map.Entry<Integer, Integer> e = it.next();
                if (d <= e.getValue()) {
                    ans += d * e.getKey();
                    break;
                }
                d -= e.getValue();
                ans += e.getKey() * e.getValue();
            }
            out.println(ans);
        }

    }
}

