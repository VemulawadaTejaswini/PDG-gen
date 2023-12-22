import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            long sum = 0;
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
                sum += A[i];
            }

            long left = 0;
            long right = 0;
            long mid = 0;
            for (int i = 0; i < N; i++) {
                left += A[i];
                if (left >= sum / 2) {
                    right = sum - left;
                    left -= A[i];
                    mid = A[i];
                    break;
                }
            }

            long ans = Math.min(left, right) + mid - Math.max(left, right);

            System.out.println(ans);
        }
    }

}
