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
        String d = Integer.toString(N);
        int digits = 0;
        char[] t = d.toCharArray();
        for (int i = 0; i < t.length; i++) {
            digits += t[i] - '0';
        }
        boolean answer = (N % digits) == 0;
        System.out.println(answer ? "Yes" : "No");
    }
}
