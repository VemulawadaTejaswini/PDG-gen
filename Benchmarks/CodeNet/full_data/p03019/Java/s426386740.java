import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        long x;
        long remain;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            x = in.nextLong();
            Subject[] subjects = new Subject[n];
            for (int i = 0; i < n; ++i) {
                subjects[i] = new Subject();
                subjects[i].b = in.nextLong();
                subjects[i].l = in.nextLong();
                subjects[i].u = in.nextLong();
                subjects[i].init();
            }
            Arrays.sort(subjects, new Comparator<Subject>() {

                public int compare(Subject o1, Subject o2) {
                    return Long.compare(o2.gainIfMax - o2.gainIfEmpty, o1.gainIfMax - o1.gainIfEmpty);
                }
            });
            long left = -1;
            long right = x * n;
            while (right - left > 1) {
                long middle = (left + right) / 2;
                int whole = (int) (middle / x);
                remain = middle % x;
                long delta = 0;
                for (int i = 0; i < whole; ++i) {
                    delta += subjects[i].gainIfMax;
                }
                for (int i = whole; i < n; ++i) {
                    delta += subjects[i].gainIfEmpty;
                }
                long bestDelta;
                if (remain == 0) {
                    bestDelta = delta;
                } else {
                    bestDelta = Long.MIN_VALUE;
                    for (int i = 0; i < n; ++i) {
                        subjects[i].init2();
                        if (i < whole) {
                            bestDelta = Math.max(bestDelta, delta - subjects[i].gainIfMax + subjects[i].gainIfRemain + subjects[whole].gainIfMax - subjects[whole].gainIfEmpty);
                        } else {
                            bestDelta = Math.max(bestDelta, delta - subjects[i].gainIfEmpty + subjects[i].gainIfRemain);
                        }
                    }
                }
                if (bestDelta >= 0) {
                    right = middle;
                } else {
                    left = middle;
                }
            }
            out.println(right);
        }

        class Subject {
            long b;
            long l;
            long u;
            long gainIfMax;
            long gainIfRemain;
            long gainIfEmpty;

            public void init() {
                gainIfMax = (x - b) * u;
                gainIfEmpty = -b * l;
            }

            private void init2() {
                gainIfRemain = (remain - b);
                if (gainIfRemain > 0) gainIfRemain *= u;
                else gainIfRemain *= l;
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

