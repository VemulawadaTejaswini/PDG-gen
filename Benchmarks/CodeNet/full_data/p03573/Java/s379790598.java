import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static final void main(String[] args) {
        Main m = new Main();
        m.init();
        m.solve();
    }

    // ========================================================================= //
    int a, b, c;

    public void init() {
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }

    public void solve() {
        if (a == b) System.out.println(c);
        if (b == c) System.out.println(a);
        if (c == a) System.out.println(b);
    }
}
