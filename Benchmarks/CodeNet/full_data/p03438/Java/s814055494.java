import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        long i = 0, j = 0;
        long[] a = LongStream.range(0, n).map(k -> scanner.nextInt()).toArray();
        for (int k = 0; k < n; k++) {
            long b = scanner.nextInt();
            if (a[k] < b) {
                i += (b - a[k]) / 2;
            } else {
                j += a[k] - b;
            }
        }
        System.out.println(i >= j ? "Yes" : "No");
    }
}