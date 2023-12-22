import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long divc = b/c - (a-1)/c;
        long divd = b/d - (a-1)/d;
        long lcmcd = lcm(c,d);
        long divcd = b/lcmcd - (a-1)/lcmcd;
        System.out.println((b-a+1) - divc - divd + divcd);
    }
    
    private static long gcd(long a, long b){
        while (b > 0)
        {
            long temp = b;
            b = a % b; 
            a = temp;
        }
        return a;
    }

    private static long lcm(long a, long b){
        return a * (b / gcd(a, b));
    }
}
