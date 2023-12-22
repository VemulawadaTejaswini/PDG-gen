import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int M = scan.nextInt();
        long digits_length = 0;
        long digits_sum = 0;
        for (int i = 0; i < M; i++) {
            int d = scan.nextInt();
            long c = scan.nextLong();
            digits_length += c;
            digits_sum += d * c;
        }
        long ans = (digits_length - 1) + digits_sum / 9;
        System.out.println(ans);
    }
}
