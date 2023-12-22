import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        List<Integer> b = new ArrayList<>();
        for (int i = 0, t; i < n; i++) {
            b.add(t = scanner.nextInt());
            if (t > i + 1) {
                System.out.println(-1);
                return;
            }
        }
        int[] ans = new int[n];
        while (n > 0) {
            for (int i = n, d = 0; i > 0 && n > d; i--) {
                if (b.get(i - 1) == i) {
                    ans[--n] = b.get(i - 1);
                    b.remove(i - 1);
                    continue;
                }
                d = Math.max(d, n - i + b.get(i - 1));
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}