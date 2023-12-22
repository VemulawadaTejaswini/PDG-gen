import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] W = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                W[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, W);
    }
}

class Solver {
    public void solve(long N, long[] W) {
        long min = Long.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            long S1 = 0;
            for (int j = 0; j <= i; j++) {
                S1 += W[j];
            }

            long S2 = 0;
            for (int j = i + 1; j < N; j++) {
                S2 += W[j];
            }

            if (Math.abs(S1 - S2) < min) {
                min = Math.abs(S1 - S2);
            }
        }
        System.out.println(min);
    }
}

