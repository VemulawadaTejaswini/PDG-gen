import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
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
        BBingo solver = new BBingo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBingo {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            ArrayList<Integer> a1 = new ArrayList<>();
            ArrayList<Integer> a2 = new ArrayList<>();
            ArrayList<Integer> a3 = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                a1.add(in.nextInt());
            }
            for (int i = 0; i < 3; i++) {
                a2.add(in.nextInt());
            }
            for (int i = 0; i < 3; i++) {
                a3.add(in.nextInt());
            }
            int n = in.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            while (in.hasNext()) array.add(in.nextInt());
            ArrayList<Integer> bingo = new ArrayList<>();
            for (int i : array) {
                if (a1.contains(i)) {
                    bingo.add(a1.indexOf(i) + 1);
                }
                if (a2.contains(i)) {
                    bingo.add(a2.indexOf(i) + 4);
                }
                if (a3.contains(i)) {
                    bingo.add(a3.indexOf(i) + 7);
                }
            }


            out.println(getBingo(bingo) ? "Yes" : "No");

        }

        boolean getBingo(ArrayList<Integer> array) {
            if (array.contains(1) && array.contains(2) && array.contains(3)) return true;
            if (array.contains(4) && array.contains(5) && array.contains(6)) return true;
            if (array.contains(7) && array.contains(8) && array.contains(9)) return true;
            if (array.contains(1) && array.contains(4) && array.contains(7)) return true;
            if (array.contains(2) && array.contains(5) && array.contains(8)) return true;
            if (array.contains(3) && array.contains(6) && array.contains(9)) return true;
            if (array.contains(1) && array.contains(5) && array.contains(9)) return true;
            return array.contains(3) && array.contains(5) && array.contains(7);

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

