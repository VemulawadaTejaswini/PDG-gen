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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String Sa = in.next();
            String Sb = in.next();
            String Sc = in.next();
            String ans = "A";
            String next = "a";

            StringBuilder current = new StringBuilder();
            current.append(Sa);
            while (true) {
                if (current.length() == 0) break;
                if ("a".equals(next)) {
                    Sa = current.substring(1);
                    next = current.substring(0, 1);
                    current.delete(0, current.length());
                    ans = "A";
                } else if ("b".equals(next)) {
                    Sb = current.substring(1);
                    next = current.substring(0, 1);
                    current.delete(0, current.length());
                    ans = "B";
                } else if ("c".equals(next)) {
                    Sc = current.substring(1);
                    next = current.substring(0, 1);
                    current.delete(0, current.length());
                    ans = "C";
                }
                if ("a".equals(next)) current.append(Sa);
                if ("b".equals(next)) current.append(Sb);
                if ("c".equals(next)) current.append(Sc);
            }

            out.println(ans);
        }

    }
}

