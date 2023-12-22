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
        int H = scan.nextInt();
        int A = scan.nextInt();
        int answer = H / A;
        if (H % A != 0) {
            answer += 1;
        }
        System.out.println(answer);
    }
}
