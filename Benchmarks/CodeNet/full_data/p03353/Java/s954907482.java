import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;
import java.util.NoSuchElementException;
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
        FasterScanner in = new FasterScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            String s = in.next();
            final int k = in.nextInt();

            List<String> ans = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                String ss = s.substring(i, i + 1);
                if (!ans.contains(ss)) ans.add(ss);
            }
            Collections.sort(ans);
            ans = ans.subList(0, Math.min(k, ans.size()));

            while (true) {
                List<String> next = new LinkedList<>();
                for (String cs : ans) {
                    String clone = s;
                    while (clone.contains(cs)) {
                        int index = clone.indexOf(cs);
                        String ns = clone.substring(index, Math.min(index + cs.length() + 1, clone.length()));
                        if (!next.contains(ns)) next.add(ns);
                        clone = clone.subSequence(0, index) + clone.substring(index + 1, clone.length());
                    }
                    if (!next.contains(cs)) next.add(cs);
                }
                Collections.sort(next);
                if (ans.size() < k) {
                    ans = next.subList(0, Math.min(k, next.size()));
                    continue;
                }
                for (int i = 0; i < k; i++) {
                    if (!ans.get(i).equals(next.get(i))) break;
                    if (i == k - 1) {
                        out.println(ans.get(k - 1));
                        return;
                    }
                }
                ans = next.subList(0, Math.min(k, next.size()));
            }
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

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
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

