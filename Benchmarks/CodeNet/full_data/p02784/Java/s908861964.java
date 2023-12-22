import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        ABC153_b solver = new ABC153_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC153_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int H = in.nextInt();
            int N = in.nextInt();
            int arr[] = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            for (int j = 0; j < N; j++) {
                H -= arr[j];
                if (H <= 0) {
                    out.println("Yes");
                    return;
                }
            }
            out.println("No");
        }

    }
}

