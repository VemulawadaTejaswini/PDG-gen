import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long M;
        M = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(N, M);
    }
}

class Solver {
    public void solve(long N, long M) {
        long ans = N * (N - 1) / 2;
        ans += M * (M - 1) / 2;
        System.out.println(ans);
    }
}

