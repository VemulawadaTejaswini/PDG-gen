import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        int pow = 0;
        long kForMaxF = 0; long maxF = 0;
        while (true) {
            int numZeros = 0;
            boolean allZero = true;
            for (int i = 0; i < n; i++) {
                if ((a[i] & 1) == 0) {
                    numZeros++;
                } else {
                    allZero = false;
                }
                a[i] >>= 1;
            }
            kForMaxF += ((numZeros > n / 2) ? (long) Math.pow(2, pow) : 0);
            int count = 0;
            if (kForMaxF <= k) {
                count = (numZeros > n / 2) ? numZeros : n - numZeros;
            } else {
                if (allZero) {
                    break;
                }
                count = n - numZeros;
            }
            maxF += count * (int) Math.pow(2, pow);
            pow++;
        }
        System.out.println(maxF);
    }
}
