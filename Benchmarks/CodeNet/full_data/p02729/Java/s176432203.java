import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int ans = 0;
        for (int i = 0; i < N + M; i++) {
            for (int j = 0; j < N + M; j++) {
                if (i == j) {
                    continue;
                }
                int t = 0;
                t += i < N ? 2 : 3;
                t += j < N ? 2 : 3;
                if (t % 2 == 0) {
                    ans += 1;
                }
            }
        }
        System.out.println(ans/2);
    }
}
