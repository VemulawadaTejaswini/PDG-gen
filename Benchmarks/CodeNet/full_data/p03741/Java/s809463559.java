import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            long op = 0;
            long sum = 0;
            long op2 = 0;
            long sum2 = 0;
            for (int i = 0; i < N; i++) {
                sum += A[i];
                sum2 += A[i];
                if (i % 2 == 0) {
                    if (sum <= 0) {
                        op += (1 - sum);
                        sum = 1;
                    }
                    if (sum2 >= 0) {
                        op2 += (sum2 - -1);
                        sum2 = -1;
                    }
                } else {
                    if (sum >= 0) {
                        op += (sum - -1);
                        sum = -1;
                    }
                    if (sum2 <= 0) {
                        op2 += (1 - sum2);
                        sum2 = 1;
                    }
                }
            }

            System.out.println(Math.min(op, op2));
        }
    }
}
