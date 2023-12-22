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
        long S = scan.nextLong();
        long x = 1;
        long y = S;
        if (S <= 1000000000) {
            System.out.println("0 0 0 " + x + " " + y + " 0");
            return;
        }
        x = 1000000000;
        y = 1;
        long m = S/x;
        long l = S%x;
        System.out.println("0 0 " + x + " " + y + " " + l + " " + m);
    }
}
