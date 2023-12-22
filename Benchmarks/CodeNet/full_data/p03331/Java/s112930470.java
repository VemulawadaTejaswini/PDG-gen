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
        ADigitsSum solver = new ADigitsSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADigitsSum {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int sum = 0;
            boolean lack = true;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (i != 0 && c != '0') {
                    lack = false;
                }
                sum += c - 48;
            }
            out.println(lack ? "10" : sum);
        }

    }
}

