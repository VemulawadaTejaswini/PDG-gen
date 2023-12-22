import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n - k + 1; i++) {
            int min = Math.min(Math.abs(x[i]) + Math.abs(x[i] - x[i + k - 1]),
                    Math.abs(x[i + k - 1]) + Math.abs(x[i] - x[i + k - 1]));
            if (ans > min)
                ans = min;
        }
        System.out.println(ans);
    }
}
