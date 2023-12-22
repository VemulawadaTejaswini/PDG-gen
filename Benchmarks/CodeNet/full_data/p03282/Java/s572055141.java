import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;

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
        ABC106_C solver = new ABC106_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC106_C {
        final BigInteger day = new BigInteger("50000000000000000000");

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] charArray = in.nextLine().toCharArray();
            BigInteger k = new BigInteger(in.nextLine());
            int nowNumber = 0;
            BigInteger length = new BigInteger("0");

            for (char c : charArray) {
                switch (c) {
                    case '1':
                        nowNumber = 1;
                        length = length.add(BigInteger.ONE);
                        break;
                    case '2':
                        nowNumber = 2;
                        length = length.add(day);
                        break;
                    case '3':
                        nowNumber = 3;
                        length = length.add(day);
                        break;
                    case '4':
                        nowNumber = 4;
                        length = length.add(day);
                        break;
                    case '5':
                        nowNumber = 5;
                        length = length.add(day);
                        break;
                    case '6':
                        nowNumber = 6;
                        length = length.add(day);
                        break;
                    case '7':
                        nowNumber = 7;
                        length = length.add(day);
                        break;
                    case '8':
                        nowNumber = 8;
                        length = length.add(day);
                        break;
                    case '9':
                        nowNumber = 9;
                        length = length.add(day);
                        break;
                    default:
                        break;
                }

                if (length.compareTo(k) > 0) {
                    out.print(nowNumber);
                    break;
                }
            }


        }

    }
}

