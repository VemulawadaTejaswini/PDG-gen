import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int K = scan.nextInt();
        solve(K);
    }
    public static void solve(int K) {
        int divide = K / 9;
        int mod = K % 9;
        StringBuilder base = new StringBuilder();
        for (int i = 1; i <= K; i++) {
            if (i % 9 == 0) {
                base.append('9');
                System.out.println(base.toString());
                continue;
            }
            System.out.println((i % 9) + base.toString());
        }
    }
}
