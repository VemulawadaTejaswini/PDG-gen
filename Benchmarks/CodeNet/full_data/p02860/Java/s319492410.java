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
        String S = scan.next();
        StringBuilder sb = new StringBuilder(S);
        if (N % 2 != 0) {
            System.out.println("No");
            return;
        }
        String sub = sb.substring(0, N / 2);
        if (S.equals(sub+sub)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
