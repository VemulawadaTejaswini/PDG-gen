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
        BQualificationSimulator solver = new BQualificationSimulator();
        solver.solve(1, in, out);
        out.close();
    }

    static class BQualificationSimulator {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();
            char[] c = in.next().toCharArray();
            int pass = 0;
            int fore = 0;

        /*
         a: 国内 かつ 学生 -> 通過者 A+B名まで
         b: 海外 かつ 学生 -> 通過者 A+B名 かつ海外 B 名まで
         c: 学生でない
         */
            for (char ch : c) {
                if (ch == 'a' && pass < (A + B)) {
                    pass++;
                    out.println("Yes");
                } else if (ch == 'b' && pass < (A + B) && fore < B) {
                    pass++;
                    fore++;
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            }
        }

    }
}

