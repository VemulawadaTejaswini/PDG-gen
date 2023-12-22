import java.math.*;
import java.util.*;

public class Main {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xi[] = new int[n + 1];
        xi[0] = sc.nextInt();
        for(int i=1;i<=n;i++)
            xi[i] = sc.nextInt();
        Arrays.sort(xi);
        int diff[] = new int[n];
        int tmp = xi[0];
        for (int i = 1; i <= n; i++) {
            diff[i - 1] = xi[i] - tmp;
            tmp = xi[i];
        }
        int ans = diff[0];
        for (int i = 1; i < diff.length; i++) {
            ans = gcd(ans, diff[i]);
        }
        if (diff.length == 1)
            ans = diff[0];
        System.out.println(ans);
    }
}
