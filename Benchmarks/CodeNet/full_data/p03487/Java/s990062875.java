import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            HashMap<Long, Integer> map = new HashMap<Long, Integer>();

            int n = in.nextInt();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                long l = in.nextLong();
                if (map.containsKey(l)) {
                    map.put(l, map.get(l) + 1);
                } else {
                    map.put(l, 1);
                }
            }


            for (long key : map.keySet()) {
                int cnt = map.get(key);
                if (key < cnt) {
                    ans += cnt - key;
                } else if (cnt < key) {
                    ans += cnt;
                }
            }

            out.print(ans);

        }

    }
}

