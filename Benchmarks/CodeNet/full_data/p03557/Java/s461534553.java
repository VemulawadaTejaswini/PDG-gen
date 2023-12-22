import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int lowerBound(long[] x, long bj) {
        int leftIdx = -1;
        int rightIdx = x.length;
        while (rightIdx - leftIdx > 1) {
            int middleIdx = (leftIdx + rightIdx) / 2;
            if (bj <= x[middleIdx]) {
                rightIdx = middleIdx;
                continue;
            }
            leftIdx = middleIdx;
        }
        return rightIdx;
    }

    private static int upperBound(long[] x, long bj) {
        int leftIdx = -1;
        int rightIdx = x.length;
        while (rightIdx - leftIdx > 1) {
            int middleIdx = (leftIdx + rightIdx) / 2;
            if (bj < x[middleIdx]) {
                rightIdx = middleIdx;
                continue;
            }
            leftIdx = middleIdx;
        }
        return rightIdx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextLong();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        long count = 0;
        for (int j = 0; j < n; j++) {
            long bj = b[j];
            int aiCount = lowerBound(a, bj);
            int ckCount = n - upperBound(c, bj);
            count += aiCount * ckCount;
        }
        System.out.println(count);
    }

}
