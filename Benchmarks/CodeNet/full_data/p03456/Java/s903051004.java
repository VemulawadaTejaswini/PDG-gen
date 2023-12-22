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
        String a = scan.next();
        String b = scan.next();
        String X = a + b;
        int target = Integer.valueOf(X);
        boolean answer = false;
        for (int i = 1; i * i <= target; i++) {
            if (i * i == target) {
                answer = true;
                break;
            }
        }
        System.out.println(answer ? "Yes" : "No");
    }
}
