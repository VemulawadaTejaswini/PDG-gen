import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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
        SyntheticKadomatsu solver = new SyntheticKadomatsu();
        solver.solve(1, in, out);
        out.close();
    }

    static class SyntheticKadomatsu {
        List<Integer> l;
        int n;
        int a;
        int b;
        int c;
        int result = Integer.MAX_VALUE;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            l = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                l.add(in.nextInt());
            }
            recursive(10, 1, l.get(0), 0, 0);
            recursive(10, 1, 0, l.get(0), 0);
            recursive(10, 1, 0, 0, l.get(0));
            recursive(0, 1, 0, 0, 0);

            out.println(result);
        }

        public void recursive(int score, int num, int aa, int bb, int cc) {
            if (num == n) {
                if (aa == 0 || bb == 0 || cc == 0) {
                    return;
                }
                score += Math.abs(a - aa) + Math.abs(b - bb) + Math.abs(c - cc) - 30;
                result = Math.min(score, result);
                return;
            }
            recursive(score + 10, num + 1, aa + l.get(num), bb, cc);
            recursive(score + 10, num + 1, aa, bb + l.get(num), cc);
            recursive(score + 10, num + 1, aa, bb, cc + l.get(num));
            recursive(score, num + 1, aa, bb, cc);


        }

    }
}

