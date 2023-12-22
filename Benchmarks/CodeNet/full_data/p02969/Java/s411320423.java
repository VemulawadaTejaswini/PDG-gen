import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int r = input.nextInt();

        int ans = (int)(3 * Math.pow(r, 2));

        System.out.println(ans);

    }
}
