import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int A[][] = new int[N][2];

            for (int i = 0; i < N; i++) {
                A[i][0] = in.nextInt();
                A[i][1] = in.nextInt();
            }
            Arrays.sort(A, Comparator.comparing((int[] a) -> a[0]));

            long sum = 0;
            int k = 0;
            for (int i = 0; i < M; i++) {
                A[k][1]--;
                sum += A[k][0];
                if (A[k][1] == 0) {
                    k++;
                }
            }

            out.println(sum);
        }

    }
}

