import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        if (n == 2) {
            System.out.println(Math.abs(h[0] - h[1]));
            return;
        }

        int[] cost = new int[n];
        cost[0] = 0;
        cost[1] = Math.abs(h[1] - h[0]);
        for (int i = 2; i < n; i++) {
            cost[i] = Math.min(cost[i-2] + Math.abs(h[i] - h[i-2]),
                    cost[i-1] + Math.abs(h[i] - h[i-1]));
        }

        System.out.println(cost[n-1]);

    }
}
