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
        EWhoSaysAPun solver = new EWhoSaysAPun();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWhoSaysAPun {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();

            int answer = 0;
            for (int i = 0; i < n; i++) {
                char[] t = new char[n - i];
                System.arraycopy(s, i, t, 0, n - i);
                int[] scores = new KMP(t).computeScores(s);
                for (int j = 0; j < scores.length; j++) {
                    int score = scores[j];
                    int begin = j + 1 - score;
                    score = Math.min(score, Math.abs(begin - i));
                    answer = Math.max(answer, score);
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
}

