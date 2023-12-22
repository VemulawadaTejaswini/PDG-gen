import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;
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
        LiningUp solver = new LiningUp();
        solver.solve(1, in, out);
        out.close();
    }

    static class LiningUp {
        public static int MOD = 1_000_000_007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                int left = i - 1;
                int right = n - i;
                int key = Math.abs(right - left);
                map.put(key, 0);
            }

            for (int i = 1; i <= n; i++) {
                int a = in.nextInt();
                if (!map.containsKey(a)) {
                    out.println(0);
                    return;
                }
                map.put(a, map.get(a) + 1);
            }
            long result = 1;
            for (int key : new ArrayList<>(map.keySet())) {
                if (key == 0) {
                    if (map.get(key) != 1) {
                        out.println(0);
                        return;
                    }
                } else {
                    if (map.get(key) != 2) {
                        out.println(0);
                        return;
                    }
                }
                result *= map.get(key);
                result %= MOD;
            }
            out.println(result);

        }

    }
}

