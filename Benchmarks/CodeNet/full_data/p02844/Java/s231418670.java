import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        DLuckyPIN solver = new DLuckyPIN();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLuckyPIN {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int cnt = 0;
            for (int i = 0; i < 1000; i++) {
                int x = i / 100;
                int y = (i / 10) % 10;
                int z = i % 10;
                if (exist(s, (char) (x + '0'), (char) (y + '0'), (char) (z + '0'))) {
                    cnt++;
                }
            }
            out.println(cnt);
        }

        boolean exist(String s, char x, char y, char z) {
            boolean fx = false;
            boolean fy = false;
            boolean fz = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == x && !fx) {
                    fx = true;
                    continue;
                }
                if (s.charAt(i) == y && fx && !fy) {
                    fy = true;
                    continue;
                }
                if (s.charAt(i) == z && fy && !fz) {
                    fz = true;
                    break;
                }
            }

            return fz;
        }

    }
}

