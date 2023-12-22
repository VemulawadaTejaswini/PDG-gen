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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Map<String, Integer> map = new HashMap<String, Integer>();

            for (int i = 0; i < n; i++) {
                String str = in.next();
                if (map.containsKey(str)) {
                    int cnt = map.get(str);
                    map.put(str, ++cnt);
                } else {
                    map.put(str, 1);
                }
            }

            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                String str = in.next();
                if (map.containsKey(str)) {
                    int cnt = map.get(str);
                    map.put(str, --cnt);
                } else {
                    map.put(str, -1);
                }
            }

            int ans = 0;

            for (String key : map.keySet()) {
                ans = Math.max(ans, map.get(key));
            }
            out.print(ans);

        }

    }
}

