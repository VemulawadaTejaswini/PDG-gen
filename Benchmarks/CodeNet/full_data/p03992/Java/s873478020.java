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
        String S = scan.next();
        StringBuilder sb = new StringBuilder();
        sb.append(S.substring(0,4));
        sb.append(' ');
        sb.append(S.substring(4));
        System.out.println(sb.toString());
    }
}
