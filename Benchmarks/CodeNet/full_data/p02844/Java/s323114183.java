import java.io.IOException;
import java.io.InputStream;
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

    static int calcNumOfCombination(int n, int r) {
        int num = 1;
        for (int i = 1; i <= r; i++) {
            num = num * (n - i + 1) / i;
        }
        return num;
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        char[] str = fs.next().toCharArray();
        int count = 0;

        for (int i = 0; i < 1000; i++) {
            for (int m = 0; m < str.length; m++) {
                if (i == str[m]) {
                    for (int j = 0; j < 1000; j++) {
                        for (int l = m + 1; l < str.length; l++) {
                            if (j == str[l]) {
                                for (int k = 0; k < 1000; k++) {
                                    for (int o = l + 1; o < str.length; o++) {
                                        if (k == str[o]) {
                                            count++;
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        }

                    }
                    break;
                }
            }

        }
        System.out.println(count);
    }

}
