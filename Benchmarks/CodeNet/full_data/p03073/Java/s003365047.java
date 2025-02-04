import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        String S = scanner.nextLine();
        int ans1 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0 && S.charAt(i) == '1') {
                ans1++;
            }
            if (i % 2 == 1 && S.charAt(i) == '0') {
                ans1++;
            }
        }
        int ans2 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0 && S.charAt(i) == '0') {
                ans2++;
            }
            if (i % 2 == 1 && S.charAt(i) == '1') {
                ans2++;
            }
        }


        System.out.println(Math.min(ans1, ans2));
    }

}