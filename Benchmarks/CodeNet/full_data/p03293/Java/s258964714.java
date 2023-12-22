import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

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
            String S = in.next();
            String T = in.next();
            Deque<Character> q = new ArrayDeque<>();

            if (S.equals(T)) {
                out.println("Yes");
                return;
            }
            for (int i = 0; i < S.length(); i++) {
                q.offerLast(S.charAt(i));
            }

            for (int i = 0; i < S.length(); i++) {
                String s1 = q.toString().replaceAll("[, ]", "").substring(1, S.length() + 1);
//            out.println(s1);
                q.offerFirst(q.pollLast());
                if (s1.equals(T)) {
                    out.println("Yes");
                    return;
                }
            }
            out.println("No");

        }

    }
}

