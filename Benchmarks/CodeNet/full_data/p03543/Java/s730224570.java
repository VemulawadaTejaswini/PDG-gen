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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            String ans = s.charAt(1) == s.charAt(2) ? "Yes" : "No";
            if (ans.equals("Yes")) {
                if (s.charAt(0) == s.charAt(1) || s.charAt(3) == s.charAt(2)) ans = ans;
                else ans = "No";
            }
            out.println(ans);
        }

    }
}

