import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEnoughArray solver = new DEnoughArray();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEnoughArray {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Long> pre = new ArrayList<>();
            pre.add(0L);
            long ans = 0;
            for (int i = 1; i <= n; i++) pre.add(pre.get(i - 1) + in.nextInt());
            for (int i = 1; i <= n; i++) {
                long temp = pre.get(i);
                if (temp >= k) {
                    int x = CustomList.lowerBound(pre, 0, n + 1, temp - k + 1);
                    ans += x;
//                out.println(x + " " + (i) + " " + (temp-k+1));
                }
            }
//        out.println(CustomList.lowerBound(pre,0,n+1,2L));
            out.println(ans);
        }

    }

    static class CustomList {
        public static int lowerBound(List<Long> a, int low, int high, long element) {
            while (low < high) {
                int middle = low + (high - low) / 2;
                if (element > a.get(middle))
                    low = middle + 1;
                else
                    high = middle;
            }
            return low;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

