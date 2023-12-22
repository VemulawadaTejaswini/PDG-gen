
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
        long count_zero = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                zeros += 1;
                continue;
            }
        }
        long left = -pow(18, 10);
        long right = pow(18, 10);
        while (left + 1 != right) {
            long mid = (left + right) / 2;
            long count = get_count(N, A, mid, zeros);
            if (K <= count) {
                right = mid;
            } else {
                left = mid;
            }
        }
        System.out.println(right);
    }
    private long get_count(int N, long[] A, long K, int zeros) {
        long cnt = get_count_type1(N, A, K);
        if (0 <= K) {
            cnt += (long)zeros * ((long)zeros - 1) / 2 + (long) zeros * (N - zeros);
        }
        if (0 < K) {
            cnt += get_count_type2(N, A, K);
        }
        return cnt;
    }
    private long get_count_type1(int N, long[] A, long limit) {
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
        long count = 0;
        int plus_len = plus.size();
        int minus_len = minus.size();
        int j = 0;
        for (int i = 0; i < minus_len; i++) {
            while (j < plus_len && limit < minus.get(i) * plus.get(j)) {
                j += 1;
            }
            count += plus_len - j;
        }
        return count;
    }
    private long get_count_type2(int N, long[] A, long limit) {
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
        long count = 0;
        int plus_len = plus.size();
        int minus_len = minus.size();
        int j = minus_len - 1;
        for (int i = 0; i < minus_len; i++) {
            while (i < j && limit < minus.get(i) * minus.get(j)) {
                j -= 1;
            }
            count += Math.max(j - i, 0);
        }
        j = plus_len - 1;
        for (int i = 0; i < plus_len; i++) {
            while (i < j && limit < plus.get(i) * plus.get(j)) {
                j -= 1;
            }
            count += Math.max(j - i, 0);
        }
        return count;
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
