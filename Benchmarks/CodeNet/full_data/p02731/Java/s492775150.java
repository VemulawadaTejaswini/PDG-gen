
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        double d = l / (double) 3;
        System.out.println(d * d * d);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
