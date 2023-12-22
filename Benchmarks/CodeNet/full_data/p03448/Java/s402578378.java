import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int X = scan.nextInt();
        int answer = 0;
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                int k = (X-(i*500 + j*100)) / 50;
                if (k < 0 || C < k) {
                    continue;
                }
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
