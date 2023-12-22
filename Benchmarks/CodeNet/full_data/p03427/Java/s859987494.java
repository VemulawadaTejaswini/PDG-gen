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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String n = in.next();
            int sumA = 0;
            for (int i = 0; i < n.length(); i++) sumA += Integer.parseInt(n.substring(i, i + 1));
            int sumB = Integer.parseInt(n.substring(0, 1)) - 1;
            for (int i = 1; i < n.length(); i++) sumB += 9;

            int ans = sumA > sumB ? sumA : sumB;
            out.println(ans);
        }

    }
}

