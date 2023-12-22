import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) p[i] = sc.nextInt();
        for (int i = 0; i < n; i++) q[i] = sc.nextInt();
        int a = func(p);
        int b = func(q);
        System.out.println(Math.abs(a - b));
    }
    public static int func(int[] p) {
        int ret = 0;
        int n = p.length;
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 1; j < p[i]; j++) {
                if (!used[j - 1]) cnt++;
            }
            ret += cnt * frac(n - 1 - i);
            used[p[i] - 1] = true;
        }
        return ret;
    }
    public static int frac(int x) {
        if (x == 0) return 1;
        return x * frac(x - 1);
    }
}