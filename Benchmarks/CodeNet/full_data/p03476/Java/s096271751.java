import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean[] isPrime = makePrimes(100000);
        boolean[] isLike2017 = new boolean[100001];
        for (int i = 0; i <= 100000; i++) {
            isLike2017[i] = isPrime[i] && isPrime[(i + 1) / 2];
        }

        int[] sum = new int[100002];
        sum[0] = 0;
        for (int i = 0; i <= 100000; i++) {
            sum[i + 1] = sum[i];
            if (isLike2017[i]) {
                sum[i + 1]++;
            }
        }

        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            System.out.println(sum[r + 1] - sum[l]);
        }
    }

    private static boolean[] makePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, false);
        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
            for (int j = i * 2; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }
}
