import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        int[] arr;
        int[][] memo;
        int n;

        int f(int i, int sum) {
            if (i == n) return sum % 10 == 0 ? 0 : sum;
            if (memo[i][sum] != -1) return memo[i][sum];
            int ans = f(i + 1, sum);
            ans = Math.max(ans, f(i + 1, (sum + arr[i])));
            return memo[i][sum] = ans;
        }

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            n = in.nextInt();
            arr = new int[n];
            memo = new int[n][10100];
            for (int[] temp : memo)
                Arrays.fill(temp, -1);
            for (int i = 0; i < n; i++) arr[i] = in.nextInt();
            out.println(f(0, 0));
        }

    }

    static class FastReader {
        BufferedReader reader;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

