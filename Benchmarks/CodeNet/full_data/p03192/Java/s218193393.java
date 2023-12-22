import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CADDI_1 solver = new CADDI_1();
        solver.solve(1, in, out);
        out.close();
    }

    static class CADDI_1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String[] Narr = String.valueOf(in.nextInt()).split("");
            int count = 0;
            for (String n : Narr) {
                if (n.compareTo("2") == 0) {
                    count++;
                }

            }
            out.println(count);
        }

    }
}

