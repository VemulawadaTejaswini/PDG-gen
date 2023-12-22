
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(
                Math.pow(c - a - b, 2) - 4 * a * b > 0
                        ? "Yes" : "No");
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
