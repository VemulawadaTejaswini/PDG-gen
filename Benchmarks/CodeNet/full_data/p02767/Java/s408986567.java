import java.math.*;
import java.util.*;

public class Main {
    static int solve(int x, int i) {
        return (int) Math.pow(Math.abs(x - i), 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++)
            x[i] = sc.nextInt();
        Arrays.sort(x);
        int ans = 0;
        int tmp = 0;
        for (int i = 0; i <= x[n - 1]; i++) {
            for (int xi : x) {
                tmp += solve(xi, i);
            }
            if (i == 0)
                ans = tmp;
            if (tmp < ans)
                ans = tmp;
            tmp = 0;
        }
        System.out.println(ans);
    }
}