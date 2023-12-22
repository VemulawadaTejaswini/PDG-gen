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
        long N = scan.nextLong();
        long A = scan.nextLong();
        long B = scan.nextLong();
        long d = N / (A+B);
        long ans = A * d;
        long m = N % (A+B);
        ans += Math.min(m, A);
        System.out.println(ans);
    }
}
