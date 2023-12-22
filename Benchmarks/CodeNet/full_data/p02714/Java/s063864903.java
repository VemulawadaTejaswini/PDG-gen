import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Nikita Mikhailov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.readInt();

            String s = in.readToken();

            HashMap<Character, TreeSet<Integer>> map = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                TreeSet<Integer> orDefault = map.getOrDefault(s.charAt(i), new TreeSet<>());
                orDefault.add(i);
                map.put(s.charAt(i), orDefault);
            }

            long resS = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    char first = s.charAt(i);
                    char second = s.charAt(j);

                    if (first == second) {
                        continue;
                    }

                    char third = "RGB".replace("" + first, "").replace("" + second, "").charAt(0);
                    TreeSet<Integer> set = map.get(third);

                    int diff = j - i;

                    resS += set.tailSet(j, false).size();
                    if (set.contains(j + diff)) {
                        resS--;
                    }
                }
            }

            out.println(resS);
        }

    }

    static class FastScanner {
        private StringTokenizer st;
        private BufferedReader in;

        public FastScanner(final InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
        }

        public String readToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(readToken());
        }

    }
}

