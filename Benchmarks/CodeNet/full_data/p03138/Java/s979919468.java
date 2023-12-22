import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

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
        long sum = Arrays.stream(A).sum();
        long[][] diff = diff(N, A);
        int most_left_digits = max_digits(K);
        long max_diff = 0;
        long current_diff = 0;
        for (int i = most_left_digits; 0 <= i; i--) {
            long mask = 1L << i;
            // Kのi桁目が0の場合は、K以下にするために0にする必要がある
            if (0 == (K & mask)) {
                continue;
            }
            // Kのi桁目が1の場合は、0または1を選択可能で、0を選択する場合は
            // 必ずi-1桁目以降はどのように選択してもよい。
            // 事前に計算した各桁で1を選択した場合の差分から0より大きいものを選択する
            long t = 0;
            for (int j = i - 1; 0 <= j; j--) {
                t += Math.max(0, diff[j][1]);
            }
            max_diff = Math.max(max_diff, current_diff + t);
            // i桁目を1にする場合はcurrent_diffにi桁目を1にした場合の差分を追加する
            if (0 < (K & mask)) {
                current_diff += diff[i][1];
            }
        }
        System.out.println(sum + Math.max(current_diff, max_diff));
    }

    /**
     * 2進数表示で1があるところは何桁目(最上位)？
     * @param K
     * @return
     */
    private int max_digits(long K) {
        for (int i = 39; 0 <= i; i--) {
            long mask = 1L << i;
            if (0 < (K & mask)) {
                return i;
            }
        }
        return 0;
    }
    /**
     * diff配列を計算する
     * return long[][]
     */
    private long[][] diff(int N, long[] A) {
        long[][] diff = new long[40][2];
        for (int i = 39; 0 <= i; i--) {
            long mask = 1L << i;
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (0 < (A[j] & mask)) {
                    count += 1;
                }
            }
            diff[i][0] = 0;
            diff[i][1] = (N - 2 * count) * pow(i);
        }
        return diff;
    }
    /**
     * 2の累乗の計算をする
     * @param N
     * @return
     */
    private long pow(int N) {
        if (N == 0) {
            return 1;
        }
        if (N % 2 == 1) {
            return 2 * pow(N-1);
        }
        long x = pow(N / 2);
        return x * x;
    }
}
