import java.math.*;
import java.util.*;

public class Main {
    static double solve(double a) {
        return (a + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Double p[] = new Double[n];
        for (int i = 0; i < n; i++)
            p[i] = sc.nextDouble();
        double ans = 0;
        double tmp=0;
        for (int i = 0; i <= n - k ; i++) {
            for (int j = i; j <i + k; j++) {
                tmp += solve(p[j]);
            }
            if (tmp > ans)
                ans = tmp;
            tmp = 0;
        }
        System.out.println(ans);
    }
}