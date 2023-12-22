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
        AGC029_A solver = new AGC029_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class AGC029_A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] str = in.next().toCharArray();
            long ans = 0;
            long wCost = 0;
            long wCount = 0;
            long wIdeal = 0;
            for (int i = 0; i < str.length; i++) {
                if (str[i] == 'W') {
                    wCost += (i + 1);
                    wCount++;
                    wIdeal += wCount;
                }
            }


            out.print(wCost - wIdeal);
        }

    }
}

