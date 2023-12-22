import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int max = (n - 1) * (n - 2) / 2;
        int min = (n - 2);
        if (k > max || k < min) {
            System.out.println("-1");
            System.exit(0);
        }

        if (k == max) {
            System.out.println(n - 1);
            for (int i = 2; i <= n; i++) {
                System.out.println("1 " + i);
            }
        } else {
            int x = max - k;
            System.out.println(n - 1 + x);
            for (int i = 2; i <= n; i++) {
                System.out.println("1 " + i);
            }
            for (int i = 0; i < x; i++) {
                System.out.println((i + 2) + " " + (i + 3));
            }

        }
    }
    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
