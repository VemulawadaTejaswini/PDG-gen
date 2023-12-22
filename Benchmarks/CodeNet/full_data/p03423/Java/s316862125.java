import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AEoui
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
            HashMap<String, Integer> map = new HashMap<>();
            int n = in.nextInt();

            for (int i = 0; i < n; ++i) {
                String s = in.next();
                if (isOk(s)) {
                    map.put(s.charAt(0) + "", map.getOrDefault(s.charAt(0) + "", 0) + 1);
                }
            }

            if (map.keySet().size() < 3) {
                out.println(0);
            } else {
                int[] arr = new int[map.keySet().size()];
                int i = 0;
                for (String s : map.keySet()) {
                    arr[i++] = map.get(s);
                }

                long ans = 0;
                for (i = 0; i < arr.length; ++i) {
                    for (int j = i + 1; j < arr.length; ++j) {
                        for (int k = j + 1; k < arr.length; ++k) {
                            ans += (long) arr[i] * (long) arr[j] * (long) arr[k];
                        }
                    }
                }

                out.println(ans);
            }
        }

        private boolean isOk(String s) {
            char c = s.charAt(0);

            return c == 'M' || c == 'A' || c == 'R' || c == 'C' || c == 'H';
        }

    }
}

