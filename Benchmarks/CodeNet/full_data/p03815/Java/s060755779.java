
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        if (x >= 11) {
            if (x % 11 != 0) {
                System.out.println(x / 11 * 2 + 1);
            } else {
                System.out.println(x / 11 * 2);
            }
        } else if (x > 6) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}
