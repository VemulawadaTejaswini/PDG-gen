import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        long[] sumA = new long[N+1];
        for (int i = 0; i < N; i++) {
            sumA[i+1] = sumA[i] + A[N - i - 1];
        }

        long left = 0;
        long right = Long.MAX_VALUE/2;
        while (left <= right) {
            long mid = (left + right) / 2;
            int count = count(N, mid, A);
            if (M <= count) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        long threshold = right;
        long sum = sum(N, M, threshold, A, sumA);
        System.out.println(sum);
    }

    private long sum(int N, int M, long threshold, int[] A, long[] sumA) {
        long sum = 0;
        int remain = M;
        for (int i = N-1; 0 <= i && 0 < remain; i--) {
            int left = 0;
            int right = N - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (threshold - A[i] <= A[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (N - left <= remain) {
                sum += A[i] * (N - left) + sumA[N - left];
                remain -= N - left;
            } else {
                sum += A[i] * remain + sumA[remain];
                remain = 0;
            }
        }
        return sum;
    }

    private int count(int N, long threshold, int[] A) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = N - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (threshold - A[i] <= A[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            count += N - left;
        }
        return count;
    }
}
