import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = in.nextInt();
            int a, b;
            a = 0;
            b = Math.abs(arr[0] - arr[1]);
            for (int i = 2; i < n; i++) {
                int temp = b;
                b = Math.min(b + Math.abs(arr[i] - arr[i - 1]), a + Math.abs(arr[i] - arr[i - 2]));
                a = temp;
            }
            out.println(b);
        }

    }
}

