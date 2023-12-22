import java.util.*;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        double a = lessThanSqrt(sc.nextInt());
        double b = lessThanSqrt(sc.nextInt());
        double c = lessThanSqrt(sc.nextInt());
        System.out.println(a + b < c ? "Yes" : "No");
    }

    private static long lessThanSqrt (long a) {
        long b = longSqrt(a);
        if (b*b == a) {
            return b-1;
        } else {
            return b;
        }
    }

    private static long longSqrt (long a) {
        long b = (long)Math.sqrt(a);
        // 得られた値を2乗して元の値を超える場合は
        // 誤差で1大きくなっているため
        // 誤差修正のため1引いた値を返す
        if(b*b > a) {
            b--;
        }
        return b;
    }
}