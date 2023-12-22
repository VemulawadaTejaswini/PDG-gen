import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
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
            int n = in.nextInt();
            int res = 0;
            HashMap<String, Integer> blue = new HashMap<>();
            for (int i = 0; i < n; i++) {
                blue.merge(in.next(), 1, Integer::sum);
            }
            int m = in.nextInt();
            HashMap<String, Integer> red = new HashMap<>();
            for (int i = 0; i < m; i++) {
                red.merge(in.next(), 1, Integer::sum);
            }

            for (String s : blue.keySet()) {
                int cmp = blue.get(s) - red.getOrDefault(s, 0);
                res = Math.max(res, cmp);
            }
            out.println(res);
        }

    }
}

