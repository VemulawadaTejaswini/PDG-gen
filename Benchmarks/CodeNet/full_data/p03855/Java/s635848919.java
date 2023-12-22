import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();

        int[] roads = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            roads[i] = i;
        }
        int[] rails = roads.clone();

        for (int i = 0; i < k; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (roads[right] != roads[left]) {
                roads[roads[left]] = right;
            }
        }
        for (int i = 0; i < l; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (rails[right] != rails[left]) {
                rails[rails[left]] = right;
            }
        }
        int[][] ansMap = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            ansMap[root(roads, i)][root(rails, i)]++;
//            System.out.println("road["+i+"] = " + root(i));
//            System.out.println("rail["+i+"] = " + rootR(i));
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            builder.append(ansMap[roads[i]][rails[i]]).append(" ");
        }

        System.out.println( builder.deleteCharAt(builder.length() - 1));
    }

    private static int root(int[] list, int x) {
        if (list[x] == x) {
            return x;
        } else {
            return list[x] = root(list, list[x]);
        }
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