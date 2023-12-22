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
        if (S % 2 == 0) {
            long x = S / 2;
            System.out.println("0 0 0 2 " + x + " 0");
        } else {
            int x = 1;
            while (x <= S) {
                if (S % x == 0 && 2 < x) {
                    break;
                }
                x += 1;
            }
            System.out.println("0 0 0 " + x + " " + S/x + " 0");
        }
    }
}
