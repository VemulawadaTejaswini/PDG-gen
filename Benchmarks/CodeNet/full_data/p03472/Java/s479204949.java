import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

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
        DKatanaThrower solver = new DKatanaThrower();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKatanaThrower {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), h = in.nextInt();
            PriorityQueue<DKatanaThrower.Action> a = new PriorityQueue<>(Comparator.comparing(x -> -x.damage));
            for (int i = 0; i < n; i++) {
                a.add(new DKatanaThrower.Action(false, in.nextInt()));
                a.add(new DKatanaThrower.Action(true, in.nextInt()));
            }
            int ans = 0;
            while (h > 0) {
                DKatanaThrower.Action x = a.peek();
                h -= x.damage;
                ans++;
                if (x.last) {
                    a.poll();
                }
            }
            out.println(ans);
        }

        private static class Action {
            boolean last = false;
            int damage = 0;

            public Action(boolean last, int damage) {
                this.last = last;
                this.damage = damage;
            }

        }

    }
}

