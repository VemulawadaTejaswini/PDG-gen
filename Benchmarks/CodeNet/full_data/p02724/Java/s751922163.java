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
        BGoldenCoins solver = new BGoldenCoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGoldenCoins {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = Integer.parseInt(in.next());

            int y = x / 500;
            int z = (x - 500 * y) / 5;

            out.println(1000 * y + 5 * z);
        }

    }
}

