import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Deque;
import java.util.Map;
import java.util.Queue;
import java.util.Comparator;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            Integer[] reqNum = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};

            Integer[] a = new Integer[m];
            for (int i = 0; i < m; i++)
                a[i] = in.nextInt();

            Comparator<Integer> mcComparator = (i, j) -> (reqNum[i].equals(reqNum[j]) ? i - j : reqNum[i] - reqNum[j]);
            Arrays.sort(a, mcComparator);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n / reqNum[a[0]]; i++)
                sb.append(a[0]);
            n = n % reqNum[a[0]];

            // REDUNDANT
            while (n > 0) {
                n += reqNum[a[0]];
                sb.delete(sb.length() - 1, sb.length());

                int cn = n;

                Map<Integer, Deque<String>> reqNumToNumStringMap = new HashMap<>();
                Deque<String> numStringDeque = new ArrayDeque<>();
                numStringDeque.add("");
                reqNumToNumStringMap.put(cn, numStringDeque);

                while (true) {
                    boolean finished = true;
                    for (int i = reqNum[a[0]]; i <= cn; i++) {
                        if (reqNumToNumStringMap.containsKey(i)) {
                            while (reqNumToNumStringMap.get(i).size() > 0) {
                                String cs = reqNumToNumStringMap.get(i).poll();
                                for (int ca : a) {
                                    if (reqNum[ca] <= i) {
                                        finished = false;
                                        int rn = i - reqNum[ca];
                                        if (!reqNumToNumStringMap.containsKey(rn))
                                            reqNumToNumStringMap.put(rn, new ArrayDeque<>());
                                        reqNumToNumStringMap.get(rn).add(cs + ca);
                                    }
                                }
                            }
                        }
                    }
                    if (finished)
                        break;
                }

                if (reqNumToNumStringMap.containsKey(0)) {
                    int max = 0;
                    for (String cs : reqNumToNumStringMap.get(0)) {
                        Queue<Character> pq = new PriorityQueue<>(Comparator.reverseOrder());
                        for (char c : cs.toCharArray()) {
                            pq.add(c);
                        }
                        StringBuilder cp = new StringBuilder();
                        while (pq.size() > 0)
                            cp.append(pq.poll());
                        int cpn = Integer.parseInt(cp.toString());
                        if (cpn > max)
                            max = cpn;
                    }
                    StringBuilder bigger = new StringBuilder();
                    for (char c : Integer.toString(max).toCharArray()) {
                        if (c - '0' >= a[0])
                            bigger.append(c);
                        else
                            sb.append(c);
                    }
                    sb = bigger.append(sb);
                    out.println(sb);
                    return;
                }
            }

        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
            this.bufPointer = 0;
            this.bufLength = 0;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int nextInt() {
            int n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

    }
}

