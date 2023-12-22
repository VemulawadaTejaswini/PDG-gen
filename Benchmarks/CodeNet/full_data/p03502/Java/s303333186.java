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

        int x = 0;
        for (int i = 0; i < N.length(); i++) {
            x += Character.getNumericValue(N.charAt(i));
        }

        if (Integer.parseInt(N) % x == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
