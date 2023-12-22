import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhijeetkns
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AChangingACharacter solver = new AChangingACharacter();
        solver.solve(1, in, out);
        out.close();
    }

    static class AChangingACharacter {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            String s = in.next();
            s = s.substring(0, k - 1) + s.substring(k - 1, k).toLowerCase() + s.substring(k, s.length());
            out.println(s);
        }

    }
}

