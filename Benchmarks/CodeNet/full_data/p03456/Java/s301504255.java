import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B121 solver = new B121();
        solver.solve(1, in, out);
        out.close();
    }

    static class B121 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int cnt = 0;
            int temp = b;
            while (temp != 0) {
                cnt++;
                temp /= 10;
            }
            a = a * (int) Math.pow(10, cnt) + b;
            for (int i = 1; i * i <= a; i++) {
                if (i * i == a) {
                    out.println("Yes");
                    return;
                }
            }
            out.println("No");
        }

    }
}

