import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

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
        C2DPlane2NPoints solver = new C2DPlane2NPoints();
        solver.solve(1, in, out);
        out.close();
    }

    static class C2DPlane2NPoints {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            IntPair[] red = new IntPair[n];
            IntPair[] blue = new IntPair[n];
            boolean[] used = new boolean[n];
            Arrays.fill(used, false);
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                red[i] = new IntPair(in.nextInt(), in.nextInt());
            }
            for (int i = 0; i < n; i++) {
                blue[i] = new IntPair(in.nextInt(), in.nextInt());
            }

            Comparator<IntPair> rcmp = Comparator.comparing(IntPair::getY).reversed();
            Comparator<IntPair> bcmp = Comparator.comparing(IntPair::getX);

            Arrays.sort(red, rcmp);
            Arrays.sort(blue, bcmp);

            // System.out.println(Arrays.toString(red));
            // System.out.println(Arrays.toString(blue));

            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {
                    if (!used[i] && red[i].x < blue[j].x && red[i].y < blue[j].y) {
                        used[i] = true;
                        cnt++;
                        break;
                    }
                }
            }

            out.println(cnt);

        }

    }

    static class IntPair {
        public int x;
        public int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public IntPair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "IntPair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

    }
}

