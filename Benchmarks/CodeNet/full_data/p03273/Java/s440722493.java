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
        ABC107_2 solver = new ABC107_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC107_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();
            String[][] charr = new String[W][H];
            boolean[] existW = new boolean[W + 1];
            boolean[] existH = new boolean[H + 1];

            String[] burarr = in.nextLine().split("");
            for (int y = 0; y < H; y++) {
                burarr = in.nextLine().split("");
                for (int x = 0; x < W; x++) {
                    charr[x][y] = burarr[x];
                    if (charr[x][y].compareTo("#") == 0) {
                        existH[y] = true;
                        existW[x] = true;
                    }
                }
            }
            for (int y = 0; y < H; y++) {
                if (existH[y]) {
                    for (int x = 0; x < W; x++) {
                        if (existW[x]) {
                            out.print(charr[x][y]);
                        }
                    }
                    out.println();
                }
            }

        /*
        for (int y = 0; y < H; y++) {
            String line = "";
            for (int x = 0; x < W; x++) {
                if ()
                charr[x][y] = (char)in.nextByte();
            }
        }


        for (int i = 0; i <H ; i++) {
            String buf  =in.next();
            if (buf.contains("#")) {
                out.println();
            } else {
                String[] arrbuf = buf.split("");
            }
        }
        */


        }

    }
}

