import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        static final int MAX_ANSWER = 16;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int height = in.nextInt();
            int width = in.nextInt();
            String[] field = new String[height];
            for (int row = 0; row < height; ++row) {
                field[row] = in.next();
            }
            byte[][][][] howManyRows = new byte[MAX_ANSWER][height + 1][width][width];
            byte[][][][] howManyCols = new byte[MAX_ANSWER][width + 1][height][height];
            int[][] rkind = new int[width][width];
            int[][] ckind = new int[height][height];
            for (int answer = 0; answer < MAX_ANSWER; ++answer) {
                if (answer == 0) {
                    for (int r1 = height - 1; r1 >= 0; --r1) {
                        for (int c1 = 0; c1 < width; ++c1) {
                            int mask = 0;
                            byte[] arr = howManyRows[answer][r1][c1];
                            byte[] narr = howManyRows[answer][r1 + 1][c1];
                            for (int c2 = c1; c2 < width; ++c2) {
                                int cur = field[r1].charAt(c2) == '#' ? 1 : 0;
                                mask |= 1 << cur;
                                if (mask != 3) {
                                    arr[c2] = 1;
                                    if ((mask | rkind[c1][c2]) != 3) {
                                        rkind[c1][c2] |= mask;
                                        arr[c2] += narr[c2];
                                    } else {
                                        rkind[c1][c2] = mask;
                                    }
                                } else {
                                    rkind[c1][c2] = 0;
                                }
                            }
                        }
                    }
                    for (int c1 = width - 1; c1 >= 0; --c1) {
                        for (int r1 = 0; r1 < height; ++r1) {
                            int mask = 0;
                            byte[] arr = howManyCols[answer][c1][r1];
                            byte[] narr = howManyCols[answer][c1 + 1][r1];
                            for (int r2 = r1; r2 < height; ++r2) {
                                int cur = field[r2].charAt(c1) == '#' ? 1 : 0;
                                mask |= 1 << cur;
                                if (mask != 3) {
                                    arr[r2] = 1;
                                    if ((mask | ckind[r1][r2]) != 3) {
                                        ckind[r1][r2] |= mask;
                                        arr[r2] += narr[r2];
                                    } else {
                                        ckind[r1][r2] = mask;
                                    }
                                } else {
                                    ckind[r1][r2] = 0;
                                }
                            }
                        }
                    }
                } else {
                    for (int r1 = height - 1; r1 >= 0; --r1) {
                        for (int c1 = 0; c1 < width; ++c1) {
                            byte[] arr = howManyRows[answer][r1][c1];
                            byte[] parr = howManyRows[answer - 1][r1][c1];
                            for (int c2 = c1; c2 < width; ++c2) {
                                int got = parr[c2];
                                if (got < 0) got += 256;
                                arr[c2] = (byte) (got + howManyRows[answer - 1][r1 + got][c1][c2]);
                            }
                        }
                    }
                    for (int c1 = width - 1; c1 >= 0; --c1) {
                        for (int r1 = 0; r1 < height; ++r1) {
                            byte[] arr = howManyCols[answer][c1][r1];
                            byte[] parr = howManyCols[answer - 1][c1][r1];
                            for (int r2 = r1; r2 < height; ++r2) {
                                int got = parr[r2];
                                if (got < 0) got += 256;
                                arr[r2] = (byte) (got + howManyCols[answer - 1][c1 + got][r1][r2]);
                            }
                        }
                    }
                    for (int r1 = height - 1; r1 >= 0; --r1) {
                        for (int c1 = 0; c1 < width; ++c1) {
                            byte[] arr = howManyRows[answer][r1][c1];
                            for (int c2 = c1; c2 < width; ++c2) {
                                int got = arr[c2];
                                if (got < 0) got += 256;
                                if (got == 0) continue;
                                int r2 = r1 + got - 1;
                                upd(howManyCols[answer][c1][r1], r2, c2 - c1 + 1);
                            }
                        }
                    }
                    for (int c1 = width - 1; c1 >= 0; --c1) {
                        for (int r1 = 0; r1 < height; ++r1) {
                            byte[] arr = howManyCols[answer][c1][r1];
                            for (int r2 = r1; r2 < height; ++r2) {
                                int got = arr[r2];
                                if (got < 0) got += 256;
                                if (got == 0) continue;
                                int c2 = c1 + got - 1;
                                upd(howManyRows[answer][r1][c1], c2, r2 - r1 + 1);
                            }
                        }
                    }
                    for (int r1 = height - 1; r1 >= 0; --r1) {
                        for (int c1 = 0; c1 < width; ++c1) {
                            byte[] arr = howManyRows[answer][r1][c1];
                            int best = 0;
                            for (int c2 = width - 1; c2 >= c1; --c2) {
                                int got = arr[c2];
                                if (got < 0) got += 256;
                                if (got > best) {
                                    best = got;
                                } else {
                                    arr[c2] = (byte) best;
                                }
                            }
                        }
                    }
                    for (int c1 = width - 1; c1 >= 0; --c1) {
                        for (int r1 = 0; r1 < height; ++r1) {
                            byte[] arr = howManyCols[answer][c1][r1];
                            int best = 0;
                            for (int r2 = height - 1; r2 >= r1; --r2) {
                                int got = arr[r2];
                                if (got < 0) got += 256;
                                if (got > best) {
                                    best = got;
                                } else {
                                    arr[r2] = (byte) best;
                                }
                            }
                        }
                    }
                }
                int got = howManyRows[answer][0][0][width - 1];
                if (got < 0) got += 256;
                if (got >= height) {
                    out.println(answer);
                    return;
                }
            }
            out.println(MAX_ANSWER);
        }

        private void upd(byte[] bytes, int pos, int what) {
            int got = bytes[pos];
            if (got < 0) got += 256;
            if (got < what) bytes[pos] = (byte) what;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

