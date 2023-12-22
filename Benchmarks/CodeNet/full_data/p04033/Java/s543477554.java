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
        long a = scan.nextLong();
        long b = scan.nextLong();
        if (a == 0 || b == 0) {
            System.out.println("Zero");
            return;
        }
        if (a * b < 0) {
            System.out.println("Zero");
            return;
        }
        if (0 < a) {
            System.out.println("Positive");
            return;
        }
        long count = b - a + 1;
        if (count % 2 == 0) {
            System.out.println("Positive");
            return;
        }
        System.out.println("Negative");
    }
}
