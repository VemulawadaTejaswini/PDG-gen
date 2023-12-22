import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] P = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                P[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, P);
    }
}

class Solver {
    public void solve(long N, long[] P) {
        long ans = 0;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (min > P[i]) {
                ans++;
                min = P[i];
            }
        }
        System.out.println(ans);
    }
}

