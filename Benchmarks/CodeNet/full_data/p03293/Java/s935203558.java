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
        ABC103_B solver = new ABC103_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC103_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String src = in.nextLine();
            String tar = in.nextLine();

            src = src + src;
            if (src.contains(tar)) {
                out.print("Yes");
            } else {
                out.print("No");
            }
        }

    }
}

