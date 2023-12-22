import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt(), m = in.nextInt();
        if (Math.abs(n - m) > 1) {
            System.out.println(0);
            return;
        }
        long ans,  ans1= 1, ans2 = 1;
        for (int i = 1; i <= n; i++) {
            ans1 = (ans1 * i) % 1000000007;
        }
        System.out.println(ans1);
        for (int i = 1; i <= m; i++) {
            ans2 = (ans2 * i) % 1000000007;
        }
        System.out.println(ans2);
        ans = (ans1 * ans2) % 1000000007;
        System.out.println(n == m ? ans * 2 : ans);

    }
}
