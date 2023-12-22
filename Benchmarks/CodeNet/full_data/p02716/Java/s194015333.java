
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        // 配列
        long[] even = new long[(n + 1) / 2];
        long[] odd = new long[n / 2];
        for (int i = 0; i < even.length; i++) {
            even[i] = a[2 * i];
        }
        for (int i = 0; i < odd.length; i++) {
            odd[i] = a[2 * i + 1];
        }
        // 累積和
        long[] evenSum = new long[(n + 1) / 2 + 1];
        long[] oddSum = new long[n / 2 + 1];
        for (int i = 1; i < evenSum.length; i++) {
            evenSum[i] = evenSum[i - 1] + even[i - 1];
        }
        for (int i = 1; i < oddSum.length; i++) {
            oddSum[i] = oddSum[i - 1] + odd[i - 1];
        }

        long sum = Long.MIN_VALUE;
        if (n % 2 == 0) {
            sum = Math.max(evenSum[(n + 1) / 2], oddSum[n / 2]);
        } else {
            // 偶数のみ
            for (int i = 0; i < even.length; i++) {
                long value = evenSum[n / 2 + 1] - even[i];
                if (sum < value) {
                    sum = value;
                }
            }

            // 奇数あり
            for (int i = 0; i < odd.length; i++) {
                long value = evenSum[i] - evenSum[0] + oddSum[odd.length] - oddSum[i];
                if (sum < value) {
                    sum = value;
                }
            }
        }

        System.out.println(sum);
    }

}
