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
        String N = sc.next();
        boolean ans = false;
        if (N.charAt(0) == N.charAt(1) && N.charAt(1) == N.charAt(2)) {
            ans = true;
        }

        if (N.charAt(1) == N.charAt(2) && N.charAt(2) == N.charAt(3)) {
            ans = true;
        }

        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
