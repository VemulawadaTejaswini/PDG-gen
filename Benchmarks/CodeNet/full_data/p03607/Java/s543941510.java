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
        WriteandErase solver = new WriteandErase();
        solver.solve(1, in, out);
        out.close();
    }

    static class WriteandErase {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Map<Long, Long> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                long a = in.nextLong();
                map.put(a, map.getOrDefault(a, 0L) + 1);
            }

            long result = 0;
            for (Long key : map.keySet()) {
                if (map.get(key) % 2 == 1) {
                    result++;
                }
            }

            out.print(result);
        }

    }
}

