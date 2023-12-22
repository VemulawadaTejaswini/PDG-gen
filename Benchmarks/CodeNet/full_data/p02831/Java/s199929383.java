import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long gcd = gcd(a, b);
        System.out.println(a * b / gcd);
        scan.close();
    }
    public static long gcd(long x, long y){
        if(x % y == 0) return y;
        return gcd(y, x % y);
    }
}