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
        long H = scan.nextLong();
        long step = 0;
        while (0 < H) {
            H /= 2;
            step += 1;
        }
        long answer = pow(step)-1;
        System.out.println(answer);
    }
    private long pow(long N) {
        if (N == 0) {
            return 1;
        }
        if (N % 2 == 1) {
            return 2 * pow(N-1);
        }
        long x = pow(N/2);
        return x * x;
    }
}
