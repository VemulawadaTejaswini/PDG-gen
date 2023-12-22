import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            h[i] = sc.nextInt();
        }
        int now = 1;
        long cost = 0;
        while (now < n) {
            if (now == n - 1) {
                cost = cost + Math.abs(h[n] - h[n - 1]);
                break;
            }
            int tmp_2 = Math.abs(h[now + 2] - h[now]);
            int tmp_1 = Math.abs(h[now + 2] - h[now + 1]) + Math.abs(h[now + 1] - h[now]);
            if (tmp_1 > tmp_2) {
                now = now + 2;
                cost = cost + tmp_2;
            } else {
                cost = cost + Math.abs(h[now + 1] - h[now]);
                now = now + 1;

            }
        }
        System.out.println(cost);


    }

}
