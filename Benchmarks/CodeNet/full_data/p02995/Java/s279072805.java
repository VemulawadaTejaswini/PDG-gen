import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        
        System.out.println( f(B, C, D) - f(A - 1, C, D) );
        
    }
    
    // x以下でcまたはdで割り切れない数の個数
    public static long f(long x, long c, long d){
        return x - x / c - x / d + x / LCM(c, d);
    }
    
    public static long GCD(long a, long b){
        if ( b == 0 ) return a; 
        return GCD(b, a % b);
    }
    
    public static long LCM(long a, long b){
        return a * b / GCD(a, b);
    }
}
