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
        long answer = Long.MAX_VALUE;
        for (int i = 0; i <= N; i++) {
            long current = 1;
            int j = N - i;
            for (int k = 0; k < i; k++) {
                current = current * 2;
            }
            current += K * j;
            answer = Math.min(answer, current);
        }
        System.out.println(answer);
    }
}
