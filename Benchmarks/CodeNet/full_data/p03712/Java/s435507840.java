import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
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
        BPictureFrame solver = new BPictureFrame();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPictureFrame {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();
            IntStream.range(0, w + 2).forEach(x -> out.print('#'));
            out.println();
            for (int i = 0; i < h; i++) {
                out.print('#');
                out.print(in.next());
                out.println('#');
            }
            IntStream.range(0, w + 2).forEach(x -> out.print('#'));
            out.println();
        }

    }
}

