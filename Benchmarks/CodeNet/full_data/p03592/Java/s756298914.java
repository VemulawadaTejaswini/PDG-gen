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
        int M = scan.nextInt();
        int K = scan.nextInt();
        if ( K == 0 || K == N * M) {
            System.out.println("Yes");
            return;
        }
        if ( K % M == 0 || K % N == 0) {
            System.out.println("Yes");
            return;
        }

        for (int i = 1; i <= N; i++) {
            int count = M * i;
            for (int j = 1; j <= M; j++) {
                count = count - i + (N - i);
                if (count == K) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
