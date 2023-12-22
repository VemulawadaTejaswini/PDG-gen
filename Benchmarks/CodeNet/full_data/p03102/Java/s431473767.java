import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int C = in.nextInt();
            int B[] = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = in.nextInt();
            }
            int[][] A = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    A[i][j] = in.nextInt();
                }
            }

            int counter = 0;
            for (int i = 0; i < N; i++) {
                int point = 0;
                for (int j = 0; j < M; j++) {
                    point += A[i][j] * B[j];
                }
                if (point + C > 0) {
                    counter++;
                }
            }
            out.println(counter);
        }

    }
}

