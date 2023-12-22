
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        scan.close();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (m * i + (n - 2 * i) * j == k) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}
