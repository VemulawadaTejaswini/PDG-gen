import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.Scanner;
import java.util.LinkedList;

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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            LinkedList<Integer> a = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                a.add(in.nextInt());
            }

            boolean ans = calc(N, a);
            out.println(ans ? "Yes" : "No");
        }

        private boolean calc(int N, LinkedList<Integer> a) {
            for (int i = 1; i < N; i++) {
                boolean ret = check(i, new LinkedList<>(a));
                if (ret) return true;
            }
            return false;
        }

        private boolean check(int i, LinkedList<Integer> a) {
            int y = a.remove(i);
            int x = a.removeFirst();
            while (!a.isEmpty()) {
                if (a.contains(y ^ x)) {
                    Integer z = Integer.valueOf(y ^ x);
                    a.remove(z);
                    x = y;
                    y = z;
                } else {
                    return false;
                }
            }
            return true;
        }

    }
}

