import java.util.*;
import java.io.*;

public class Main implements Runnable {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        // keep stack
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    public void run() {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt();
        int[] t = new int[N + 1];
        int[] x = new int[N + 1];
        int[] y = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        boolean result = true;
        for (int i = 1; i < N + 1; i++) {
            int xDist = Math.abs(x[i] - x[i - 1]);
            int yDist = Math.abs(y[i] - y[i - 1]);
            int dist = xDist + yDist;
            if (dist <= (t[i] - t[i - 1]) && (dist % 2) == ((t[i] - t[i - 1]) % 2)) {
                continue;
            }
            result = false;
            break;
        }

        if (result) {
            out.printf("Yes\n");
        } else {
            out.printf("No\n");
        }
        out.flush();
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
        if (hasNextByte()) {
            return buffer[ptr++];
        }
        else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
    }

    public boolean hasNext() {
        skipUnprintable();
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

    public int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int n = 0;
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
}