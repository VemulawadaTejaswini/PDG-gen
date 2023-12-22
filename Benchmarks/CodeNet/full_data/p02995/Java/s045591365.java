import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong() - 1;
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long x = lcm(c, d);

        long modB = b - b / c - b / d + b / x;
        long modA = a - a / c - a / d + a / x;

        System.out.println(modB - modA);

    }

    static long lcm (long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return c/b;
    }

}
