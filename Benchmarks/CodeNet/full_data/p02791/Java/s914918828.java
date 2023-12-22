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
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scan.nextInt();
        }
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (min >= P[i]) {
                ans += 1;
                min = P[i];
            }
        }
        System.out.println(ans);
    }
}
