import java.util.*;
public class Main {
    public static long greatestCommonDiv(long c, long d) {
        if (d > c) {
            long temp = c;
            c = d;
            d = temp;
        }
        if (d == 0) return c;
        return greatestCommonDiv(d, c%d);
    }
    public static long leastCommonMul(long c, long d) {
        return (c*d) / greatestCommonDiv(c, d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long ac = (a-1)/c;
        long bc = b/c;
        long ad = (a-1)/d;
        long bd = b/d;
        long lcm = leastCommonMul(c, d);
        long blcm = b/lcm;
        long alcm = (a-1)/lcm;
        long res = b - a + 1 - (bc - ac + bd - ad - blcm + alcm);
        System.out.println(res);
    }
}