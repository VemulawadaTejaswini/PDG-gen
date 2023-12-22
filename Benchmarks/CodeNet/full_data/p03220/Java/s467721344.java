import java.math.*;
import java.util.*;

public class Main {
    static double deg(double t, double h) {
        return t - (h * 0.006);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double t = sc.nextDouble();
        double a = sc.nextDouble();
        double gap = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            double tmp = sc.nextDouble();
            if (i == 0) {
                ans = i + 1;
                gap = Math.abs(a -deg(t, tmp));
            }
            if (Math.abs(a - deg(t, tmp)) < gap) {
                gap = Math.abs(a - deg(t, tmp));
                ans = i + 1;
            }
        }
        System.out.println(ans);
    }
}
