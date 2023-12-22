import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        int N = scanner.nextInt();
        int[][] A = new int[3][N];
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < 3; i++) {
                A[i][j] = scanner.nextInt();
            }
        }

        for (int j = 1; j < N; j++) {
            A[0][j] += Math.max(A[1][j - 1], A[2][j - 1]);
            A[1][j] += Math.max(A[0][j - 1], A[2][j - 1]);
            A[2][j] += Math.max(A[0][j - 1], A[1][j - 1]);
        }
        System.out.println(Math.max(A[0][N - 1], Math.max(A[1][N - 1], A[2][N - 1])));
    }
}