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
import java.util.Map.Entry;
import java.io.BufferedReader;
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

            List<Map.Entry<Integer, Integer>> list1 = new ArrayList<>(map1.entrySet());
            List<Map.Entry<Integer, Integer>> list2 = new ArrayList<>(map2.entrySet());
            list1.sort((e1, e2) -> e2.getValue() - e1.getValue());
            list2.sort((e1, e2) -> e2.getValue() - e1.getValue());

            if (list1.get(0).getKey().equals(list2.get(0).getKey())) {
                out.println(2 * m - Math.max(list1.get(0).getValue() + list2.get(1).getValue(), list1.get(1).getValue() + list2.get(0).getValue()));
            } else {
                out.println(2 * m - list1.get(0).getValue() - list2.get(0).getValue());
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

