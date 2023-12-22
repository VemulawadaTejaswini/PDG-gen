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
            Map<String, Integer> cards = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String tmp = in.next();
                if (cards.containsKey(tmp)) {
                    cards.put(tmp, cards.get(tmp) + 1);
                } else {
                    cards.put(tmp, 1);
                }
            }
            int m = Integer.parseInt(in.next());
            for (int i = 0; i < m; i++) {
                String tmp = in.next();
                if (cards.containsKey(tmp)) {
                    cards.put(tmp, cards.get(tmp) - 1);
                } else {
                    cards.put(tmp, 1);
                }
            }
            int ans = 0;
            for (String key : cards.keySet()) {
                ans = Math.max(ans, cards.get(key));
            }

            // 出力
            out.println(ans);

        }

    }
}

