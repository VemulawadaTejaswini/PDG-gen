import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int mod = 2019;
        int l = std.nextInt();
        int r = std.nextInt();
        int ans = Integer.MAX_VALUE;

        for (int i = l; i <= r; i++) {
            for (int j = l + 1; j <= r; j++) {
                int m = (i % mod) * (j % mod);
                if (ans > m) {
                    ans = m;
                }
                if (ans == 0) {
                    break;
                }
            }

            if (ans == 0) {
                break;
            }
        }

        System.out.println(ans);
    }
}
