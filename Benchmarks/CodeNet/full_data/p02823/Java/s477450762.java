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
        long N = Long.parseLong(scanner.next());
        long A = Long.parseLong(scanner.next());
        long B = Long.parseLong(scanner.next());
        long abs = Math.abs(A - B);
        System.out.println((abs / 2) + (abs % 2) == 1 ? 1 : 0);
    }

}
