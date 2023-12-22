
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws InterruptedException {
        new Main().calc();
    }

    int N, K;
    int[] x;
    int[] y;
    char[] c;
    int curMax = 0;

    public void calc() throws InterruptedException {
        N = in.nextInt();
        K = in.nextInt();

        x = new int[N];
        y = new int[N];
        c = new char[N];
        for (int i = 0; i < N; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
            c[i] = in.next().toCharArray()[0];
        }

        // (0,0)から(K-1,K-1)がBlackの場合
        for (int i = 0; i < N; i++) {
            // x[i],y[i]はBlack
            if ((x[i] / K + y[i] / K) % 2 == 0) {
                if (c[i] == 'B') {
                    curMax++;
                }
            } else {
                if (c[i] == 'W') {
                    curMax++;
                }
            }
        }

        CalcThread th1 = new CalcThread();
        CalcThread th2 = new CalcThread();
        CalcThread th3 = new CalcThread();
        CalcThread th4 = new CalcThread();

        th1.run(-K - 1, 0, -K - 1, 0);
        th2.run(-K - 1, 0, 1, K - 1);
        th3.run(1, K - 1, -K - 1, 0);
        th3.run(1, K - 1, 1, K - 1);

        th1.join();
        th2.join();
        th3.join();
        th4.join();

        out.println(curMax);
        out.close();
    }

    class CalcThread extends Thread {
        public void run(int istart, int iend, int jstart, int jend) {

            for (int i = istart; i < iend; i++) {
                if (curMax == N) {
                    break;
                }
                for (int j = jstart; j < jend; j++) {
                    if (curMax == N) {
                        break;
                    }
                    int cur = 0;
                    // System.out.println("==============");
                    // System.out.println("(" + i + ", " + j + ")");
                    for (int k = 0; k < N; k++) {
                        // System.out.println("(" + x[k] + ", " + y[k] + ")");
                        // System.out.println(c[k]);
                        // (0+i,0+j)から(K+i-1,K+j-1)までがBlack
                        // 右上の場合
                        if (x[k] - i >= 0 && y[k] - j >= 0) {
                            if (((Math.abs(x[k] - i) / K) + (Math.abs(y[k] - j) / K)) % 2 == 0) {
                                if (c[k] == 'B') {
                                    cur++;
                                }
                            } else {
                                if (c[k] == 'W') {
                                    cur++;
                                }
                            }
                        } else if (x[k] - i < 0 && y[k] - j >= 0) {
                            if (((Math.abs(x[k] - i) / K) + (Math.abs(y[k] - j) / K)) % 2 == 0) {
                                if (c[k] == 'W') {
                                    cur++;
                                }
                            } else {
                                if (c[k] == 'B') {
                                    cur++;
                                }
                            }

                        } else if (x[k] - i >= 0 && y[k] - j < 0) {
                            if (((Math.abs(x[k] - i) / K) + (Math.abs(y[k] - j) / K)) % 2 == 0) {
                                if (c[k] == 'W') {
                                    cur++;
                                }
                            } else {
                                if (c[k] == 'B') {
                                    cur++;
                                }
                            }

                        } else {
                            if (((Math.abs(x[k] - i) / K) + (Math.abs(y[k] - j) / K)) % 2 == 0) {
                                if (c[k] == 'B') {
                                    cur++;
                                }
                            } else {
                                if (c[k] == 'W') {
                                    cur++;
                                }
                            }
                        }

                        // System.out.println("cur = " + cur);
                    }
                    curMax = Math.max(cur, curMax);
                }
            }
        }
    }

    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
