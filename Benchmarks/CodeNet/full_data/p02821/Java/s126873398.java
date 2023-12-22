
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final long m = scanner.nextLong();

        final long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        final long[] cumulativeSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            cumulativeSum[i + 1] += cumulativeSum[i] + array[i];
        }

        /*
        ある値xに対して，その値を越える和の組み合わせが何通り存在するかを計算し，Mと比較して二分探索
        各a_iに対して和の組み合わせはn通りある（a_i + a_0, a_i + a_1, ..., a_i + a_(n-1)）
        このとき配列は昇順にソートされているので，a_i + a_j >= Xとなるjは，
        a_j >= X - a_iを満たす最小のjの値をkとすると(n-k)個存在する（このkは二分探索で求められる）．
        これを各a_iに対して計算していき，#jの総和(=何通りあるか)をとる．
        この値がmより大きければxを大きくして，小さければxを小さくして再計算
         
        long min = array[0] * 2;
        long max = array[n - 1] * 2;
        while (max - min > 1) {
            long mid = (min + max) / 2;
            long count = 0;
            for (int i = 0; i < n; i++) {
                final int index = extendedBinarySearch(array, mid - array[i]);
                count += n - index;
            }
            if (count >= m) {
                min = mid;
            } else {
                max = mid;
            }
        }

        long answer = 0;
        long count = 0;
        for (int i = 0; i < n; i++) {
            final int index = binarySearch(array, min - array[i]) + 1;
            if (index == n) {
                continue;
            }

            count += n - index;
            // (a + b_1) + (a + b_2) + ... +  (a + b_n) = (b_1 + b_2 + ... + b_n) + n * a = (S_n - S_0) + n * a
            answer += cumulativeSum[n] - cumulativeSum[index];
            answer += array[i] * (n - index);
        }

        answer += (m - count) * min;
        System.out.println(answer);
    }

    private static int extendedBinarySearch(final long[] indexes, final long value) {
        final int rawIndex = Arrays.binarySearch(indexes, value);

        if (rawIndex >= 0) {
            return rawIndex;
        }

        return -(rawIndex + 1);
    }

    private static int binarySearch(final long[] array, final long value) {
        int left = -1;
        int right = array.length;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (array[mid] < value) left = mid;
            else right = mid;
        }
        return left;
    }
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long M = scanner.nextLong();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
        Arrays.sort(a);
        long[] s = new long[N + 1];
        for (int i = 0; i < N; i++) s[i + 1] = s[i] + a[i];

        long left = a[0] * 2;
        long right = a[N - 1] * 2;
        while (right - left > 1) {
            long mid = (right + left) / 2;
            long k = 0;
            for (int i = 0; i < N; i++) {
                int t = upperBound(a, mid - a[i]) + 1;
                k += N - t;
            }
            if (k >= M) {
                left = mid;
            } else {
                right = mid;
            }
        }

        long total = 0;
        long k = 0;
        for (int i = 0; i < N; i++) {
            int t = upperBound(a, left - a[i]) + 1;
            k += N - t;
            total += s[N] - s[t];
            total += a[i] * (N - t);
        }

        total += (M - k) * left;
        System.out.println(total);
    }

    private static int upperBound(long[] a, long k) {
        int left = -1;
        int right = a.length;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (a[mid] < k) left = mid;
            else right = mid;
        }
        return left;
    }
}
