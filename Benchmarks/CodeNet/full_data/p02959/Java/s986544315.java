import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N + 1];
            for (int i = 0; i < N + 1; i++) {
                A[i] = in.nextInt();
            }
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = in.nextInt();
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] + A[i + 1] <= B[i]) {
                    count += A[i] + A[i + 1];
                    A[i] = 0;
                    A[i + 1] = 0;
                    B[i] = 0;
                }
            }

            for (int i = N - 1; i >= 0; i--) {
                int min2 = Math.min(A[i + 1], B[i]);
                A[i + 1] -= min2;
                B[i] -= min2;
                count += min2;
                int min = Math.min(A[i], B[i]);
                A[i] -= min;
                B[i] -= min;
                count += min;
            }

            System.out.println(count);
        }
    }
}
