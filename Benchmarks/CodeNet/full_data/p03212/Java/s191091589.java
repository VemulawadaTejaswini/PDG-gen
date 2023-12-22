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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            String n = in.next();
            int digitLen = n.length();

            char[] n753 = {'7', '5', '3', '0'};
            int[][][][][][] memo = new int[digitLen + 1][2][2][2][2][2];

            memo[0][0][0][0][0][0] = 1;
            for (int i = 0; i < digitLen; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        for (int n3 = 0; n3 < 2; n3++) {
                            for (int n5 = 0; n5 < 2; n5++) {
                                for (int n7 = 0; n7 < 2; n7++) {
                                    for (char cc : n753) {
                                        if ((i == digitLen - 1 || k == 1) && cc == '0') continue;
                                        if (j == 0 && cc > n.charAt(i)) continue;
                                        int less = (j == 1 || cc < n.charAt(i)) ? 1 : 0;
                                        int zero = (k == 1 || cc != '0') ? 1 : 0;
                                        int p3 = (n3 == 1 || cc == '3') ? 1 : 0;
                                        int p5 = (n5 == 1 || cc == '5') ? 1 : 0;
                                        int p7 = (n7 == 1 || cc == '7') ? 1 : 0;
                                        memo[i + 1][less][zero][p3][p5][p7] += memo[i][j][k][n3][n5][n7];
                                    }
                                }
                            }
                        }
                    }
                }
            }

            int ans = memo[digitLen][1][1][1][1][1];
            out.println(ans);
        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer;
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
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
            return hasNextByte() ? buffer[bufPointer++] : -1;
        }

        private static boolean isPrintableChar(int c) {
            return (c >= 33 && c <= 126);
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[bufPointer]))
                bufPointer++;
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

    }
}

