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
        long N = scan.nextLong();
        long P = scan.nextLong();
        if (N == 1) {
            System.out.println(P);
            return;
        }
        long answer = 1;
        for (long i = 2; i * i <= P ; i++) {
            if (P % i != 0) {
                continue;
            }
            long count = 0;
            while (P % i == 0) {
                P /= i;
                count += 1;
            }
            if (count < N) {
                continue;
            }
            long num = count / N;
            answer *= num * i;
        }
        System.out.println(answer);
    }
}
