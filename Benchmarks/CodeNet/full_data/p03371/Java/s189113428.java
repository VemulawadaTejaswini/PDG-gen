import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = 0;
        if (A + B <= 2 * C) {
            ans = A * X + B * Y;
        } else {
            int c = 0;
            if (X > Y) {
                ans = 2 * Y * C;
                ans += (X - Y) * A;
                ans = Math.min(ans, 2 * X * C);
            } else {
                ans = 2 * X * C;
                ans += (Y - X) * B;
                ans = Math.min(ans, 2 * Y * C);
            }
        }
        System.out.println(ans);
    }
}