import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long A;
        A = sc.nextLong();
        long B;
        B = sc.nextLong();
        long M;
        M = sc.nextLong();
        long[] a = new long[(int)(A)];
        for(int i = 0 ; i < A ; i++){
                a[i] = sc.nextLong();
        }
        long[] b = new long[(int)(B)];
        for(int i = 0 ; i < B ; i++){
                b[i] = sc.nextLong();
        }
        long[] x = new long[(int)(M)];
        long[] y = new long[(int)(M)];
        long[] c = new long[(int)(M)];
        for(int i = 0 ; i < M ; i++){
                x[i] = sc.nextLong();
                y[i] = sc.nextLong();
                c[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(A, B, M, a, b, x, y, c);
    }
}

class Solver {
    public void solve(long A, long B, long M, long[] a, long[] b, long[] x, long[] y, long[] c) {
        int minA = Integer.MAX_VALUE;
        for (int i = 0; i < A; i++) {
            minA = (int) Math.min(minA, a[i]);
        }

        int minB = Integer.MAX_VALUE;
        for (int i = 0; i < B; i++) {
            minB = (int) Math.min(minB, b[i]);
        }

        int minTotal = minA + minB;
        for (int i = 0; i < M; i++) {
            minTotal = (int) Math.min(minTotal, (a[(int) (x[i] - 1)] + b[(int) (y[i] - 1)]) - c[i]);
        }
        System.out.println(minTotal);
    }
}

