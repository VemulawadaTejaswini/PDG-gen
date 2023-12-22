import java.util.Scanner;

public class Main {

    static int a;
    static int b;
    static int c;
    static int d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        solve();
    }

    static void solve() {
        if (Math.abs(a - c) <= d || (Math.abs(a - b) <= d && Math.abs(b - c) <= d)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
