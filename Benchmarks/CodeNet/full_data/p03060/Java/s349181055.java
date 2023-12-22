import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] v = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.max(0, v[i] - c[i]);
        }
        System.out.println(ans);
    }
}
