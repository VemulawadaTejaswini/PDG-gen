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
        for (int i = 0; i < K; i++) {
            if (i % 2 == 0) {
                if (A % 2 == 1) {
                    A -= 1;
                }
                A /= 2;
                B += A;
            } else {
                if (B % 2 == 1) {
                    B -= 1;
                }
                B /= 2;
                A += B;
            }
        }
        System.out.printf("%d %d\n", A, B);
    }
}
