import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            int j = i;
            int c = 0;
            while (j < k) {
                j *= 2;
                c++;
            }

            ans += 1d / (n * (1 << c));
        }
        System.out.println(ans);
    }
}