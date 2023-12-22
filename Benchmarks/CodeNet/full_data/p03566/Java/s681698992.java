import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] t = new int[n + 1];
        for (int i = 0; i < n; i++)
            t[i + 1] = t[i] + scanner.nextInt() * 2;
        int[] s = new int[t[n] + 2];
        for (int i = 0; i < n; i++)
            Arrays.fill(s, t[i] + 1, t[i + 1] + 1, scanner.nextInt() * 2);
        for (int i = 0; i <= t[n]; i++)
            s[i + 1] = Math.min(s[i + 1], s[i] + 1);
        for (int i = t[n]; i >= 0; i--)
            s[i] = Math.min(s[i], s[i + 1] + 1);
        double ans = 0;
        for (int i = 0; i <= t[n]; i++)
            ans += Math.min(s[i], s[i + 1]) + Integer.compare(s[i + 1], s[i]) / 2d;
        System.out.println(ans / 4);
    }
}