
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int k = in.nextInt();

        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextLong();
        }

        Arrays.sort(numbers);

        long l = Math.min(numbers[0] * numbers[n - 1], numbers[0] * numbers[1]);
        long r = Math.max(numbers[0] * numbers[1], numbers[n - 2] * numbers[n - 1]);
        while (l < r) {
            final long m = (r - l) / 2 + l;
            if (test(m, k, numbers, n)) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }

    private static boolean test(long m, long k, long[] numbers, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                int temp = 0;
                for (int j = i + 1; j < n; j++) {
                    if (numbers[i] * numbers[j] <= m) {
                        temp = n - j;
                        count += temp;
                        break;
                    }
                }
            } else {
                int temp = 0;
                for (int j = n - 1; j > i; j--) {
                    if (numbers[i] * numbers[j] <= m) {
                        temp = j - i;
                        count += temp;
                        break;
                    }
                }
            }
        }
        return count < k;
    }
}
