import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        FastScanner sc = new FastScanner();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Long[] aArray = new Long[a];
        Long[] bArray = new Long[b];
        Long[] cArray = new Long[c];
        for (int i = 0; i < a; i++) {
            aArray[i] = sc.nextLong();
        }
        for (int i = 0; i < b; i++) {
            bArray[i] = sc.nextLong();
        }
        for (int i = 0; i < c; i++) {
            cArray[i] = sc.nextLong();
        }
        Arrays.sort(aArray, Comparator.reverseOrder());
        Arrays.sort(bArray, Comparator.reverseOrder());
        Arrays.sort(cArray, Comparator.reverseOrder());
        long ans = 0;
        for (int i = 0; i < x; i++) {
            ans += aArray[i];
        }
        for (int i = 0; i < y; i++) {
            ans += bArray[i];
        }
        int aIndex = x - 1;
        int bIndex = y - 1;
        for (int i = 0; i < c; i++) {
            if (bIndex >= 0 && aArray[aIndex] > bArray[bIndex]) {
                if (cArray[i] > bArray[bIndex]) {
                    ans -= bArray[bIndex--];
                    ans += cArray[i];
                }
            } else {
                if (aIndex >= 0 && cArray[i] > aArray[aIndex]) {
                    ans -= aArray[aIndex--];
                    ans += cArray[i];
                }
            }
        }
        System.out.println(ans);
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
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
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
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
    }
}