import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextInt();
        long d = scan.nextInt();
        System.out.println(b - a  - (b - a) / c - (b - a) / d + (b - a) / lcm(c, d));
        scan.close();
    }
    
    public static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
    
    public static long gcd(long a, long b){
        return b > 0 ? gcd(b, a % b) : a;
    }
}
