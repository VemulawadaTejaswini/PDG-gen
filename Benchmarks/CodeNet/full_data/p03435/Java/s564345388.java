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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[][] map = new int[3][3];
            int[][] subMap = new int[3][3];
            String ans = "Yes";
            for (int i = 0; i < 3; i++) {
                map[i][0] = in.nextInt();
                map[i][1] = in.nextInt();
                map[i][2] = in.nextInt();
            }

            for (int i = 0; i < 3; i++) {
                subMap[i][0] = map[i][0] - map[0][0];
                subMap[i][1] = map[i][1] - map[0][1];
                subMap[i][2] = map[i][2] - map[0][2];
                if (subMap[i][0] == subMap[i][1] && subMap[i][0] == subMap[i][2]) {
                } else {
                    ans = "No";
                }
            }

            out.print(ans);

        }

    }
}

