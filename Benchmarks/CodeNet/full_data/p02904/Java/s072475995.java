import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long K;
        K = sc.nextLong();
        long[] P = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                P[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, K, P);
    }
}

class Solver {
    public void solve(long N, long K, long[] P) {
        long ans = 1;
        final TreeSet<Long> ts = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            ts.add(P[i]);

            if (i >= K) {
                if (ts.first() != P[(int) (i - K)] || ts.last() != P[i]) ans++;
                ts.remove(P[(int) (i - K)]);
            }
        }

        int sorted = 0;
        int count = 1;
        for (int i = 1; i < N; i++) {
            if (P[i - 1] < P[i]) {
               count++;
               if (count == K) {
                   sorted++;
               }
            }
            else {
                count = 1;
            }
        }

        if (sorted >= 2) {
            System.out.println(ans - (sorted - 1));
            return;
        }

        System.out.println(ans);
    }
}

