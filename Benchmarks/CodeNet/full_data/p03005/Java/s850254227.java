import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    static void solve() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (k == 1) {
            System.out.println(0);
        } else {
            System.out.println((n - (k - 1) - 1));
        }

    }
}
