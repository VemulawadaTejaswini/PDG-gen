import java.util.*;
public class Main {
	 public static long gcd(long x,long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static long lcm(long x,long y){                                                              
        return x*y/gcd(x,y);                                                                                                                                                                                                                
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = b/c;
        long f = b/d;        
        long g = b/lcm(c,d);
        long h = (a-1)/c;
        long i = (a-1)/d;        
        long j = (a-1)/lcm(c,d);
		System.out.println(b-e-f+g-a+1+h+i-j);
	}
}
