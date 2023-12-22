import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

class State {
    final int from;
    final int to;
    int count;

    public State (int from, int to) {
        this.from = from;
        this.to = to;
    }
}

@SuppressWarnings("unchecked")
public class Main {
    static final int ANY = 3200;

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        final int N = nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) a[i] = nextInt();

        State[] s = new State[8];

        int ix = 0;
        s[ix++] = new State(1, 399);
        s[ix++] = new State(400, 799);
        s[ix++] = new State(800, 1199);
        s[ix++] = new State(1200, 1599);
        s[ix++] = new State(1600, 1999);
        s[ix++] = new State(2000, 2399);
        s[ix++] = new State(2400, 2799);
        s[ix++] = new State(2800, 3199);

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (ANY <= a[i]) cnt++;

            for (State x : s)
                if (x.from <= a[i] && a[i] <= x.to) x.count++;
        }

        int ans = 0;

        for (State x : s) if (0 < x.count) ans++;

        out.println((ans == 0 ? 1 : ans) + " " + (ans + cnt));

        out.flush();
    }

    // FastScanner start
    static final InputStream in = System.in;
    static final byte[] buffer = new byte[1024];
    static int ptr = 0;
    static int buflen = 0;
    static boolean hasNextByte() {
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
    static int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    static String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static long nextLong() {
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
            } else if(b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
    static double nextDouble() {
        return Double.parseDouble(next());
    }
    // FastScanner end
}
