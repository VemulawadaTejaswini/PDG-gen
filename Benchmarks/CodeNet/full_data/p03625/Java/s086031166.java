import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            Integer[] a = new Integer[n];
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if (hm.containsKey(a[i]))
                    hm.put(a[i], hm.get(a[i]) + 1);
                else
                    hm.put(a[i], 1);
            }
            Arrays.sort(a, (x1, x2) -> Integer.compare(x2, x1));
            int s = -1;
            for (int i = 0; i < n; i++) {
                if (!hm.containsKey(a[i]))
                    continue;
                if (hm.get(a[i]) >= 4) {
                    out.println(a[i] * a[i]);
                    return;
                } else if (hm.get(a[i]) >= 2) {
                    if (s != -1) {
                        out.println(s * a[i]);
                        return;
                    } else {
                        s = a[i];
                        hm.remove(a[i]);
                    }
                }

            }

            out.println(0);
        }

    }

    static class InputReader {
        StringTokenizer st;
        BufferedReader br;

        public InputReader(InputStream is) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            this.br = br;
        }

        public String next() {
            if (st == null || !st.hasMoreTokens()) {
                String nextLine = null;
                try {
                    nextLine = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (nextLine == null)
                    return null;
                st = new StringTokenizer(nextLine);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
 