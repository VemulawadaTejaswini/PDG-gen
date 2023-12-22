import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            ans += m / 2;
            a[i] = m % 2;
        }

        for (int i = 1; i < n; i++) {
            if (a[i - 1] == 1 && a[i] == 1) {
                a[i]--;
                ans++;
            }
        }
        System.out.println(ans);
    }
}