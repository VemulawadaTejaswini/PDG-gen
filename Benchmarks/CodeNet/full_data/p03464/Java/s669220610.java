import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int k = scanner.nextInt();
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = scanner.nextInt();
        }
        int min = 2, max = 2;
        for (int i = k - 1; i >= 0; i--) {
            min = (min - 1) / a[i] * a[i] + a[i];
            max = max / a[i] * a[i] + a[i] - 1;
            if (min > max) {
                System.out.println(-1);
                return;
            }
        }
        System.out.printf("%d %d\n", min, max);
    }
}