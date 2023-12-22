import java.util.Scanner;

public class Main {
    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.min(c, b / a));
    }
}
