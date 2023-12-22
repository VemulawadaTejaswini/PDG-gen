import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        long count = b/c + b/d - b/(c * d / gcd(c,d)) - (a/c + a/d - a/(c * d / gcd(c,d)));
        //System.out.println(b/c + b/d - b/(c * d / gcd(c,d)));
        //System.out.println((a/c + a/d - a/(c * d / gcd(c,d))));
        //System.out.println(count);
        if(a % c != 0 && a % d != 0){count--;}
        if(b % c != 0 && b % d != 0){count--;}
        System.out.println((b-a-count));
        
    }

    public static long gcd(long a, long b){
        if(b == 0){return a;}
        return gcd(b, a%b);
    }
}
