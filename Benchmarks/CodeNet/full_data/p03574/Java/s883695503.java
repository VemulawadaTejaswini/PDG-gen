import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BMinesweeper solver = new BMinesweeper();
        solver.solve(1, in, out);
        out.close();
    }

    static class BMinesweeper {
        String[][] array;
        int h;
        int w;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();
            array = new String[h][w];

            for (int i = 0; i < h; i++) {
                String str = in.next();
                for (int j = 0; j < w; j++) {
                    array[i][j] = String.valueOf(str.charAt(j));
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (array[i][j].equals(".")) {
                        array[i][j] = countBomb(i, j);
                    }
                    if (j != w - 1) {
                        out.print(array[i][j]);
                    } else {
                        out.println(array[i][j]);
                    }
                }
            }


        }

        String countBomb(int i, int j) {
            int retCount = 0;
            if (i != 0 && j != 0) {
                if (array[i - 1][j - 1].equals("#")) {
                    retCount++;
                }
            }
            if (i != 0) {
                if (array[i - 1][j].equals("#")) {
                    retCount++;
                }
            }
            if (i != 0 && j != w - 1) {
                if (array[i - 1][j + 1].equals("#")) {
                    retCount++;
                }
            }
            if (j != 0) {
                if (array[i][j - 1].equals("#")) {
                    retCount++;
                }
            }
            if (j != w - 1)
                if (array[i][j + 1].equals("#")) {
                    retCount++;
                }
            if (i != h - 1 && j != 0) {
                if (array[i + 1][j - 1].equals("#")) {
                    retCount++;
                }
            }
            if (i != h - 1) {
                if (array[i + 1][j].equals("#")) {
                    retCount++;
                }
            }
            if (i != h - 1 && j != w - 1) {
                if (array[i + 1][j + 1].equals("#")) {
                    retCount++;
                }
            }
            return String.valueOf(retCount);
        }

    }

    static class Scanner {
        private final InputStream in;
        private final byte[] buffer;
        private int ptr;
        private int buflen;

        public Scanner(InputStream in) {
            this.in = in;
            this.buffer = new byte[1024];
            this.ptr = 0;
            this.buflen = 0;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) return false;
            }
            return true;
        }

        private byte readByte() {
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        private boolean isPrintableChar(byte c) {
            return '!' <= c && c <= '~';
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
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            byte b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            if (!hasNext()) throw new NoSuchElementException();
            int n = 0;
            boolean minus = false;
            byte b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
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
}

