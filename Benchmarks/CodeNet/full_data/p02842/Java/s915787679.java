import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (Math.floor(i * 1.08) == N) {
                ans = i;
            }
        }
        if (ans == 0) {
            System.out.println(":(");
            return;
        }
        System.out.println(ans);
    }
}
