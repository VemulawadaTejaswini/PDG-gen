import java.util.*;
import java.util.stream.Collectors;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 16MB stack
        Thread thread = new Thread(null, new Main(), "", 16 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int a = Integer.parseInt(scanner.nextLine());
    // int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int a = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        int e = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        System.out.println(e - a <= k ? "Yay!" : ":(");

    }

}
