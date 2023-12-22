import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CKthSubstring solver = new CKthSubstring();
        solver.solve(1, in, out);
        out.close();
    }

    static class CKthSubstring {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int k = in.nextInt();
            TreeSet<String> ts = new TreeSet<>();
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length()+1; j++) {
                    if (j - i <= k) {
                        ts.add(s.substring(i, j));
                    }
                }
            }

            for (String t : ts) {
                k -= 1;
                if (k == 0) {
                    out.println(t);
                }
            }
        }
    }
  
}

