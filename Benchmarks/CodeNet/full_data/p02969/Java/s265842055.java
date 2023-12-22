import java.util.Scanner;

public class Main {

    public static void main(final String... args) {
        final String mode = "a";

        if (mode.equals("a")) {
            A.solve();
        }
    }
}

class A {
    static void solve() {
        final Scanner sc = new Scanner(System.in);
        final int r = sc.nextInt();
        final int res = calc(r);
        System.out.println(res);
    }

    static int calc(final int r) {
        return 3 * r * r;
    }
}