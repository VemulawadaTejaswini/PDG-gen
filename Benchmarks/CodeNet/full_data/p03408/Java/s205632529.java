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
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC091B solver = new ABC091B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC091B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            Map<String, Integer> map = new HashMap<>();
            int N = in.nextInt();
            for (int i = 0; i < N; i++) {
                String s = in.next();
                Integer integer = map.get(s);
                if (integer == null) {
                    integer = 0;
                }
                integer = integer + 1;
                map.put(s, integer);
            }

            int M = in.nextInt();
            for (int i = 0; i < M; i++) {
                String s = in.next();
                Integer integer = map.get(s);
                if (integer == null) {
                    integer = 0;
                }
                integer = integer - 1;
                map.put(s, integer);
            }

            int max = 0;
            for (Integer i : map.values()) {
                max = Math.max(i, max);
            }

            if (max < 0) {
                max = 0;
            }
            out.println(max);
        }

    }
}

