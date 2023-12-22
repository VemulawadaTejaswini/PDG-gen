import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Solver {
    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();

        if (a % 3 == 0 || b % 3 == 0) {
            out.println(0);
            return;
        }

        out.println(Math.min(calc(a, b), calc(b, a)));
    }

    int calc(int a, int b){
        int x1 = (int) Math.round(a / 3.0);
        int x2 = a - x1;

        int[] s;

        boolean vertical;
        if ((x2 & 1) == 0) vertical = true;
        else if ((b & 1) == 0) vertical = false;
        else vertical = x2 > b;

        if (vertical) {
            int x3 = x2 / 2;
            x2 -= x3;

            s = new int[]{x1 * b, x2 * b, x3 * b};
        } else {
            int y1 = (int) Math.round(b / 2.0);
            int y2 = b - y1;

            s = new int[]{x1 * b, x2 * y1, x2 * y2};
        }
        Arrays.sort(s);
        return s[s.length - 1] - s[0];
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        new Solver().solve(in, out);

        in.close();
        out.flush();
    }
}