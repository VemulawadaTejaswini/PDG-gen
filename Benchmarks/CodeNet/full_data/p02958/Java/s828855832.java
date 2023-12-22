import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B0Or1Swap solver = new B0Or1Swap();
        solver.solve(1, in, out);
        out.close();
    }

    static class B0Or1Swap {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            if (check(a, n)) {
                out.println("YES");
                return;
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    if (check(a, n)) {
                        out.println("YES");
                        return;
                    }
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            out.println("NO");
        }

        boolean check(int a[], int n) {
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1])
                    return false;
            }
            return true;
        }

    }
}

