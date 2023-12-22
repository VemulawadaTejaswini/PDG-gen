import java.util.*;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        long l = lcm(C,D);
        long val1 = B - (B/C + B/D) + B/l;
        long val2 = (A-1) - ((A-1)/C + (A-1)/D) + (A-1)/l;
        System.out.println(val1-val2);
        sc.close();
    }

    //b < a
    static long gcd(long a, long b) {
        if (a == 0 || b == 0) return b+a;
        else return gcd(b,a%b);
    }

    static long lcm(long a, long b) {
        if(a <= b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        return a*b/gcd(a,b);
    }
}