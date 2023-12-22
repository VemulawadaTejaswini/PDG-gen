import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int X = scan.nextInt();
        int[] dp = new int[X+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        int[] types = {100,101,102,103,104,105};
        for (int i = 0; i <= X; i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (X < i + types[j]) {
                    continue;
                }
                dp[i + types[j]] = 1;
            }
        }
        System.out.println(dp[X] == 1 ? 1 : 0);
    }
}
