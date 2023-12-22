
import static java.lang.Math.pow;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int b = in.nextInt();
        int k = in.nextInt();
        if (x >= 0 && x <= pow(10, 12) && b >= 0 && b <= pow(10, 12) && k >= 0 && k <= pow(10, 12)) {
            if (k == x) {
                System.out.println(0 + "" + b);
            } else if (k > x) {
                if (b - (k - x) > 0) {
                    System.out.println(0 + "" + (b - (k - x)));
                } else {
                    System.out.println(0 + "" + 0);
                }
            } else {
                System.out.println(x - k + "" + b);
            }
        }
    }
}
