import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.util.HashMap;
import java.util.Map.Entry;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();

        final Integer n = fs.nextInt();

        HashMap<Integer, Integer> e = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> o = new HashMap<Integer, Integer>();

        e.put(0, 0);
        o.put(0, 0);

        for (int i = 0; i < n; i++) {
            Integer x = fs.nextInt();
            if (i % 2 == 0) {
                if (!e.containsKey(x)) e.put(x, 0);
                e.put(x, e.get(x) + 1);
            } else {
                if (!o.containsKey(x)) o.put(x, 0);
                o.put(x, o.get(x) + 1);
            }
        }

        Integer EK1 = -1;
        Integer E1 = -1;
        Integer E2 = -1;

        for (Entry<Integer, Integer> en : e.entrySet()) {
            if (E1 < en.getValue()) {
                E2 = E1;
                EK1 = en.getKey();
                E1 = en.getValue();
            } else if (E2 < en.getValue()) {
                E2 = en.getValue();
            }
        }

        Integer OK1 = -1;
        Integer O1 = -1;
        Integer O2 = -1;

        for (Entry<Integer, Integer> en : o.entrySet()) {
            if (O1 < en.getValue()) {
                O2 = O1;
                OK1 = en.getKey();
                O1 = en.getValue();
            } else if (O2 < en.getValue()) {
                O2 = en.getValue();
            }
        }

        if (EK1.equals(OK1)) {
            System.out.println(
                Math.min(n - E1 - O2, n - E2 - O1));
        } else {
            System.out.println(n - E1 - O1);
        }
    }
}

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
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
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
        while(true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if(b == -1 || !isPrintableChar(b)) {
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
