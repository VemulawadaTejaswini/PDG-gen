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
        long A = scan.nextLong();
        long B = scan.nextLong();
        if (B <= A) {
            System.out.println(K+1);
            return;
        }
        int count = 0;
        long current_cookie = 1;
        if (current_cookie < A) {
            count += A - current_cookie;
            current_cookie = A;
        }
        long times = (K - count) / 2;
        current_cookie += (B - A) * times;
        long remain = K - count - 2 * times;
        current_cookie += remain;
        current_cookie = Math.max(current_cookie, K + 1);
        System.out.println(current_cookie);
    }
}
