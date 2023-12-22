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
        long A = scan.nextLong();
        long B = scan.nextLong();
        long K = scan.nextLong();
        if (0 < A - K) {
            System.out.printf("%d %d\n", A - K, B);
            return;
        }
        System.out.printf("%d %d\n", 0, Math.max(B - (K - A),0));
    }
}
