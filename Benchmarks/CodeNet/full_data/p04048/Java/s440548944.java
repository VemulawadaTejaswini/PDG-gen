import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().calc();
    }
    int N;
    int[][] light;
    
    void printLight() {
        for(int i = 0; i < N + 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (light[i][j] == -1) {
                    System.out.print(".");
                }
                else if (light[i][j] == 1) {
                    System.out.print("-");
                }
                else if (light[i][j] == 2) {
                    System.out.print("|");
                }
                else if (light[i][j] == 3) {
                    System.out.print("\\");
                }
            }
            System.out.println();
        }
    }
    
    public void calc() {
        N = in.nextInt();
        int X = in.nextInt();
        light = new int[N + 1][N + 1];

        int curX = X;
        int curY = 0;
        int dir = 1;
        int ans = 0;
        
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    light[i][j] = 3;                    
                }
                else if (i == N) {
                    light[i][j] = 1;
                }
                else if (j == 0) {
                    light[i][j] = 2;
                }
                else {
                    light[i][j] = -1;
                }
            }
        }
        
        do {
            // printLight();
            // System.out.println(curX + ", " + curY);
            if (dir == 1) {
                curY++;
                ans++;
                while (light[curX][curY] == -1) {
                    light[curX][curY] = 1;
                    if (curY == N) {
                        break;
                    }
                    curY++;
                    ans++;
                }
                if (light[curX][curY] == 0) {
                    curY--;
                }
                if (light[curX][curY] == 1 || light[curX][curY] == 3) {
                    dir = 2;
                }
                else if (light[curX][curY] == 2) {
                    dir = 3;
                }
            } else if (dir == 2) {
                curX++;
                ans++;
                while (light[curX][curY] == -1) {
                    light[curX][curY] = 2;
                    if (curX == N) {
                        break;
                    }
                    curX++;
                    ans++;
                }
                if (light[curX][curY] == 0) {
                    curX--;
                }
                if (light[curX][curY] == 2 || light[curX][curY] == 1) {
                    dir = 3;
                }
                else if (light[curX][curY] == 3) {
                    dir = 1;
                }                
            } else if (dir == 3) {
                curX--;
                curY--;
                ans++;
                while (light[curX][curY] == -1) {
                    light[curX][curY] = 3;
                    if (curX == 0 || curY == 0) {
                        break;
                    }
                    curX--;
                    curY--;
                    ans++;
                }
                if (light[curX][curY] == 0) {
                    curX++;
                    curY++;
                }
                if (light[curX][curY] == 3 || light[curX][curY] == 2) {
                    dir = 1;
                }
                else if (light[curX][curY] == 1) {
                    dir = 2;
                }                                
            }
        } while (curX != X || curY != 0);
        

        out.println(ans);
        out.close();
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
