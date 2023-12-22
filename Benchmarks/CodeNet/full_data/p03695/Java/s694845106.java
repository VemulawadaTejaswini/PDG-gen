import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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

public class Main {
    static int[] w = new int[100010];
    static int[] v = new int[100010];
    static int[][] dp = new int[110][100010];
    static int k;

    static int chmin(int a, int b) {
        if (a > b) {
            a = b;
            return a;
        }
        return a;
    }

    static int chmax(int a, int b) {
        if (a < b) {
            a = b;
            return a;
        }
        return a;
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        List<Integer> array = new ArrayList<>();
        boolean[] colors = new boolean[8];
        int freeColor = 0;
        for (int i = 0; i < n; i++) {
            int color = fs.nextInt();
            if (color >= 1 && color <= 399)
                colors[0] = true;
            else if (color >= 400 && color <= 799)
                colors[1] = true;
            else if (color >= 800 && color <= 1199)
                colors[2] = true;
            else if (color >= 1200 && color <= 1599)
                colors[3] = true;
            else if (color >= 1600 && color <= 1999)
                colors[4] = true;
            else if (color >= 2000 && color <= 2399)
                colors[5] = true;
            else if (color >= 2400 && color <= 2799)
                colors[6] = true;
            else if (color >= 2800 && color <= 3199)
                colors[7] = true;
            else
                freeColor++;
        }
        int minC = 0;
        for (int i = 0; i < 8; i++) {
            if (colors[i] == true)
                minC++;
        }
        if (minC == 0 && freeColor != 0)
            System.out.print(1 + " ");
        else
            System.out.print(minC + " ");

        int maxC = minC + freeColor;

        System.out.println(maxC);

    }

}
