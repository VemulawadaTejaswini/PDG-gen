import java.math.*;
import java.util.*;

public class Main {
    static double per(double n, int i, int k) {
        int cnt = 0;
        while (true) {
            if (i > k)
                break;
            i *= 2;
            cnt++;
        }
        return 1 / (n*Math.pow(2,cnt));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int k = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += per(n, i, k);
            
        }
        System.out.println(ans);
    }
}