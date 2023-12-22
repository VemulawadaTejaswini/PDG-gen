import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int source = Integer.parseInt(sc.next());
        int target = Integer.parseInt(sc.next());
        int[] palace = new int[n];
        int ans = 0;
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i ++) {
            palace[i] = Integer.parseInt(sc.next());
            double tmp = (source-(palace[i] * 0.006));
            if (min > Math.abs(tmp - target)) {
                 min = Math.abs(tmp - target);
                 ans = i;
            }
        }
        System.out.println(ans + 1);
    }
}
