import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        if (s.matches("A?KIHA?BA?RA?")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
