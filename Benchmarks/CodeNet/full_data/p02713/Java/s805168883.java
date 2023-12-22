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
        int K = scan.nextInt();
        long ans = 0;
        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                int x = gcd(a,b);
                for (int c = 1; c <= K; c++) {
                    int y = gcd(x, c);
                    ans += y;
                }
            }
        }
        System.out.println(ans);
    }
    private int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
