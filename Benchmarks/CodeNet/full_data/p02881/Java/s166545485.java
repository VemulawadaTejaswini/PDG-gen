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
        long min = Long.MAX_VALUE;
        for (long i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                min = Math.min(min, (i - 1) + (N / i - 1));
            }
        }
        System.out.println(min);
    }
}

