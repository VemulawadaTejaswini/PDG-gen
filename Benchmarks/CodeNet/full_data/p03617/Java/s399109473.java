

import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        Map<Long, Integer> tmap = new TreeMap<>();
        tmap.put(sc.nextLong() * 8, 1);
        tmap.put(sc.nextLong() * 4, 2);
        tmap.put(sc.nextLong() * 2, 4);
        tmap.put(sc.nextLong(), 8);
        long n = sc.nextLong() * 4;
        long ans = 0;
        
        Set<Map.Entry<Long, Integer>> mset = tmap.entrySet();
        for (Map.Entry<Long, Integer> e : mset) {
            while (e.getValue() <= n) {
                n -= e.getValue();
                if (e.getValue() == 4) {
                    ans += e.getKey() / 2;
                } else if (e.getValue() == 2) {
                    ans += e.getKey() / 4;
                } else if (e.getValue() == 1) {
                    ans += e.getKey() / 8;
                } else {
                    ans += e.getKey();
                }
            }
            if (n == 0) break;
        }
        
        out.println(ans);
        
        out.flush();
    }

}

// https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
class FastScanner {

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
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
