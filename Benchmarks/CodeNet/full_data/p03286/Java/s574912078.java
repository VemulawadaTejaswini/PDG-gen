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
        StringBuilder sb = new StringBuilder();
        while (N != 0) {
            if (Math.abs(N % 2) == 1) {
                sb.append(1);
                N -= 1;
            } else {
                sb.append(0);
            }
            N = N / -2;
        }
        sb.reverse();
        if (sb.length() == 0) {
            sb.append(0);
        }
        System.out.println(sb.toString());
    }
}
