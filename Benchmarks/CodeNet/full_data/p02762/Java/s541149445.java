import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    private static HashMap<Integer, ArrayList<Integer>> map;
    private static Boolean[][] list;
    private static boolean[][] searched;
    private static int[] ansL;

    public static void main(String[] args) {
        // write your code here

        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        map = new HashMap<>();
        list = new Boolean[n][n];
        searched = new boolean[n][n];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            list[a][b] = true;
            list[b][a] = true;
            map.computeIfAbsent(a, k1 -> new ArrayList<>()).add(b);
            map.computeIfAbsent(b, k1 -> new ArrayList<>()).add(a);
        }

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            list[a][b] = false;
            list[b][a] = false;
        }

        ansL = new int[n];

        // 始点
        for (int i = 0; i < n; i++) {
            if (map.get(i) != null) {
                for (Integer v:
                        map.get(i)) {
                    countAns(i, v);
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(ansL[i] - 1).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.println(builder);
    }

    private static void countAns(int parent, int child) {
        if (map.get(child) == null) {
            return;
        }
        for (Integer v:
             map.get(child)) {
            if (!searched[parent][v]) {
                searched[parent][v] = true;
                if (list[parent][v] == null) {
                    ansL[parent]++;
                }
                countAns(parent, v);
            }
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