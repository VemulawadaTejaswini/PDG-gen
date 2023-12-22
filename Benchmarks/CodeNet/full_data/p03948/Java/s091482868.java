import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] a = new int[n];
        int[] min = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            min[i] = i == 0 ? a[i] : Math.min(min[i - 1], a[i]);
        }

        int ans = 0;
        int diff = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (diff < a[i] - min[i]) {
                diff = a[i] - min[i];
                ans = 1;
            } else if (diff == a[i] - min[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}