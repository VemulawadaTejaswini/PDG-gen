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
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        int[] pa;

        int find(int x) {
            return x == pa[x] ? pa[x] : (pa[x] = find(pa[x]));
        }

        boolean union(int a, int b) {
            int ra = find(a), rb = find(b);
            if (ra != rb) {
                pa[ra] = rb;
                return true;
            }
            return false;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.next();
            int len = str.length();
            int[] diff = new int[len + 1];
            diff[0] = str.charAt(0) - 'a';
            for (int i = 1; i < len; ++i) {
                diff[i] = (str.charAt(i) - str.charAt(i - 1) + 26) % 26;
            }
            diff[len] = ('a' - str.charAt(len - 1)) % 26;

            pa = new int[len + 1];
            for (int i = 0; i <= len; ++i) pa[i] = i;

            int n = in.nextInt();
            int l, r;
            for (int i = 0; i < n; ++i) {
                l = in.nextInt();
                r = in.nextInt();
                --l;
                union(l, r);
            }
            for (int i = 0, j = len; i < j; ++i, --j) {
                union(i, j);
            }

            Map<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i <= len; ++i) {
                int rt = find(i);
                if (!mp.containsKey(rt)) {
                    mp.put(rt, diff[i]);
                } else {
                    mp.put(rt, (mp.get(rt) + diff[i]) % 26);
                }
            }

            for (Integer key : mp.keySet()) {
                if (mp.get(key) != 0) {
                    out.println("NO");
                    return;
                }
            }

            out.println("YES");
        }

    }
}

