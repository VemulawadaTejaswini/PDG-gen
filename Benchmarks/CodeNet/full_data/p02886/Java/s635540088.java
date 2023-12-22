import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] d = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                d[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, d);
    }
}

class Solver {
    public void solve(long N, long[] d) {
        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                ans += d[i] * d[j];
            }
        }
        System.out.println(ans);
    }
}

