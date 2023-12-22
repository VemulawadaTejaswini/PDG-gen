import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long a[] = new long[n + 1];
            int st[] = new int[61];
            long temp = 0;
            for (int i = 0; i < n; i++) {
                temp = in.nextLong();
                a[i] = temp;
                String x = Long.toBinaryString(temp);
                for (int j = x.length() - 1; j >= 0; j--) {
                    if (x.charAt(j) == '1') st[x.length() - 1 - j]++;
                }
            }
            StringBuilder ans = new StringBuilder("");
            long tn = n;
            long anss = 0;
            long slash = 1;
            for (int i = 0; i < n - 1; i++) {
                temp = a[i];
                slash = 1;
                String x = Long.toBinaryString(temp);
                for (int j = x.length() - 1; j >= 0; j--) {
                    if (x.charAt(j) == '1') st[x.length() - 1 - j]--;

                }
                tn--;
//            for(int k=0;k<61;k++){
//                out.print(st[k]);
//            }
//            out.println();
                for (int j = 0; j < 61; j++) {
                    if ((temp & 1) == 1) {
                        anss += ((tn) - st[j]) * slash;
                    } else {
                        anss += st[j] * slash;
                    }
                    temp = temp / 2;
                    slash = slash << 1;
                }
//            out.println(anss);
            }
            out.println(anss);
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

