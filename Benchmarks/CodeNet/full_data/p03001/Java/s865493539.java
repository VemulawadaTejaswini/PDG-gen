import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final long W = sc.nextLong();
        final long H = sc.nextLong();
        final long X = sc.nextLong();
        final long Y = sc.nextLong();

        System.out.printf("%f %d\n", W * H / 2.0, 2 * X == W && 2 * Y == H ? 1 : 0);
    }
}
