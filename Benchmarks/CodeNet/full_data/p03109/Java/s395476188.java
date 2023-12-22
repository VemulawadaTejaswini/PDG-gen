import java.util.*;

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
        String s = scanner.next();
        int[] n = Arrays.stream(s.split("/")).mapToInt(Integer::parseInt).toArray();
        if (n[0] > 2019 || (n[0] == 2019 && n[1] > 4)) {
            System.out.println("TBD");
        } else {
            System.out.println("Heisei");
        }
    }

}

