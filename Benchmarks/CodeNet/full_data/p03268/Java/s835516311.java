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
        int K = scan.nextInt();
        long answer = 0;
        if (K % 2 == 1) {
            long t = (long) N / K;
            answer = t * t * t;
        } else {
            long t = (long) N / K;
            long u = (long) (N + K / 2) / K;
            answer += t * t * t + u * u * u;
        }
        System.out.println(answer);
    }
}
