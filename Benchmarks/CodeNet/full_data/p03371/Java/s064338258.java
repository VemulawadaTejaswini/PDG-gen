
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        scan.close();

        long ans = Long.MAX_VALUE;

        ans = Math.min(ans, a * x + b * y);
        if (x >= y) {
            ans = Math.min(ans, a * (x - y) + c * 2 * y);
            ans = Math.min(ans, c * 2 * x);
        } else {
            ans = Math.min(ans, b * (y - x) + c * 2 * x);
            ans = Math.min(ans, c * 2 * y);
        }

        System.out.println(ans);
    }
}
