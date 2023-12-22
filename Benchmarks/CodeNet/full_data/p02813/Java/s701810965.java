import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.awt.Point;

public class Main {
    // static int INF = (1 << 30) - 1;
    // static long L_INF = (1L << 62) - 1;
    // static long MOD = (long) 1e9 + 7;

    static class Solver {
        int N;
        int[] P, Q;
        int[] A;

        boolean nextPermutation(int[] array) {
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i - 1] < array[i]) {
                    int j = find(array, array[i - 1], i, array.length - 1);
                    int temp = array[j];
                    array[j] = array[i - 1];
                    array[i - 1] = temp;
                    Arrays.sort(array, i, array.length);
                    return true;
                }
            }
            return false;
        }

        int find(int[] array, int dest, int f, int l) {
            if (f == l) {
                return f;
            }
            int m = (f + l + 1) / 2;
            return (array[m] <= dest) ? find(array, dest, f, m - 1) : find(array, dest, m, l);
        }

        // write your code
        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = in.nextInt();
            }
            Q = new int[N];
            for (int i = 0; i < N; i++) {
                Q[i] = in.nextInt();
            }
            A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = i + 1;
            }

            int a = 0;
            int b = 0;
            int idx = 1;
            do {
                boolean aFlag = true;
                for (int i = 0; i < N; i++) {
                    if (A[i] != P[i]) {
                        aFlag = false;
                        break;
                    }
                }
                if (aFlag) {
                    a = idx;
                }
                boolean bFlag = true;
                for (int i = 0; i < N; i++) {
                    if (A[i] != Q[i]) {
                        bFlag = false;
                        break;
                    }
                }
                if (bFlag) {
                    b = idx;
                }
                idx++;
            } while (nextPermutation(A));
            out.println(Math.abs(a - b));
        }

        void debug(Object... os) {
            System.err.println(Arrays.deepToString(os));
        }
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(in, out);
        out.close();
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
