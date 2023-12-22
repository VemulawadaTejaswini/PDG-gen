import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

    static final long DIV = 1000000007;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        ArrayList<ArrayList<Long>> xx = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> tx = new ArrayList<Long>(Arrays.asList(new Long[] {-10000000000L, 0L, -10000000000L, -10000000000L}));
        xx.add(tx);
        for (int i = 1; i <= n; i++) {
            long l1 = sc.nextLong();
            long l2 = sc.nextLong();
            tx = new ArrayList<Long>(Arrays.asList(new Long[] {l1, l2, l1+l2, l1-l2}));
            xx.add(tx);
        }
        tx = new ArrayList<Long>(Arrays.asList(new Long[] {50000000000L, 0L, 50000000000L, 50000000000L}));
        xx.add(tx);

        Collections.sort(xx, (a, b) -> Long.compare(a.get(3), b.get(3)));

        boolean[] rm = new boolean[n+2];

        int lpos = 1;
        int rpos = 2;

        for (int i = 1; i < xx.size(); i++) {
            if(xx.get(i-1).get(2) >= xx.get(i).get(2)) xx.remove(i-1);
        }


        int ans = 0;
        for (int i = 1; i < xx.size(); i++) {
            if(xx.get(i).get(3) < xx.get(i-1).get(2)) xx.remove(i);
        }

        System.out.println(xx.size() - 2);

    }



    private static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
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

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

}

