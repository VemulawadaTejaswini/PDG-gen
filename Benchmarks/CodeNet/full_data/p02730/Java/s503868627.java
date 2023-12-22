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
        BStringPalindrome solver = new BStringPalindrome();
        solver.solve(1, in, out);
        out.close();
    }

    static class BStringPalindrome {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            String[] s1 = s.split("");
            String[] s2 = s.substring(0, (int) ((s.length() - 1) / 2)).split("");
            String[] s3 = s.substring((int) ((s.length() + 3) / 2) - 1, s.length()).split("");
            if (check(s1) && check(s2) && check(s3)) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

        public boolean check(String[] arr) {
            for (int i = 0; i < arr.length / 2; i++) {
                if (!arr[i].equals(arr[arr.length - 1 - i])) {
                    return false;
                }
            }
            return true;
        }

    }
}

