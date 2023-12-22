import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

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
        ALimitedInsertion solver = new ALimitedInsertion();
        solver.solve(1, in, out);
        out.close();
    }

    static class ALimitedInsertion {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 逆順でやればいい
            // ここでやばなのは後ろから順番にやること
            int n = in.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                al.add(in.nextInt());
            }

            while (!al.isEmpty()) {
                boolean f = true;
                for (int i = al.size() - 1; i >= 0; i--) {
                    if (al.get(i) == i + 1) {
                        f = false;
                        st.add(al.get(i));
                        al.remove(i);
                        break;
                    }
                }
                if (f) {
                    out.println(-1);
                    return;
                }
            }

            while (!st.isEmpty()) {
                out.println(st.pop());
            }

        }

    }
}

