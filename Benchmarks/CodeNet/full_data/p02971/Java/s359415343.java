import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] A = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                A[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, A);
    }
}

class Solver {
    public void solve(long N, long[] A) {
        long largest = 0;
        int largestIndex = 0;
        long secondLargest = 0;

        for (int i = 0; i < N; i++) {
            long v = A[i];

            if (largest < v) {
                largest = v;
                largestIndex = i;
                continue;
            }

            if (secondLargest < v) {
                secondLargest = v;
            }
        }

        for (int i = 0; i < N; i++) {
            if (i == largestIndex) {
                System.out.println(secondLargest);
            }
            else {
                System.out.println(largest);
            }
        }
    }
}

