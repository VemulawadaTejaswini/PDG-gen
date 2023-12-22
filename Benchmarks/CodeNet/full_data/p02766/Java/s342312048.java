import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long K;
        K = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(N, K);
    }
}

class Solver {
    public void solve(long N, long K) {
        double l = Math.log(N) / Math.log(K);
        System.out.println((int) Math.ceil(l));
    }
}

