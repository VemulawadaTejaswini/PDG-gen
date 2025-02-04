import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSnukeNumbers solver = new DSnukeNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSnukeNumbers {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int k = in.nextInt();
            StringBuilder prefix = new StringBuilder();
            for (int i = 0; i < k; i++) {
                out.println(((i % 9) + 1) + prefix.toString());
                if (i % 9 == 8) {
                    prefix.append("9");
                }
            }
        }

    }
}

