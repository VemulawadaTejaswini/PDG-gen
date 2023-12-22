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
        ATenki solver = new ATenki();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATenki {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String a = in.nextLine();
            String b = in.nextLine();
            int ans = 0;
            for (int i = 0; i < 3; i++) {
                if (a.charAt(i) == b.charAt(i))
                    ans++;
            }
            out.println(ans);
        }

    }
}

