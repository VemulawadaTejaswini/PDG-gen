import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
 * @author Yuan Lei
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task1003 solver = new Task1003();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task1003 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int[][][] dp = new int[n + 1][2][2];
            if (s.length() < 3) {
                out.println(0);
                return;
            } else {
                int ans = 0;
                for (int i = 0; i < n; ++i) {
                    int now = i;
                    while (now < n && s.charAt(now) == '0') ++now;
                    ArrayList<Integer> numbers = new ArrayList<>();
                    while (true) {
                        int cnt = 0;
                        while (now < n && s.charAt(now) == '1') {
                            ++now;
                            ++cnt;
                        }
                        numbers.add(cnt);
                        if (now + 1 >= n) break;
                        if (now + 1 < n && s.charAt(now + 1) == '0') break;
                        ++now;
                    }
                    ans += get(numbers);
                    i = now;
                }
                out.println(ans);
            }
        }

        private int get(ArrayList<Integer> numbers) {
            //System.out.println(numbers);
            if (numbers.size() <= 1) return 0;
            int n = numbers.size();
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = numbers.get(0);
            for (int i = 2; i <= n; ++i) {
                dp[i] = dp[i - 1];
                if (i >= 2 && numbers.get(i - 2) >= 2) dp[i] = Math.max(dp[i], dp[i - 2] + numbers.get(i - 2));
                if (i >= 3 && numbers.get(i - 2) == 1) dp[i] = Math.max(dp[i], dp[i - 3] + numbers.get(i - 2));
                if (i >= 2 && numbers.get(i - 2) >= 2) dp[i] = Math.max(dp[i], dp[i - 2] + numbers.get(i - 1));
                if (i >= 3 && numbers.get(i - 2) == 1) dp[i] = Math.max(dp[i], dp[i - 3] + numbers.get(i - 1));
            }
            //System.out.println(dp[n]);
            return dp[n];
        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public boolean hasNext() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    final String line = reader.readLine();
                    if (line == null) return false;
                    tokenizer = new StringTokenizer(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return true;
        }

        public String next() {
            if (hasNext()) return tokenizer.nextToken();
            return null;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

