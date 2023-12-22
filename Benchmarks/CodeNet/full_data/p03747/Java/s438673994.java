import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
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
        final static long INF = (long) 4.1e18;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long L = 2L * in.nextInt();
            long T = in.nextInt() * 2L;
            TaskC.Chameleon[] chameleon = new TaskC.Chameleon[n];
            int[] cnt = new int[3];
            for (int i = 0; i < n; ++i) {
                chameleon[i] = new TaskC.Chameleon();
                chameleon[i].start = in.nextInt() * 2L;
                chameleon[i].color = 0;
                chameleon[i].dir = in.nextInt() == 1 ? 1 : -1;
                chameleon[i].indexInInput = i;
                ++cnt[chameleon[i].dir + 1];
            }

            // Determine new positions
            for (TaskC.Chameleon c : chameleon) {
                c.newPos = ((c.start + T * c.dir) % L + L) % L;
            }

            TaskC.Chameleon[] res;

            if (cnt[0] == 0 || cnt[2] == 0) {
                // No meetings at all.
                for (TaskC.Chameleon c : chameleon) {
                    c.newColor = c.color;
                }
                res = chameleon.clone();
            } else {
                // Determine new colors
                {
                    TaskC.Chameleon[] perm = chameleon.clone();
                    Arrays.sort(perm, new Comparator<TaskC.Chameleon>() {
                        public int compare(TaskC.Chameleon a, TaskC.Chameleon b) {
                            if (a.newPos < b.newPos) {
                                return -1;
                            } else if (a.newPos > b.newPos) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                    });

                    int indNextReverse = 0;
                    for (int ind = 0; ind < n; ++ind) {
                        TaskC.Chameleon c = perm[ind];
                        if (c.dir > 0)
                            c.newColor = c.color;
                        else {
                            while (perm[indNextReverse].dir < 0)
                                indNextReverse = (indNextReverse + 1) % n;
                            TaskC.Chameleon d = perm[indNextReverse];
                            long delta = c.start - d.start;
                            if (delta < 0)
                                delta += L;
                            if (delta <= 2 * T) {
                                // There was at least one change of color!
                                c.newColor = d.color;
                            } else {
                                c.newColor = c.color;
                            }
                        }
                        if (indNextReverse == ind)
                            indNextReverse = (indNextReverse + 1) % n;
                    }
                }

                TaskC.Chameleon first;
                TaskC.Chameleon firstMapsTo;
                // Detemine which chameleon did the first one become
                {
                    List<TaskC.Chameleon> positive = new ArrayList<TaskC.Chameleon>();
                    List<TaskC.Chameleon> negative = new ArrayList<TaskC.Chameleon>();
                    for (TaskC.Chameleon c : chameleon) {
                        if (c.dir == 1)
                            positive.add(c);
                        else
                            negative.add(c);
                    }
                    Collections.sort(positive, new Comparator<TaskC.Chameleon>() {
                        public int compare(TaskC.Chameleon a, TaskC.Chameleon b) {
                            if (a.start < b.start) {
                                return -1;
                            } else if (a.start > b.start) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                    });
                    Collections.sort(negative, new Comparator<TaskC.Chameleon>() {
                        public int compare(TaskC.Chameleon a, TaskC.Chameleon b) {
                            if (a.start < b.start) {
                                return -1;
                            } else if (a.start > b.start) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                    });
                    first = positive.get(0);
                    TaskC.Chameleon closestNegative = negative.get(0);
                    long deltaBest = closestNegative.start - first.start;
                    if (deltaBest < 0)
                        deltaBest += L;
                    for (TaskC.Chameleon c : negative) {
                        long deltaCur = c.start - first.start;
                        if (deltaCur < 0)
                            deltaCur += L;
                        if (deltaCur < deltaBest) {
                            closestNegative = c;
                            deltaBest = deltaCur;
                        }
                    }
                    long timeLeft = T;
                    if (timeLeft < deltaBest / 2) {
                        // The first chameleon stayed himself
                        firstMapsTo = first;
                    } else {
                        timeLeft -= deltaBest / 2;
                        List<Long> positiveDeltas = new ArrayList<Long>();
                        positiveDeltas.add(0L);
                        long sum = 0;
                        for (int i = 0; i < positive.size(); ++i) {
                            long delta = positive.get((positive.size() - i) % positive.size()).start - positive.get((positive.size() - i - 1) % positive.size()).start;
                            if (delta < 0)
                                delta += L;
                            sum += delta;
                            positiveDeltas.add(sum);
                        }
                        int shift = negative.indexOf(closestNegative);
                        List<Long> negativeDeltas = new ArrayList<Long>();
                        negativeDeltas.add(0L);
                        sum = 0;
                        for (int i = 0; i < negative.size(); ++i) {
                            long delta = negative.get((shift + i + 1) % negative.size()).start - negative.get((shift + i) % negative.size()).start;
                            if (delta < 0)
                                delta += L;
                            sum += delta;
                            negativeDeltas.add(sum);
                        }
                        long l = 0;
                        long r = INF;
                        while (r - l > 1) {
                            long m = (l + r) / 2;
                            long cntPositive = (m + 1) / 2;
                            long cntNegative = m / 2;
                            long positiveTimeSpent = mulWithInf(cntPositive / positive.size(), L) + positiveDeltas.get((int) (cntPositive % positive.size()));
                            long negativeTimeSpent = mulWithInf(cntNegative / negative.size(), L) + negativeDeltas.get((int) (cntNegative % negative.size()));
                            if (positiveTimeSpent + negativeTimeSpent <= timeLeft * 2)
                                l = m;
                            else
                                r = m;
                        }
                        if (l % 2 == 0) {
                            firstMapsTo = negative.get((int) ((shift + l / 2) % negative.size()));
                        } else {
                            firstMapsTo = positive.get(((int) ((positive.size() - (l + 1) / 2) % positive.size()) + positive.size()) % positive.size());
                        }
                    }
                }

                // Now, create the final mapping!
                {
                    TaskC.Chameleon[] firstSortedByPos = chameleon.clone();
                    Arrays.sort(firstSortedByPos, new Comparator<TaskC.Chameleon>() {
                        public int compare(TaskC.Chameleon a, TaskC.Chameleon b) {
                            if (a.start < b.start) {
                                return -1;
                            } else if (a.start > b.start) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                    });
                    TaskC.Chameleon[] finalSortedByPos = chameleon.clone();
                    Arrays.sort(finalSortedByPos, new Comparator<TaskC.Chameleon>() {
                        public int compare(TaskC.Chameleon a, TaskC.Chameleon b) {
                            if (a.newPos < b.newPos) {
                                return -1;
                            } else if (a.newPos > b.newPos) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                    });
                    int delta = Arrays.asList(finalSortedByPos).indexOf(firstMapsTo) - Arrays.asList(firstSortedByPos).indexOf(first);
                    res = new TaskC.Chameleon[chameleon.length];
                    for (int i = 0; i < chameleon.length; ++i) {
                        res[firstSortedByPos[i].indexInInput] = finalSortedByPos[((i + delta) % chameleon.length + chameleon.length) % chameleon.length];
                    }
                }
            }

            for (TaskC.Chameleon c : res) {
                out.println(c.newPos / 2);
            }
        }

        private long mulWithInf(long a, long b) {
            if (a == 0)
                return 0;
            else if (INF / a <= b)
                return INF;
            else
                return a * b;
        }

        static class Chameleon {
            long start;
            long newPos;
            int newColor;
            int color;
            int dir;
            int indexInInput;

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

