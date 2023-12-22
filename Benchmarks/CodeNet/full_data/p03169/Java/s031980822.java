import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        JSushi solver = new JSushi();
        solver.solve(1, in, out);
        out.close();
    }

    static class JSushi {
        int BASE;

        private int inc(int state, int dim) {
            assert dim > 0 && dim <= 3;
            return state + (int) Math.pow(BASE, dim - 1);
        }

        private int dec(int state, int dim) {
            assert dim > 0 && dim <= 3;
            return state - (int) Math.pow(BASE, dim - 1);
        }

        private int prev(int state, int dim) {
            assert dim > 0 && dim <= 3;
            if (get(state, dim) == 0) {
                return 0;
            }
            state = dec(state, dim);
            if (dim > 1) {
                state = inc(state, dim - 1);
            }
            return state;
        }

        private int get(int state, int dim) {
            assert dim > 0 && dim <= 3;
            int shifted = state / (int) Math.pow(BASE, dim - 1);
            return shifted % BASE;
        }

        private int sum(int state) {
            return get(state, 1) + get(state, 2) + get(state, 3);
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            BASE = N + 1;
            int target = 0;
            for (int i = 0; i < N; i++) {
                int a = in.nextInt();
                target = inc(target, a);
            }
            double[] E = new double[BASE * BASE * BASE];
            E[0] = 0;
            for (int state = 1; state <= target; state++) {
                E[state] = N;
                for (int dim = 1; dim <= 3; dim++) {
                    E[state] += get(state, dim) * E[prev(state, dim)];
                }
                E[state] /= sum(state);
            }
            out.println(E[target]);
        }

    }
}

