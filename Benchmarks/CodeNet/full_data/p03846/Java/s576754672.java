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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = ScannerUtils.readIntArray(in, n);
            if (arr.length == 1) {
                out.println(arr[0] == 0 ? 1 : 0);
                return;
            }

            Arrays.sort(arr);

            if (n % 2 == 0) { //even
                int next = 1;
                for (int i = 0; i < arr.length; i += 2) {
                    if (arr[i] == next && arr[i + 1] == next) {
                        next += 2;
                    } else {
                        out.println(0);
                        return;
                    }
                }

            } else { //odd
                if (arr[0] != 0) {
                    out.println(0);
                    return;
                }

                int next = 2;
                for (int i = 1; i < arr.length; i += 2) {
                    if (arr[i] == next && arr[i + 1] == next) {
                        next += 2;
                    } else {
                        out.println(0);
                        return;
                    }
                }
            }

            out.println(1 << (n / 2));
        }

    }

    static class ScannerUtils {
        public static int[] readIntArray(Scanner in, int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = in.nextInt();
            }
            return array;
        }

    }
}

