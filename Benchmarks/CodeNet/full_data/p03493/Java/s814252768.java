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
        String s = scan.next();
        int answer = 0;
        for (char x : s.toCharArray()) {
            if (x == '1') {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
