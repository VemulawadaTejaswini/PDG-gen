import java.util.*;

public class Main {
    public static void main(String[] args) {
        // read inputs
        Scanner in = new Scanner(System.in);
        int ai = in.nextInt(), ao = in.nextInt(), at = in.nextInt(), aj = in.nextInt(),
                al = in.nextInt(), as = in.nextInt(), az = in.nextInt();

        // solve
        int ans = 0;
        // use i blocks
        ans += (ai / 2) * 2;
        ai = ai % 2;
        // use o blocks
        ans += ao;
        // use i, j and l blocks
        if (ai >= 1 && aj >= 1 && al >= 1) {
            ans += 3;
            ai--;
            aj--;
            al--;
        }
        // use j and l blocks
        ans += Math.min(aj, al) * 2;
        System.out.printf("%d\n", ans);
    }
}
