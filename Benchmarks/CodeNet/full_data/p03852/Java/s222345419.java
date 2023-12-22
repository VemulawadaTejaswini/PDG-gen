import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AUOIAUAI solver = new AUOIAUAI();
        solver.solve(1, in, out);
        out.close();
    }

    static class AUOIAUAI {
        private static final String YES = "vowel";
        private static final String NO = "consonant";
        private static final int[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            char c = in.string().charAt(0);
            if (Arrays.stream(VOWELS).anyMatch(x -> x == c)) {
                out.println(YES);
            } else {
                out.println(NO);
            }
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

    }
}

