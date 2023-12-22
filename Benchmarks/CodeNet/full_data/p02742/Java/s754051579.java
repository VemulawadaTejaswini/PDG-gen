import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long H = scan.nextInt();
        long W = scan.nextInt();
        long ans = H * (W / 2);
        if (W % 2 == 1) {
            ans += H / 2;
            if (H % 2 == 1) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
