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
        ABC106_C solver = new ABC106_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC106_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] charArray = in.nextLine().toCharArray();
            long k = in.nextLong();
            int ans = 1;
            for (int i = 0; i < k; i++) {
                if (charArray[i] != '1') {
                    ans = Integer.parseInt(String.valueOf(charArray[i]));
                    break;
                }
            }
            out.print(ans);

        }

    }
}

