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
        TaskA1 solver = new TaskA1();
        try {
            int testNumber = 1;
            while (true)
                solver.solve(testNumber++, in, out);
        } catch (UnknownError e) {
            out.close();
        }
    }

    static class TaskA1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();

            if (a <= 0 && b >= 0) {
                out.println("Zero");
            } else {
                int n = b - a + 1;
                if (b < 0) {
                    if (n % 2 == 0) {
                        out.println("Positive");
                    } else {
                        out.println("Negative");
                    }
                } else {
                    out.println("Positive");
                }
            }
        }

    }
}
