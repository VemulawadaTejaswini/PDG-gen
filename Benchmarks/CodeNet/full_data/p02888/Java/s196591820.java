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
        Triangles solver = new Triangles();
        solver.solve(1, in, out);
        out.close();
    }

    static class Triangles {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            Arrays.sort(array);

            long result = 0;
            for (int i = 0; i < n - 2; i++) {
                int a = array[i];
                for (int j = i + 1; j < n - 1; j++) {
                    int b = array[j];
                    int ret = Arrays.binarySearch(array, a + b);
                    if (ret < 0) {
                        ret = -ret - 1;
                    }
                    result += Math.max(ret - (j + 1), 0);
                }
            }
            out.println(result);
        }

    }
}

