import java.io.*;
import java.util.*;

/**
 * Created by fcdkbear on 15.10.16.
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        new Task().solve(in, out);
        out.close();
    }


    static class Task {

        public void solve(InputReader in, PrintWriter out) {

            int n = in.nextInt();
            int x = in.nextInt();
            n = n + n - 1;
            if ((x == 1) || (x == n)) {
                out.println("No");
                return;
            }
            int mid = (n + 1) / 2;
            int[] res = new int[n];
            if (x == mid) {
                for (int i = 0; i < res.length; ++i) {
                    res[i] = i + 1;
                }
            } else if (x < mid) {
                int midIndex = n / 2;
                for (int i = n - 1; i > midIndex; --i) {
                    res[i] = i + 1;
                }
                res[midIndex] = x;
                res[midIndex - 1] = 1;
                int index = midIndex - 2;
                for (int i = mid; i > 1; --i) {
                    if (i != x) {
                        res[index] = i;
                        index--;
                    }
                }
            } else {
                int midIndex = n / 2;
                for (int i = 0; i < midIndex; ++i) {
                    res[i] = i + 1;
                }
                res[midIndex] = x;
                res[midIndex + 1] = n;
                int index = midIndex + 2;
                for (int i = mid; i < n; ++i) {
                    if (i != x) {
                        res[index] = i;
                        index++;
                    }
                }
            }
            out.println("Yes");
            for (int i = 0; i < res.length; ++i) {
                out.println(res[i]);
            }

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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

}
