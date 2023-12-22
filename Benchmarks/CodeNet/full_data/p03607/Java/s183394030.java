import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            Map<Integer, Integer> a = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int tmp = Integer.parseInt(in.next());
                if (a.containsKey(tmp) == false) a.put(tmp, 1);
                else a.remove(tmp);
            }
            int ans = 0;

            for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
                if (entry.getValue() == 1) ans++;
            }
            out.println(ans);

        }

    }
}

