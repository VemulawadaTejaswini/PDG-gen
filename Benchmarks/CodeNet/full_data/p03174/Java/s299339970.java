import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        OMatching solver = new OMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class OMatching {
        final int MOD = 1_000_000_000 + 7;

        int add(int a, int b) {
            int res = a + b;
            if (res >= MOD) {
                res -= MOD;
            }
            return res;
        }

        int insert0(int bits, int pos) {
            pos -= 1;
            if (pos == 0) {
                return bits << 1;
            }
            int s1 = (bits >>> pos) << (pos + 1);
            int s2 = bits & ((1 << pos) - 1);
            int res = s1 | s2;
            return res;
        }

        int minSet(int size) {
            return (1 << size) - 1;
        }

        int maxSet(int size, int nBits) {
            return minSet(size) << (nBits - size);
        }

        int next(int set) {
            if (set == 0) {
                throw new RuntimeException();
            }
            int i = 0;
            int nOnes = 0;
            for (; !(((set >> i) & 1) == 1 && ((set >> (i + 1)) & 1) == 0); i++) {
                if (((set >> i) & 1) == 1) {
                    nOnes++;
                }
            }
            int mask = Integer.MAX_VALUE << (i + 1);
            return (set & mask) | (1 << (i + 1)) | minSet(nOnes);
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            boolean[][] a = new boolean[N + 1][N + 1];
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    a[i][j] = (in.nextInt() != 0);
                }
            }
            int[][] ways = new int[N + 1][1 << N];
            ways[0][0] = 1;
            for (int j = 1; j <= N; j++) {
                ways[1][1 << (j - 1)] = a[1][j] ? 1 : 0;
            }
            for (int i = 2; i <= N; i++) {
                final int minS = minSet(i - 1);
                final int maxS = maxSet(i - 1, N - 1);
                for (int j = 1; j <= N; j++)
                    if (a[i][j]) {
                        for (int s = minS; s <= maxS; s = next(s)) {
                            int oldS = insert0(s, j);
                            int newS = oldS | 1 << (j - 1);
                            ways[i][newS] = add(ways[i][newS], ways[i - 1][oldS]);
                        }
                    }
            }
            out.println(ways[N][(1 << N) - 1]);
        }

    }
}

