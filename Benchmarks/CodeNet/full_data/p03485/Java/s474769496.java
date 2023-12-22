import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println((int) Math.ceil((a + b) / 2));
    }
}
