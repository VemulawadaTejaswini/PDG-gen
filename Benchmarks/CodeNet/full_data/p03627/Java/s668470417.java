import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author CodeMonk
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
            int[] A = new int[N];
            long width = 0, breadth = 0;
            int i = 0;
            while (N > i) {
                A[i] = in.nextInt();

                i++;
            }
            Arrays.sort(A);
            long num1 = 0, num2 = 0;
            for (i = N - 1; i > 0; i--) {
                if (A[i] == A[i - 1]) {
                    num2 = num1;
                    num1 = A[i];
                    i--;
                }
                if (num2 != 0)
                    break;
            }
            out.println(num1 * num2);
        }

    }
}

