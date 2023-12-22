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
            long x = 0;
            if (S <= 1000000000) {
                x = 1;
            } else {
                long limit = (long) Math.sqrt(S) + 1;
                long jump = 2;
                for (x = 3; x <= limit; x += jump) {
                    if (S % x == 0) {
                        break;
                    }
                }
            }
            long y = S / x;
            System.out.println("0 0 0 " + x + " " + y + " 0");
        }
    }
}
