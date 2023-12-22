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
        ABC_108_B solver = new ABC_108_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC_108_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            int x3, x4, y3, y4;
            int distX = x2 - x1;
            int distY = y2 - y1;

            x3 = x2 - distY;
            y3 = y2 + distX;
            x4 = x3 - distX;
            y4 = y3 - distY;

            out.print(x3 + " " + y3 + " " + x4 + " " + y4);


        }

    }
}

