import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= String.valueOf(N).length(); i++) {
            ans += N % (int) Math.pow(10, i) / (int) Math.pow(10, i - 1);
        }
        if (N % ans == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}