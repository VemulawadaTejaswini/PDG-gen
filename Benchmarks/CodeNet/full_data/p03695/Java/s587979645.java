import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }
    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[] cnt = new int[9];
            int n = in.nextInt();
            int min = 0;
            for (int i = 0; i < n; i++) {
                int tmp = in.nextInt();
                int col = getColor(tmp);
                ++cnt[col];
                if (cnt[col] <= 1 && col < 8) ++min;
            }

            if (min == 0) {
                out.println(1 + " " + cnt[8]);
                return;
            }
            out.println(min + " " + (min + cnt[8]));

        }
        public int getColor(int a) {
            int ret = a / 400;
            return Math.min(8, ret);
        }
    }
}

