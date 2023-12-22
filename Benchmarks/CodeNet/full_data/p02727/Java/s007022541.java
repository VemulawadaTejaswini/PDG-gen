import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.io.IOException;
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
        ERedAndGreenApples solver = new ERedAndGreenApples();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERedAndGreenApples {
        PrintWriter out;
        InputReader in;

        long kth(long arr1[], long arr2[], int m, int n, int k, int st1, int st2) {
            // In case we have reached end of array 1
            if (st1 == m) {
                return arr2[st2 + k - 1];
            }

            // In case we have reached end of array 2
            if (st2 == n) {
                return arr1[st1 + k - 1];
            }

            // k should never reach 0 or exceed sizes
            // of arrays
            if (k == 0 || k > (m - st1) + (n - st2)) {
                return -1;
            }

            // Compare first elements of arrays and return
            if (k == 1) {
                return (arr1[st1] < arr2[st2])
                        ? arr1[st1] : arr2[st2];
            }
            int curr = k / 2;

            // Size of array 1 is less than k / 2
            if (curr - 1 >= m - st1) {

                // Last element of array 1 is not kth
                // We can directly return the (k - m)th
                // element in array 2
                if (arr1[m - 1] < arr2[st2 + curr - 1]) {
                    return arr2[st2 + (k - (m - st1) - 1)];
                } else {
                    return kth(arr1, arr2, m, n, k - curr,
                            st1, st2 + curr);
                }
            }

            // Size of array 2 is less than k / 2
            if (curr - 1 >= n - st2) {
                if (arr2[n - 1] < arr1[st1 + curr - 1]) {
                    return arr1[st1 + (k - (n - st2) - 1)];
                } else {
                    return kth(arr1, arr2, m, n, k - curr,
                            st1 + curr, st2);
                }
            } else

                // Normal comparison, move starting index
                // of one array k / 2 to the right
                if (arr1[curr + st1 - 1] < arr2[curr + st2 - 1]) {
                    return kth(arr1, arr2, m, n, k - curr,
                            st1 + curr, st2);
                } else {
                    return kth(arr1, arr2, m, n, k - curr,
                            st1, st2 + curr);
                }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int x = ni(), y = ni(), a = ni(), b = ni(), c = ni();
            long[] P = new long[a];
            long[] Q = new long[b];
            long[] R = new long[c];
            long[] pf = new long[b];
            int i = 0;
            for (i = 0; i < a; i++)
                P[i] = nl();
            sort(P);
            long sum1 = 0;
            for (i = 0; i < b; i++)
                sum1 += Q[i] = nl();
            //pn(sum1);
            sort(Q);
            for (i = b - 1; i >= 0; i--) {
                pf[i] = Q[i];
                if (i < b - 1)
                    pf[i] += pf[i + 1];
            }
            for (i = 0; i < c; i++)
                R[i] = nl();
            sort(R);
            long[] pf1 = new long[c];
            for (i = c - 1; i >= 0; i--) {
                pf1[i] = R[i];
                if (i < c - 1)
                    pf1[i] += pf1[i + 1];
            }
            TreeMap<Long, Long> tmap3 = new TreeMap<>();
            //for(i = 0; i < c; i++)

            long[] ans = new long[c];
            TreeMap<Long, Long> tmap1 = new TreeMap<>();
            TreeMap<Long, Long> tmap2 = new TreeMap<>();
            TreeMap<Long, Long> tmap13 = new TreeMap<>();
            HashMap<Long, Integer> hmap1 = new HashMap<>();
            HashMap<Long, Integer> hmap2 = new HashMap<>();
            long sum2 = 0;
            for (i = 0; i < b; i++) {
                sum2 += Q[i];
                tmap1.put(Q[i], sum2);
                tmap2.put(Q[i], (long) i + 1);
                hmap1.put(Q[i], hmap1.getOrDefault(Q[i], 0) + 1);
            }
            long sum3 = sum2;
            sum2 = 0;
            //pn(sum1);
            for (i = 0; i < c; i++) {
                sum2 += R[i];
                tmap13.put(R[i], sum2);
                tmap3.put(R[i], (long) i + 1);
                hmap2.put(R[i], hmap2.getOrDefault(R[i], 0) + 1);
                long lol = kth(Q, R, b, i + 1, b + i + 1 - y, 0, 0);
                long to_remove = sum1 + sum2;
                long removed = 0;
                if (tmap1.lowerKey(lol) != null) {
                    to_remove -= tmap1.get(tmap1.lowerKey(lol));
                    removed += tmap2.get(tmap2.lowerKey(lol));
                }
                //pn(removed);
                if (tmap13.lowerKey(lol) != null) {
                    to_remove -= tmap13.get(tmap13.lowerKey(lol));
                    removed += tmap3.get(tmap3.lowerKey(lol));
                }

                //int loll = hmap1.get(hmap1.getOrDefault(lol, 0)) + hmap2.get(hmap2.getOrDefault(lol, 0));
                long rem = b + i + 1 - y - removed;
                //pn(lol +" "+to_remove +" "+removed +" "+rem);
                to_remove -= (lol * rem);
                ans[i] = to_remove;
            }
            //pn(Arrays.toString(ans));
            int xx = 0;
            sum2 = 0;
            long max = 0;
            for (i = a - 1; i >= 0; i--) {
                sum2 += P[i];
                xx++;
                int to_take = x - xx;
                if (to_take == 0) {
                    max = Math.max(max, sum2 + ans[c - 1]);
                    break;
                }
                if (c - to_take - 1 >= 0 && c - to_take < c)
                    max = Math.max(sum2 + ans[c - to_take - 1] + pf1[c - to_take], max);
                else if (c - to_take - 1 == -1 && c - to_take < c)
                    max = Math.max(sum2 + pf1[c - to_take] + pf[b - y], max);
            }
            if (c == x)
                max = Math.max(pf1[0] + pf[b - y], max);
            if (c > x)
                max = Math.max(ans[c - x - 1] + pf1[c - x], max);
            pn(max);
        }

        void sort(long[] A) {
            PriorityQueue<Long> pq = new PriorityQueue();
            int i = 0;
            for (i = 0; i < A.length; i++)
                pq.add(A[i]);
            for (i = 0; i < A.length; i++)
                A[i] = pq.poll();
        }

        int ni() {
            return in.nextInt();
        }

        long nl() {
            return in.nextLong();
        }

        void pn(long zx) {
            out.println(zx);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

