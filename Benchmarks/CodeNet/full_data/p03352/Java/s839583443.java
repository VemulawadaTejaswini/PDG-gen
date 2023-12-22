import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int ans = 1;
        lavel:
        for (int i = 2; i < X; i++) {
            for (int j = 2;; j++) {
                if ((int) Math.pow(i, j) >X) {
                    continue lavel;
                } else if (ans < (int) Math.pow(i, j)) {
                    ans = (int) Math.pow(i, j);
                }
            }
        }
        System.out.println(ans);
    }
}