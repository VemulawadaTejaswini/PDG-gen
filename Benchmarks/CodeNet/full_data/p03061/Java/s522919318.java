import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        int ans = 0;
        int[] a;
        int[] front_gcd;
        int[] back_gcd;

        n = Integer.parseInt(sc.next());
        a = new int[n + 5];
        front_gcd = new int[n + 5];
        back_gcd = new int[n + 5];

        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        for (int i = 1; i <= n; i++) {
            front_gcd[i] = gcd(front_gcd[i - 1], a[i]);

        }

        for (int i = n; i >= 1; i--) {
            back_gcd[i] = gcd(back_gcd[i + 1], a[i]);

        }

        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, gcd(front_gcd[i - 1], back_gcd[i + 1]));
        }

        System.out.println(ans);
    }

    public static int gcd(int x, int y) {
        int n = Math.min(x, y);
        int m = Math.max(x, y);

        while (n > 0) {
            int r = m % n;
            m = n;
            n = r;
        }

        return m;
    }

}
