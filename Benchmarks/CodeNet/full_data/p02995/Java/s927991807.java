import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long multipleC = b / c - (a - 1) / c; // cの倍数の数
        long multipleD = b / d - (a - 1) / d; // dの倍数の数
        long lcm = getLcm(c, d);
        long commonMultiple = b / lcm - (a - 1) / lcm; // cdの公倍数の数

        long result = b - (a - 1) - multipleC - multipleD + commonMultiple;
        System.out.println(result);
    }

    static long getLcm(long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return c / b;
    }
}
