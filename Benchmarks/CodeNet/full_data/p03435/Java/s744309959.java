import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        final int N = 3;

        int[][] c = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                c[i][j] = fs.nextInt();

        // 3つの解法
        // いずれも等価

        // パターン1 たすき掛け検証
        boolean flg = false;

        if ((c[0][0] + c[1][1] == c[0][1] + c[1][0])
            && (c[0][1] + c[1][2] == c[0][2] + c[1][1])
            && (c[1][0] + c[2][1] == c[1][1] + c[2][0])
            && (c[1][1] + c[2][2] == c[1][2] + c[2][1])) flg = true;

        // パターン2 横引き算縦検証
        //boolean flg = false;

        //if ((c[0][0] - c[0][1] == c[1][0] - c[1][1])
        //    && (c[1][0] - c[1][1] == c[2][0] - c[2][1])
        //    && (c[0][1] - c[0][2] == c[1][1] - c[1][2])
        //    && (c[1][1] - c[1][2] == c[2][1] - c[2][2])) flg = true;

        // パターン3 a1をゼロとして検証
        // (a1, a2, a3, b1, b2, b3)
        // = (p1, p2, p3, q1, q2, q3)

        // (p1, p2, p3, q1, q2, q3)
        // = (p1 - x, p2 - x, p3 - x, q1 + x, q2 + x, q3 + x)
        // = (0, p2 - p1, p3 - p1, q1 + p1, q2 + p1, q3 + p1)

        // = (0, c21 - c11, c31 - c11, c11, c12, c13)
        // 0-indexed
        //int[] p = {0, c[1][0] - c[0][0], c[2][0] - c[0][0]};
        //int[] q = {c[0][0], c[0][1], c[0][2]};

        //boolean flg = true;

        // 全項で逐一検証
        //for (int i = 0; i < N; i++)
        //    for (int j = 0; j< N; j++)
        //        if (c[i][j] != p[i] + q[j] ) {
        //            flg = false;
        //            break;
        //        }

        out.println(flg ? "Yes" : "No");

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
