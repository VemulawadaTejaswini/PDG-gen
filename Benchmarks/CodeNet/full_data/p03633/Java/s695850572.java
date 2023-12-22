import java.util.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long t = 0;
        long ans = 1;
        for(int i=0; i<n; i++){
            t = sc.nextLong();
            ans = lcm(ans, t);
        }
        System.out.println(ans);
    }
    public static long gcd(long a, long b){
        while(true){
            if(a == 0) return b;
            b %= a;
            if(b == 0) return a;
            a %= b;
        }
    }
    public static long lcm(long a, long b){
        if(gcd(a, b) > 0){
            return a*b/gcd(a,b);
        }else{
            return 0;
        }
    }
}
