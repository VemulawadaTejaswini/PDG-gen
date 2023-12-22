
import java.util.Scanner;

public class Main {

    private static final int MOD = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        scan.close();

        long sum = 0;
        for (long i = k; i <= n + 1; i++) {
            sum += (long)(i * (2 * n - i + 1) - i * (i - 1)) / 2 + 1;
            sum %= MOD;
        }

        System.out.println(sum);
    }

}