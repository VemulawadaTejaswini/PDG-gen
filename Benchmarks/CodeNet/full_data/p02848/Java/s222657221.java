import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.UnsupportedEncodingException;

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
        abc146_b solver = new abc146_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc146_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            String S = in.next();
            byte[] asciiCodes = new byte[S.length()];

            try {
                asciiCodes = S.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < asciiCodes.length; i++) {
                //System.out.println("asciiCodes[" + i + "]:" + asciiCodes[i]);
                asciiCodes[i] = (byte) (asciiCodes[i] + N <= 90 ? (asciiCodes[i] + N) : (65 + ((asciiCodes[i] + N) - 90) - 1));
                //System.out.println("asciiCodes[" + i + "]:" + asciiCodes[i]);
            }
            try {
                out.println(new String(asciiCodes, "US-ASCII"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

    }
}

