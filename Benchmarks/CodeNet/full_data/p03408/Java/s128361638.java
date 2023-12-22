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
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BTwoColorsCardGame solver = new BTwoColorsCardGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTwoColorsCardGame {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            Map<String, Integer> d = new HashMap<>();
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                d.merge(in.next(), 1, (v1, v2) -> v1 + v2);
            }
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                d.merge(in.next(), -1, (v1, v2) -> v1 + v2);
            }
            int max = 0;
            for (int i : d.values()) {
                max = Math.max(max, i);
            }
            out.println(max);
        }

    }
}

