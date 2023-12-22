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
        while (1000000000 < y) {
            if (y % 2 == 0) {
                x *= 2;
                y /= 2;
                continue;
            }
        }
        System.out.println("0 0 0 " + x + " " + y + " 0");
    }
}
