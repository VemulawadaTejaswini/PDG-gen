import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();
        int[] t = new int[n+1];
        int[] x = new int[n+1];
        int[] y = new int[n+1];
        // 初期値
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;
        // 入力値
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int dt, dist, diff;
        for (int i = 0; i < n; i++) {
            // dt = t[i+1] - t[i];
            // dist = Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1] - y[i]);
            // if (dt < dist || (dist % 2 != dt % 2)) {
            //     // 出力
            //     System.out.println("No");
            //     return;
            // }
            diff = Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1] - y[i]) - t[i+1] + t[i];
            if (diff > 0 || (diff % 2 != 0)) {
                // 出力
                System.out.println("No");
                return;
            }
        }

        // 出力
        System.out.println("Yes");
    }
}
