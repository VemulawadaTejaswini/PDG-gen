
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(r * 2 * Math.PI);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
