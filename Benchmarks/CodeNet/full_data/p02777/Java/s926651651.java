import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ARemainingBalls solver = new ARemainingBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class ARemainingBalls {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String l = in.nextLine();
            String[] balls = l.split(" ");
            String n = in.nextLine();
            String[] nums = n.split(" ");
            String u = in.nextLine();

            int s = Integer.parseInt(nums[0]);
            int t = Integer.parseInt(nums[1]);

            if (u.equals(balls[0])) {
                s--;
            } else {
                t--;
            }

            out.println(s + " " + t);
        }

    }
}

