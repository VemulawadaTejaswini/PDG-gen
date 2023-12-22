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
        int T = scan.nextInt();
        long answer = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int c = scan.nextInt();
            int t = scan.nextInt();
            if (T < t) {
                continue;
            }
            if (c < answer) {
                answer = c;
            }
        }
        if (answer == Integer.MAX_VALUE) {
            System.out.println("TLE");
        } else {
            System.out.println(answer);
        }
    }
}
