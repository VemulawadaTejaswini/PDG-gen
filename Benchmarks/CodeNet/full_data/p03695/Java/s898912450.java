import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Echizen
 */
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
            int t;
            /**
             * Rating 1-399 : gray
             Rating 400-799 : brown
             Rating 800-1199 : green
             Rating 1200-1599 : cyan
             Rating 1600-1999 : blue
             Rating 2000-2399 : yellow
             Rating 2400-2799 : orange
             Rating 2800-3199 : red
             */
            boolean gray = false;
            boolean brown = false;
            boolean green = false;
            boolean cyan = false;
            boolean blue = false;
            boolean yellow = false;
            boolean orange = false;
            boolean red = false;
            t = in.nextInt();
            int[] arr = new int[t];
            int cout = 0;
            for (int i = 0; i < t; i++) {
                arr[i] = in.nextInt();
                if (arr[i] > 3199) {
                    cout += 1;
                }
            }
            int count_min = 0, count_max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 1 && arr[i] <= 399 && gray == false) {
                    gray = true;
                    count_min += 1;
                } else if (arr[i] >= 400 && arr[i] <= 799 && brown == false) {
                    brown = true;
                    count_min += 1;
                } else if (arr[i] >= 800 && arr[i] <= 1199 && green == false) {
                    green = true;
                    count_min += 1;
                } else if (arr[i] >= 1200 && arr[i] <= 1599 && cyan == false) {
                    cyan = true;
                    count_min += 1;
                } else if (arr[i] >= 1600 && arr[i] <= 1999 && blue == false) {
                    blue = true;
                    count_min += 1;
                } else if (arr[i] >= 2000 && arr[i] <= 2399 && yellow == false) {
                    yellow = true;
                    count_min += 1;
                } else if (arr[i] >= 2400 && arr[i] <= 2799 && orange == false) {
                    orange = true;
                    count_min += 1;
                } else if (arr[i] >= 2800 && arr[i] <= 3199 && red == false) {
                    red = true;
                    count_min += 1;
                }
            }
            out.println(count_min == 0 ? 1 : count_min);
            out.println(count_min + cout);
        }

    }
}

