import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        int q = input.nextInt();
        int r = input.nextInt();

        int a = p + q;
        int b = q + r;
        int c = r + p;

        int ans = Math.min(a, Math.min(b, c));

        System.out.println(ans);
    }
}
