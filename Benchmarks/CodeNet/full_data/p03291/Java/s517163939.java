import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWeLoveABC solver = new DWeLoveABC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWeLoveABC {
        private long[] pow;
        private static final long MOD = (int) 1e9 + 7;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int[] bz = new int[s.length()];
            int[] qz = new int[s.length()];
            pow = new long[s.length()];
            int b = 0;
            int q = 0;
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case 'B':
                        b++;
                        break;
                    case '?':
                        q++;
                        break;
                }
                bz[i] = b;
                qz[i] = q;
            }
            int allQ = qz[s.length() - 1];

            long ans = 0;
            int qs1 = 0;
            outer:
            for (int i = 0; i < s.length(); i++) {
                char ci = s.charAt(i);
                if (ci == 'A') {
                } else if (ci == '?') {
                    qs1 = 1;
                } else {
                    continue;
                }
                for (int j = i + 2; j < s.length(); j++) {
                    int qs2 = qs1;
                    char cj = s.charAt(j);
                    if (cj == 'C') {
                    } else if (cj == '?') {
                        qs2++;
                    } else {
                        continue;
                    }

                    int bBetweenIandJ1 = bz[j] - bz[i];
                    int qBetweenIandJ1 = qz[j] - qz[i];
                    if (cj == '?') {
                        qBetweenIandJ1--;
                    }

                    if (qBetweenIandJ1 == 0) {
                        ans += bBetweenIandJ1 * pow(allQ - qs2);
                    } else {
                        ans += (int) (pow(allQ - qs2) * bBetweenIandJ1 % MOD);
                        //System.out.println(pow(allQ - qs2) * bBetweenIandJ1);
                        ans += (int) (pow(allQ - qs2 - 1) * qBetweenIandJ1 % MOD);
                        //System.out.println();
                        //.out.println("FOUND2("+i+","+j+")"+qBetweenIandJ1);
                    }
                    ans %= MOD;
                }
            }
            out.println(ans % MOD);
        }

        long pow(int y) {
            if (y == 0) {
                return 1;
            } else if (pow[y] != 0) {
                return pow[y];
            } else if (y % 2 == 0) {
                long z = pow(y / 2);
                return pow[y] = (z * z) % MOD;
            } else {
                return pow[y] = (3 % MOD) * pow(y - 1) % MOD;
            }
        }

    }
}

