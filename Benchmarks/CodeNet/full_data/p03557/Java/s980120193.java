import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    // static int INF = (1 << 30) - 1;
    // static long L_INF = (1L << 62) - 1;
    // static long MOD = (long) 1e9 + 7;

    static class Solver {
        int N;
        int[] A, B, C;

        boolean checkLower(int[] arr, int idx, int v) {
            // implement check if needed
            return arr[idx] >= v;
        }

        int lowerBound(int[] arr, int v) {
            int left = 0;
            int right = arr.length; // always satisfied with the check.
            while (left < right) {
                int mid = (left + right) / 2;
                if (checkLower(arr, mid, v)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return right;
        }

        boolean checkUpper(int[] arr, int idx, int v) {
            // implement check if needed
            return arr[idx] > v;
        }

        int upperBound(int[] arr, int v) {
            int left = 0;
            int right = arr.length; // always satisfied with the check.
            while (left < right) {
                int mid = (left + right) / 2;
                if (checkUpper(arr, mid, v)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return right;
        }

        // write your code
        // https://atcoder.jp/contests/abc077/tasks/arc084_a
        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = in.nextInt();
            }
            C = new int[N];
            for (int i = 0; i < N; i++) {
                C[i] = in.nextInt();
            }
            Arrays.sort(A);
            Arrays.sort(B);
            Arrays.sort(C);

            int ans = 0;
            for (int i = 0; i < N; i++) {
                int v = B[i];
                int a = lowerBound(A, v);
                int c = N - upperBound(C, v);
                ans += a * c;
            }
            out.println(ans);
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
