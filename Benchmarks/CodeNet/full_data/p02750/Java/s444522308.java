import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long T;
        T = sc.nextLong();
        long[] a = new long[(int)(N)];
        long[] b = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                a[i] = sc.nextLong();
                b[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, T, a, b);
    }
}

class Solver {
    public void solve(long N, long T, long[] a, long[] b) {
        long t = 1;

        Set<Integer> options = new HashSet<>();
        for (int i = 0; i < N; i++) {
            options.add(i);
        }

        int ans = 0;
        while (true) {
            long min = Long.MAX_VALUE / 2;
            int minIndex = -1;

            Iterator<Integer> itr = options.iterator();
            while (itr.hasNext()) {
                int o = itr.next();
                long n = a[o] * t + b[o] + 1;

                if (n > T) {
                    itr.remove();
                }

                if (min > n) {
                    min = n;
                    minIndex = o;
                }
            }

            if (min >= T) {
                break;
            }
            options.remove(minIndex);
            ans++;

            t = min;
        }

        System.out.println(ans);
    }
}

