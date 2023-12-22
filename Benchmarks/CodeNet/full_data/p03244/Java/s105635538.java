import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.util.Collections;
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
            int m = n / 2;
            int[] a = in.nextIntArray(n);

            Map<Integer, Integer> map1 = new TreeMap<>();
            Map<Integer, Integer> map2 = new TreeMap<>();
            map1.put(0, 0);
            map2.put(0, 0);

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    map1.merge(a[i], 1, Integer::sum);
                } else {
                    map2.merge(a[i], 1, Integer::sum);
                }
            }

            List<Pair> list1 = new ArrayList<>();
            for (int x : map1.keySet()) {
                list1.add(new Pair(x, map1.get(x)));
            }
            Collections.sort(list1, (p1, p2) -> p2.y - p1.y);

            List<Pair> list2 = new ArrayList<>();
            for (int x : map2.keySet()) {
                list2.add(new Pair(x, map2.get(x)));
            }
            Collections.sort(list2, (p1, p2) -> p2.y - p1.y);

            if (list1.get(0).x != list2.get(0).x) {
                out.println(2 * m - list1.get(0).y - list2.get(0).y);
            } else {
                out.println(2 * m - Math.max(list1.get(0).y + list2.get(1).y, list1.get(1).y + list2.get(0).y));
            }
        }

        class Pair {
            int x;
            int y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

    }
}

