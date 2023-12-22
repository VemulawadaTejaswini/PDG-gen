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
        ABC151_c solver = new ABC151_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC151_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();

            int acs[] = new int[N + 1];
            int was[] = new int[N + 1];

            for (int i = 0; i < M; i++) {
                int val = in.nextInt();
                if (in.next().equals("AC")) {
                    acs[val] = -1;
                } else {
                    if (acs[val] != -1) {
                        was[val] += 1;
                    }
                }

            }
            int account = 0;
            int wacount = 0;
            for (int i = 0; i < N + 1; i++) {
                if (acs[i] == -1) {
                    account++;
                }
                if (was[i] > 0) {
                    wacount += acs[i];
                }
            }
            out.print(account);
            out.print(" ");
            out.println(wacount);

        }

    }
}

