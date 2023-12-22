
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] a = new long[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextLong();
        }
        long sum = 0;
        long mod = 1000000007L;
        long base = 1;
        for (int b = 0; b <= 60; ++b, base *= 2) {
            int [] ones = new int[n];
            int [] zeros = new int[n];
            if (((a[n - 1] >> b) & 1) == 1) {
                ones[n - 1] = 1;
            } else {
                zeros[n - 1] = 1;
            }
            for (int i = n - 2; i >= 0; --i) {
                if (((a[i] >> b) & 1) == 1) {
                    ones[i] = ones[i + 1] + 1;
                    zeros[i] = zeros[i + 1];
                } else {
                    zeros[i] = zeros[i + 1] + 1;
                    ones[i] = ones[i + 1];
                }
            }
            long currentSum = 0;
            for (int i = 0; i <= n - 2; ++i) {
                if (((a[i] >> b) & 1) == 1) {
                    currentSum = (currentSum + zeros[i + 1]) % mod;
                } else {
                    currentSum = (currentSum + ones[i + 1]) % mod;
                }
            }
            sum = (sum + currentSum * base % mod) % mod;
        }
        System.out.println(sum);

    }
}
