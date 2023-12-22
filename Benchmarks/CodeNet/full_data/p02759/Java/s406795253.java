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
        System.out.println((int) (N / 2.0 + 0.6));
    }
}

