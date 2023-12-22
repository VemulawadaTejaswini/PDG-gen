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
            String S = in.next();
            int n = S.length();
            int n1 = (int) Math.ceil((n - 1) / 2);
            int n2 = (int) Math.ceil((n + 3) / 2);

            String s1 = S.substring(0, n1);
            String s2 = S.substring(n2 - 1);

            boolean test1 = palindrome(S);
            boolean test2 = palindrome(s1);
            boolean test3 = palindrome(s2);

            if (test1 == true && test2 == true && test3 == true) {
                out.println("Yes");
                return;
            }
            out.println("No");

        }

        boolean palindrome(String arg) {
            char str[] = arg.toCharArray();
            for (int i = 0; i < str.length / 2; i++) {
                if (str[i] != str[str.length - i - 1]) return false;
            }
            return true;
        }

    }
}

