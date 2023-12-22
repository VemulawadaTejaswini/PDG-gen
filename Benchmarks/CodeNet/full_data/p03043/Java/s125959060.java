import java.io.InputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        final MyScanner sc = new MyScanner();
        final double n = sc.nextDouble();
        final double k = sc.nextDouble();
        
        double answer = 0;
        for (int i = 1; i <= n; i++) {
            double temp = 1.0 / n;
            int now = i;
            while (now < k) {
                now *= 2;
                temp /= 2;
            }
            answer += temp;
        }
        
        System.out.println(answer);
    }
}

class MyScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int pointer = 0;
    private int bufLength = 0;

    private boolean hasNextByte() {
        if (pointer < bufLength) {
            return true;
        } else {
            pointer = 0;
            try {
                bufLength = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bufLength <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[pointer++];
        } else {
            return -1;
        }
    }

    private static boolean isNumberChar(int c) {
        return '0' <= c && c <= '9';
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[pointer])) {
            pointer++;
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
        long num = 0;
        boolean isNegative = false;
        int b = readByte();
        if (b == '-') {
            isNegative = true;
            b = readByte();
        }
        if (!isNumberChar(b)) {
            throw new NumberFormatException();
        }
        while (true) {
            if (isNumberChar(b)) {
                num *= 10;
                num += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return isNegative ? -num : num;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long temp = nextLong();
        if (temp < Integer.MIN_VALUE || Integer.MAX_VALUE < temp) {
            throw new NumberFormatException();
        }
        return (int) temp;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
