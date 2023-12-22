import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ans = new String[3];
        for (int i = 0; i < 3; i++) {
            int a = (int) n % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i);
            if (a == 1) {
                ans[3 - i - 1] = "9";
            } else if (a == 9) {
                ans[3 - i - 1] = "1";
            } else {
                ans[3 - i - 1] = String.valueOf(a);
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(ans[i]);
        }
        System.out.println();
    }
}