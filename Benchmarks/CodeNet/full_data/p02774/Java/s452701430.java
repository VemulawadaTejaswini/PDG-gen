
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final long k = in.nextLong();
        final long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextLong();
        }
        Arrays.sort(numbers);
        long l = Math.min(Math.min(numbers[0] * numbers[n - 1], numbers[0] * numbers[1]), numbers[n - 1] * numbers[n - 2]);
        long r = Math.max(numbers[0] * numbers[1], numbers[n - 2] * numbers[n - 1]) + 1;
        if (l == r - 1) {
            System.out.println(l);
            return;
        }
        while (l < r) {
            final long m = (r - l) / 2 + l;
            if (test(m, k, numbers, n)) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        System.out.println(l - 1);
    }

    private static boolean test(long m, long k, long[] numbers, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            int l = i + 1;
            int r = n;
            if (numbers[i] < 0) {
                while (l < r) {
                    final int mi = (r - l) / 2 + l;
                    if (numbers[i] * numbers[mi] >= m) {
                        l = mi + 1;
                    } else {
                        r = mi;
                    }
                }
                temp = n - l;
            } else {
                while (l < r) {
                    final int mi = (r - l) / 2 + l;
                    if (numbers[i] * numbers[mi] < m) {
                        l = mi + 1;
                    } else {
                        r = mi;
                    }
                }
                temp = l - 1 - i;
            }
            count += temp;
        }
        return count < k;
    }
}
