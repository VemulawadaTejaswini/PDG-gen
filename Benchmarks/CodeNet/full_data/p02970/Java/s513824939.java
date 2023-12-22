import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long D;
        D = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(N, D);
    }
}

class Solver {
    public void solve(long N, long D) {
        System.out.println((int) Math.ceil(N / (2.0 * D + 1)));
    }
}

