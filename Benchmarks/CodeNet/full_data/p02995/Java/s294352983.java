import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
        long x = b/c + b/d - b/lcm(c, d);
        long y = (a-1)/c + (a-1)/d - (a-1)/lcm(c, d);

        System.out.println((b-a+1)-(x-y));
    }

    private static long lcm(long c, long d) {
        return c * d / gcd(c, d);
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
    }
}
