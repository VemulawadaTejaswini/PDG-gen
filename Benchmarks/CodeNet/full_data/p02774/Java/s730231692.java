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
        long K = scan.nextLong();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        Arrays.sort(A);
        int zeros = 0;
        int minus = 0;
        int plus = 0;
        long count_zero = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                zeros += 1;
                count_zero += N - zeros;
                continue;
            }
            if (A[i] < 0) {
                minus += 1;
                continue;
            }
            plus += 1;
        }
        long count_minus = (long) plus * (long) minus;
        //long count_plus = (long) N * ((long) N - 1) / 2 - count_zero - count_minus;
        if (K <= count_minus) {
            long ans = get_count_type1(N, A, K);
            System.out.println(ans);
            return;
        }
        if (K <= count_zero + count_minus) {
            System.out.println(0);
            return;
        }
        long ans = get_count_type2(N, A, K - count_zero - count_minus);
        System.out.println(ans);
    }
    private long get_count_type1(int N, long[] A, long K) {
        List<Long> minus = new ArrayList<>();
        List<Long> plus = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (A[i] < 0) {
                minus.add(A[i]);
            }
            if (0 < A[i]) {
                plus.add(A[i]);
            }
        }
        long left = - pow(18, 10);
        long right = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;
            int plus_len = plus.size();
            int minus_len = minus.size();
            int j = 0;
            for (int i = 0; i < minus_len ; i++) {
                while (j < minus_len && mid < minus.get(i) * plus.get(j)) {
                    j += 1;
                }
                count += minus_len - j;
            }
            if (K <= count) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private long get_count_type2(int N, long[] A, long K) {
        List<Long> minus = new ArrayList<>();
        List<Long> plus = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (A[i] < 0) {
                minus.add(A[i]);
            }
            if (0 < A[i]) {
                plus.add(A[i]);
            }
        }
        minus.sort(Comparator.reverseOrder());
        long left = 0;
        long right = pow(18, 10);
        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;
            int plus_len = plus.size();
            int minus_len = minus.size();
            int j = minus_len - 1;
            for (int i = 0; i < minus_len; i++) {
                while (i < j && mid < minus.get(i) * minus.get(j)) {
                    j -= 1;
                }
                count += Math.max(j - i, 0);
            }
            j = plus_len - 1;
            for (int i = 0; i < plus_len; i++) {
                while (i < j && mid < plus.get(i) * plus.get(j)) {
                    j -= 1;
                }
                count += Math.max(j - i, 0);
            }
            if (K <= count) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private long pow(int x, int base) {
        if (x == 0) {
            return 1;
        }
        if (x % 2 == 1) {
            return base * pow(x - 1, base);
        }
        long y = pow(x / 2, base);
        return y * y;
    }
}
