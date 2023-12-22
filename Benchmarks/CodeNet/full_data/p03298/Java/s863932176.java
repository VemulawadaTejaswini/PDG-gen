import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
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
        CStringColoring solver = new CStringColoring();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStringColoring {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.nextString();

            Map<String, Map<String, Long>> count = new HashMap<>();
            for (int i = 0; i < 1 << n; i++) {
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();

                for (int j = 0; j < n; j++) {
                    if ((i >> j & 1) == 1) {
                        sb1.append(s.charAt(j));
                    } else {
                        sb2.append(s.charAt(j));
                    }
                }

                if (!count.containsKey(sb1.toString())) {
                    count.put(sb1.toString(), new HashMap<>());
                }
                count.get(sb1.toString()).merge(sb2.toString(), 1L, Long::sum);
            }

            long ans = 0;
            for (int i = 0; i < 1 << n; i++) {
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();

                for (int j = 0; j < n; j++) {
                    if ((i >> j & 1) == 1) {
                        sb1.append(s.charAt(2 * n - 1 - j));
                    } else {
                        sb2.append(s.charAt(2 * n - 1 - j));
                    }
                }

                if (count.containsKey(sb1.toString()) && count.get(sb1.toString()).containsKey(sb2.toString())) {
                    ans += count.get(sb1.toString()).get(sb2.toString());
                }
            }

            out.println(ans);
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

    }
}

