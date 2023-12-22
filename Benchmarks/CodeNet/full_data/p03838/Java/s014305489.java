import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(calc(x, y));
//        test();
    }

    private static int calc(int x, int y) {
        if (x == y) {
            return 0;
        } else if (y == 0) {
            if (x >= 0) {
                return x;
            } else {
                return Math.abs(x) + 1;
            }
        } else if (x == 0) {
            if (y <= 0) {
                return Math.abs(y);
            } else {
                return y + 1;
            }
        } else if (y > 0 && y < x) {
            return x - y;
        } else if (x > 0 && y > x) {
            return y - x + 2;
        } else if (y < 0 && x < y) {
            return y - x + 2;
        } else if (x < 0 && y < x) {
            return x - y;
        } else {
            return Math.abs(Math.abs(x) - Math.abs(y)) + 1;
        }
    }

    private static void test() {
        System.out.println(calc(-1,2));
    }
}
