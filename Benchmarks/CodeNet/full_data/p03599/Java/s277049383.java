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
        FasterScanner in = new FasterScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            final int a = in.nextInt();
            final int b = in.nextInt();
            final int c = in.nextInt();
            final int d = in.nextInt();
            final int e = in.nextInt();
            final int f = in.nextInt();

            double maxRatio = (double) e / ((double) e + 100.0);
            double ansRatio = 0;
            int ansWater = 0;
            int ansSugar = 0;
            for (int i = 0; i * a * 100 <= f; i++) {
                int ia = i * a * 100;
                for (int j = 0; ia + (j * b * 100) <= f; j++) {
                    int jb = j * b * 100;
                    for (int k = 0; ia + jb + (k * c) <= f; k++) {
                        int kc = k * c;
                        for (int l = 0; ia + jb + kc + (l * d) <= f; l++) {
                            int s = kc + (l * d);
                            int w = ia + jb + s;
                            double r = (double) s / (double) w;
                            if (r > maxRatio) break;
                            else if (r > ansRatio) {
                                ansRatio = r;
                                ansWater = w;
                                ansSugar = s;
                            }
                        }
                    }
                }
            }

            out.println(ansWater + " " + ansSugar);
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

