import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPapersPlease solver = new BPapersPlease();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPapersPlease {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                int num = in.nextInt();
                if (num % 2 == 0) {
                    if (!(num % 3 == 0 || num % 5 == 0)) {
                        out.println("DENIED");
                        return;
                    }
                }
            }
            out.println("APPROVED");
        }

    }
}

