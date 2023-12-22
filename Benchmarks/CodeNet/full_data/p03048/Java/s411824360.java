import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int lcm = lcm(g, b);
        long ans = 0;
        for (int i = 0; r * i <= n; i++) {
            int need = n - r * i;
            if (need == 0) {
                ans++;
                break;
            }
            if (g != lcm && need % g == 0) {
                ans++;
            }
            if (b != lcm && need % b == 0) {
                ans++;
            }
            ans += need / lcm;
        }
        System.out.println(ans);
    }

    private static int lcm(int a, int b) {
        return Math.max(a, b) / gcd(a, b) * Math.min(a, b);
    }

    private static int gcd(int a, int b) {
        int temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}