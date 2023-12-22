import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n+1];
        int[] x = new int[n+1];
        int[] y = new int[n+1];

        // 初期化
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;

        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        boolean canTravel = true;
        for (int i = 0; i <= n; i++) {
            if (n < i+1) break;

            int dist = t[i+1] - t[i];
            int distAbs = Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1] - y[i]);

            // 移動する時間が足りない
            if (dist < distAbs) {
                canTravel = false;
                break;
            }

            if (dist % 2 != distAbs % 2) {
                canTravel = false;
                break;
            }
        }

        System.out.println(canTravel ? "Yes" : "No");
    }
}
