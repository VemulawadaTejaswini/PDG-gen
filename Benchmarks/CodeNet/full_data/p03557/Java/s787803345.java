import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // input
        FastScanner sc = new FastScanner();

        int n = sc.nextInt();

        int[] aList = new int[n];
        int[] bList = new int[n];
        int[] cList = new int[n];

        for (int i = 0; i < n; i++) {
            aList[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bList[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            cList[i] = sc.nextInt();
        }

        // sort
        Arrays.sort(aList);
        Arrays.sort(bList);
        Arrays.sort(cList);

        long ans = 0;
        int bLower = 0;

        // aを決定
        parent : for (int i = 0; i < n; i++) {
            // bを決定
            int bIndex;
            int upper = n - 1; // 上限index
            while (true) {
                if (bLower >= upper) {
                    bIndex = bLower;
                    break;
                }
                // 二分探索index
                int mid = (bLower + upper) / 2;
                if (bList[mid] <= aList[i]) {
                    bLower = mid + 1;
                } else {
                    upper = Math.max(mid - 1, 0);
                }
            }

            if (bList[bIndex] <= aList[i]) {
                while (bList[bIndex] <= aList[i]) {
                    if (++bIndex == n) {
                        continue parent;
                    }
                }
            }

            // bをもとにcの個数を決定
            int cLower = 0;
            bLoop : for (int j = bIndex; j < n; j++) {
                upper = n - 1;
                while (true) {
                    if (cLower >= upper) {
                        while (cList[cLower] <= bList[j]) {
                            if (++cLower == n) {
                                continue bLoop;
                            }
                        }
                        ans += n - cLower;
                        break;
                    }
                    // 二分探索index
                    int mid = (cLower + upper) / 2;
                    if (cList[mid] <= bList[j]) {
                        cLower = mid + 1;
                    } else {
                        upper = Math.max(mid - 1, 0);
                    }
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