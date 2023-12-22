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
            Map<String, Integer> score = new HashMap<>();
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                String s = in.next();
                score.put(s, score.getOrDefault(s, 0) + 1);
            }
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                String s = in.next();
                score.put(s, score.getOrDefault(s, 0) - 1);
            }
            int ans = 0;
            for (int v : score.values()) ans = (v > ans) ? v : ans;
            out.println(ans);
        }

    }
}

