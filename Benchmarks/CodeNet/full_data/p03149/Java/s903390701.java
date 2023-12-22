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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n1 = Integer.parseInt(in.next());
            int n2 = Integer.parseInt(in.next());
            int n3 = Integer.parseInt(in.next());
            int n4 = Integer.parseInt(in.next());
            boolean ok = false;
            String tmp = new String(Integer.toString(n1) + Integer.toString(n2) + Integer.toString(n3) + Integer.toString(n4));
            if (tmp.contains("1") && tmp.contains("9") && tmp.contains("7") && tmp.contains("4")) ok = true;
            out.println(ok ? "YES" : "NO");

        }

    }
}

