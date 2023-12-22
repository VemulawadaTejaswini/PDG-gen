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
        long ans = 0;
        while (N > 0) {
            N /= K;
            ans++;
        }
        System.out.println(ans);
    }
}

