import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        System.out.println((-1 + (int) Math.sqrt(8 * X + 1)) / 2);
    }
}