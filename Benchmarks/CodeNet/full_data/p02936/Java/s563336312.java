import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    private static Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    private static long[] values;
    private static boolean[] searched;

    public static void main(String[] args) {
        // write your code here
        FastScanner scanner = new FastScanner();

        int n = scanner.nextInt();
        int q = scanner.nextInt();
        values = new long[n];
        searched = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            map.computeIfAbsent(v1, k -> new ArrayList<>()).add(v2);
            map.computeIfAbsent(v2, k -> new ArrayList<>()).add(v1);
        }

        for (int i = 0; i < q; i++) {
            values[scanner.nextInt() - 1] += scanner.nextInt();
        }

        searched[0] = true;
        searchAndAdd(1);

        StringBuilder builder = new StringBuilder();
        for (Long v: values
             ) {
            builder.append(v).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);

        System.out.println(builder);
    }

    private static void searchAndAdd(int parent) {
        ArrayList<Integer> v = map.getOrDefault(parent, new ArrayList<>());
        for (Integer child: v
             ) {
            if (!searched[child - 1]) {
                values[child - 1] += values[parent - 1];
                searched[child - 1] = true;
                searchAndAdd(child);
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
            }else{
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
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }else if(b == -1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
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