import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.util.function.Function;
import java.io.InputStreamReader;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        CTests solver = new CTests();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTests {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long x = in.nextInt();

//        long[] b = new long[n];
//        long[] l = new long[n];
//        long[] u = new long[n];
            CTests.Test[] tests = new CTests.Test[n];
            for (int i = 0; i < n; i++) {
//            b[index] = in.nextInt();
//            l[index] = in.nextInt();
//            u[index] = in.nextInt();
                tests[i] = new CTests.Test(in.nextInt(), in.nextInt(), in.nextInt());
            }

            long startingScore = 0;
            for (CTests.Test t : tests) {
                startingScore += -t.l * t.b;
            }

            long finalStartingScore = startingScore;
            Function<Long, Boolean> canWin = studyHours -> {
//            System.out.println("====== " + studyHours + " ======");
                Function<CTests.Test, Long> gainX = t -> (t.u * (x - t.b) - (-t.l * t.b));
                PriorityQueue<CTests.Test> q = new PriorityQueue<>(Comparator.comparingLong(t -> -gainX.apply(t)));

                long score = finalStartingScore;

                for (CTests.Test t : tests) {
                    q.add(t);
                }

                while (!q.isEmpty() && studyHours >= x) {
                    CTests.Test t = q.poll();
                    score += gainX.apply(t);
                    studyHours -= x;
//                System.out.println(score);
                }

                if (q.isEmpty()) {
                    return score >= 0;
                }

                final long lastStudyHours = studyHours;
                Function<CTests.Test, Long> gainPerPoint = t -> t.l;
                Function<CTests.Test, Long> gainIfDumpAll = t -> (t.u * (lastStudyHours - t.b) - (-t.l * t.b));
                PriorityQueue<CTests.Test> q2 = new PriorityQueue<>(Comparator.comparingLong(t -> -gainPerPoint.apply(t)));

                CTests.Test dumpItAll = q.peek();
                long dumpingGain = gainIfDumpAll.apply(dumpItAll);

                for (CTests.Test t : q) {
                    q2.add(t);
                    if (gainIfDumpAll.apply(t) > dumpingGain) {
                        dumpItAll = t;
                        dumpingGain = gainIfDumpAll.apply(t);
                    }
                }

                long salvagingGain = 0;
                while (!q2.isEmpty() && studyHours > 0) {
                    CTests.Test t = q2.poll();
//                System.out.println(studyHours);
                    salvagingGain += gainPerPoint.apply(t) * Math.min(studyHours, t.b);
                    studyHours -= Math.max(studyHours, t.b);
//                System.out.println(t + " " + salvagingGain + " " + studyHours);
                }

                score += Math.max(salvagingGain, dumpingGain);
//            System.out.println(score + " " + salvagingGain + " " + dumpingGain);

                return score >= 0;
            };

            long answer = BinarySearch.binarySearch(canWin, n * x);

            if (canWin.apply(0L)) {
                answer = 0;
            }

//        System.out.println(canWin.apply(86216L));

            out.println(answer);
        }

        static class Test {
            final long b;
            final long l;
            final long u;

            Test(long b, long l, long u) {
                this.b = b;
                this.l = l;
                this.u = u;
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

    }

    static class BinarySearch {
        public static long binarySearch(Function<Long, Boolean> bigEnough, long passingValue) {
            long tooSmall = 0, tooBig = passingValue;
            if (bigEnough.apply(tooSmall)) {
                return tooSmall;
            }

            if (!bigEnough.apply(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                long center = (tooBig + tooSmall) / 2;
                if (!bigEnough.apply(center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

    }
}

