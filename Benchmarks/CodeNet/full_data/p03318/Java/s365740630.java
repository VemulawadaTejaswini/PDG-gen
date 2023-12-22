import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
        FasterScanner in = new FasterScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public double getScore(long n) {
            double s = 0;
            String ns = Long.toString(n);

            for (char cc : ns.toCharArray()) s += cc - 48;

            return (double) n / s;
        }

        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            int k = in.nextInt();
            List<Long> possibleNum = new ArrayList<>();

            for (long i = 1; i <= 15; i++) {
                long cn = 0;
                for (long j = 0; j < i - 1; j++) cn += 9 * Math.pow(10, j);
                for (long j = 1; j <= 9; j++) possibleNum.add(cn + j * (long) Math.pow(10, i - 1));
            }

            List<Double> scores = new ArrayList<>();
            for (long cn : possibleNum) scores.add(getScore(cn));

            List<Long> snukeNum = new ArrayList<>();

            for (int i = 0; i < possibleNum.size(); i++) {
                double cs = scores.get(i);
                boolean isSnukeNum = true;
                for (int j = i + 1; j < possibleNum.size(); j++) {
                    double ts = scores.get(j);
                    if (cs > ts) {
                        isSnukeNum = false;
                        break;
                    }
                }
                if (isSnukeNum) snukeNum.add(possibleNum.get(i));
            }

            for (int i = 0; i < k; i++) out.println(snukeNum.get(i));
        }

    }

    static class FasterScanner {
        private InputStream in;
        private byte[] buffer;
        private int bufPointer;
        private int bufLength;

        public FasterScanner(InputStream in) {
            this.in = in;
            buffer = new byte[1024];
        }

        private boolean hasNextByte() {
            if (bufPointer < bufLength) return true;
            bufPointer = 0;
            try {
                bufLength = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (bufLength > 0);
        }

        private int readByte() {
            if (hasNextByte()) return buffer[bufPointer++];
            return -1;
        }

        private static boolean isPrintableChar(int c) {
            return (c >= 33 && c <= 126);
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[bufPointer])) bufPointer++;
            return hasNextByte();
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
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
            if (b < '0' || b > '9') throw new NumberFormatException();

            while (true) {
                if (b >= '0' && b <= '9') {
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

