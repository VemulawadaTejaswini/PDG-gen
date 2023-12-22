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
        FStringsOfEternity solver = new FStringsOfEternity();
        solver.solve(1, in, out);
        out.close();
    }

    static class FStringsOfEternity {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            char[] text = in.next().toCharArray();
            char[] pattern = in.next().toCharArray();

            char[] copiedText = nCopies(text, (pattern.length / text.length) + 2);
            KMP kmp = new KMP(pattern);
            int[] copiedScores = kmp.computeScores(copiedText);
            int[] scores = new int[text.length];
            for (int i = 0; i < copiedText.length; i++) {
                scores[i % text.length] = Math.max(scores[i % text.length], copiedScores[i]);
            }

            int[] seq = new int[text.length];
            int[] max = new int[3];
            for (int iterations = 0; iterations < 3; iterations++) {
                for (int i = 0; i < text.length; i++) {
                    if (scores[i] == pattern.length) {
                        seq[i] = Math.max(seq[i], 1 + seq[((i - pattern.length) % text.length + text.length) % text.length]);
                    }
                }

                max[iterations] = Util.max(seq);
            }

            if (max[2] > max[1]) {
                out.println(-1);
                return;
            } else {
                out.println(max[2]);
            }
        }

        static char[] nCopies(char[] x, int n) {
            char[] result = new char[x.length * n];
            for (int j = 0; j < n; j++) {
                System.arraycopy(x, 0, result, j * x.length, x.length);
            }
            return result;
        }

    }

    static class KMP {
        public final char[] pattern;
        public final int[] fail;

        public KMP(char[] pattern) {
            this.pattern = pattern;
            fail = new int[pattern.length + 1];

            fail[0] = 0;
            for (int i = 2; i <= pattern.length; i++) {
                fail[i] = adv(fail[i - 1], pattern[i - 1]);
            }
        }

        public int adv(int len, char next) {
            while (len > 0 && pattern[len] != next) {
                len = fail[len];
            }
            return len + (pattern[len] == next ? 1 : 0);
        }

        public int[] computeScores(char[] text) {
            int[] score = new int[text.length];
            for (int i = 0, len = 0; i < text.length; i++) {
                len = adv(len, text[i]);
                score[i] = len;
                if (len == pattern.length) {
                    len = fail[len];
                }
            }
            return score;
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

    }

    static class Util {
        public static int max(int... x) {
            int max = Integer.MIN_VALUE;
            for (int i : x) {
                max = Math.max(i, max);
            }
            return max;
        }

    }
}

