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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CMarch solver = new CMarch();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMarch {
        static final String letterString = "MARCH";
        static final int L = letterString.length();
        static final char[] letters = letterString.toCharArray();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int[] count = new int[letters.length];

            for (int i = 0; i < n; i++) {
                String s = in.next();
                int index = letterString.indexOf(s.charAt(0));
                if (index >= 0)
                    count[index]++;
            }

            long answer = 0;
            for (int i = 0; i < L; i++) {
                for (int j = i + 1; j < L; j++) {
                    for (int k = j + 1; k < L; k++) {
                        answer += count[i] * count[j] * count[k];
                    }
                }
            }

            out.println(answer);
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

