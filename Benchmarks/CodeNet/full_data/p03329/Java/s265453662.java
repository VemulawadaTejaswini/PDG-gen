import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(N);
    }
}

class Solver {
    public void solve(long N) {
        int min = (int) N;
        for (int i = 0; i <= N; i++) {
            int c = 0;

            int t = i;
            while (t > 0) {
                c += t % 6;
                t /= 6;
            }

            t = (int) (N - i);
            while (t > 0) {
                c += t % 9;
                t /= 9;
            }

            min = Math.min(min, c);
        }
        System.out.println(min);
    }
}

