import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = in.nextInt();
            }
            int[] C = new int[N];
            for (int i = 0; i < N; i++) {
                C[i] = in.nextInt();
            }
            Arrays.sort(A);
            Arrays.sort(B);
            Arrays.sort(C);

            long count = 0;
            long[] b = new long[N];
            long[] sumB = new long[N];
            for (int i = B.length - 1; i >= 0; i--) {
                int index = binarySearch(C, B[i]);
                if (index + 1 < C.length) {
                    if (C[index + 1] >= B[i]) {

                    } else {
                        Utils.debug("false");
                    }
                } else {
                    Utils.debug("false2");
                }
                b[i] = N - (index + 1);
                sumB[i] = (i + 1 < N ? sumB[i + 1] : 0) + b[i];
            }

            Utils.debug("b", b);
            Utils.debug("sumB", sumB);

            for (int i = 0; i < A.length; i++) {
                int index = binarySearch(B, A[i]);
                if (index + 1 >= 0 && index + 1 < N) {
                    count += sumB[index + 1];
                    Utils.debug(i, count);
                }
            }
            System.out.println(count);
        }
    }

    private static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal <= key) {
                if (mid + 1 < a.length && a[mid + 1] > key) {
                    return mid;
                } else if (mid + 1 >= a.length) {
                    return mid;
                } else {
                }
                low = mid + 1;
            } else if (midVal > key) {
                if (mid - 1 >= 0 && a[mid - 1] <= key) {
                    return mid - 1;
                } else if (mid - 1 < 0) {
                    return mid - 1;
                } else {
                }
                high = mid - 1;
            } else {
            }
        }
        return -(low + 1);
    }
}

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}
