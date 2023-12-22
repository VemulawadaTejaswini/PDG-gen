import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	long a = scan.nextLong();
      	long b = scan.nextLong();
      	long c = scan.nextLong();
      	long d = scan.nextLong();
      	long g = gcd(a,b);
      	long countb = b;
      	long counta = a-1;
      	long l = c * d / g;
      	if(g == 1){
        	countb = countb - b/c - b/d;
          	counta = counta - a/c - a/d;
        }
      	else{
      	countb = countb - b/c - b/d + b/l;
      	counta = counta - a/c - a/d + a/l;
        }
      	System.out.print(countb - counta);
    }
  	public static long gcd(long m , long n){
      long r ;
      if(m % n == 0){
      	r = n;
      }
      else{
        	r = m % n;
    	while( r != 0 ) {
            m = n;
            n = r;
          r = m % n;
        }
      }
      return n;
    }
 
}