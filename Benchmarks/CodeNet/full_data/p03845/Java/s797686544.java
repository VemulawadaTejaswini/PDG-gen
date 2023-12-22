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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] times = ScannerUtils.readIntArray(in, n);
            int sum = 0;
            for (int time : times) {
                sum += time;
            }

            int drinksCount = in.nextInt();
            while (drinksCount-- > 0) {
                int probMod = in.nextInt() - 1;
                int newTime = in.nextInt();

                int newSum = sum - times[probMod] + newTime;
                out.println(newSum);
            }
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

