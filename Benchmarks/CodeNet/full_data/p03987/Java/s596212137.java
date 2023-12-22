import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 1; i <= n; i++) {
            a[scanner.nextInt() - 1] = i;
        }
        long ans = 0;
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(0, n + 1));
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
            ans += (long)(i + 1) * (a[i] - set.lower(a[i])) * (set.higher(a[i]) - a[i]);
        }

        System.out.println(ans);
    }
}