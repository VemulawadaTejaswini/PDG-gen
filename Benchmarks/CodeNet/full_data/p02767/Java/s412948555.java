import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] X = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                X[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, X);
    }
}

class Solver {
    public void solve(long N, long[] X) {
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += X[i];
        }
        long ave = (long) Math.ceil(sum / (double) N);

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += Math.pow(X[i] - ave, 2);
        }

        System.out.println(ans);
    }
}
