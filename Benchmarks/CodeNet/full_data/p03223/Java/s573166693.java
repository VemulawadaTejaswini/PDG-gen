import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FasterScanner in = new FasterScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            final int n = in.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++)
                a[i] = in.nextLong();

            Arrays.sort(a);

            ArrayDeque<Long> q = new ArrayDeque<>();
            for (long cn : a) q.add(cn);

            boolean f = true;
            LinkedList<Long> b1 = new LinkedList<>();
            b1.addFirst(q.poll());
            while (q.size() > 0) {
                if (f) {
                    b1.addFirst(q.pollLast());
                    if (q.size() > 0) b1.addLast(q.pollLast());
                } else {
                    b1.addFirst(q.pollFirst());
                    if (q.size() > 0) b1.addLast(q.pollFirst());
                }
                f = !f;
            }

            LinkedList<Long> b2 = new LinkedList<>();
            for (long cn : a) q.add(cn);
            b2.addFirst(q.pollLast());
            while (q.size() > 0) {
                if (!f) {
                    b2.addLast(q.pollLast());
                    if (q.size() > 0) b2.addFirst(q.pollLast());
                } else {
                    b2.addLast(q.pollFirst());
                    if (q.size() > 0) b2.addFirst(q.pollFirst());
                }
                f = !f;
            }

            long ans1 = 0;
            long ans2 = 0;
            ArrayList<Long> c1 = new ArrayList<>();
            ArrayList<Long> c2 = new ArrayList<>();
            c1.addAll(b1);
            c2.addAll(b2);

            for (int i = 0; i < n - 1; i++) {
                ans1 += Math.abs(c1.get(i + 1) - c1.get(i));
                ans2 += Math.abs(c2.get(i + 1) - c2.get(i));
            }

            out.println(Math.max(ans1, ans2));
        }

    }

    static class FasterScanner {
        private InputStream in;
        private byte[] buffer;
        private int bufPointer;
        private int bufLength;

        public FasterScanner(InputStream in) {
            this.in = in;
            buffer = new byte[1024];
        }

        private boolean hasNextByte() {
            if (bufPointer < bufLength) return true;
            bufPointer = 0;
            try {
                bufLength = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (bufLength > 0);
        }

        private int readByte() {
            if (hasNextByte()) return buffer[bufPointer++];
            return -1;
        }

        private static boolean isPrintableChar(int c) {
            return (c >= 33 && c <= 126);
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[bufPointer])) bufPointer++;
            return hasNextByte();
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || b > '9') throw new NumberFormatException();

            while (true) {
                if (b >= '0' && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

    }
}

