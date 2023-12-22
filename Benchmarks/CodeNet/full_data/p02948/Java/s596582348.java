import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] days = new Integer[n];
        Integer[] sals = new Integer[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            days[i] = Integer.parseInt(sc.next());
            sals[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < n; i++) {
            if (days[i] <= m) {
                ans += sals[i];
            }
            m--;
        }
        System.out.println(ans);
    }
}
