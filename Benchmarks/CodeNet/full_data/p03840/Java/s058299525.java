import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // read inputs
        Scanner in = new Scanner(System.in);
        long ai = in.nextInt(), ao = in.nextInt(), at = in.nextInt(), aj = in.nextInt(),
                al = in.nextInt(), as = in.nextInt(), az = in.nextInt();

        // solve
        long ans = 0;
        // use i, j and l blocks
        if (ai > 0 && aj > 0 && al > 0
                && Stream.of(ai, aj, al).filter(a -> a % 2 == 1).count() >= 2) {
            ans += 3;
            ai--;
            aj--;
            al--;
        }
        // use i blocks
        ans += (ai / 2) * 2;
        // use l blocks
        ans += (al / 2) * 2;
        // use j blocks
        ans += (aj / 2) * 2;
        // use o blocks
        ans += ao;
        System.out.printf("%d\n", ans);
    }
}
