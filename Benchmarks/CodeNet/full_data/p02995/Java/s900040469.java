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
      	
      	countb = countb - b/c - b/d + b/l;
      	counta = counta - a/c - a/d + a/l;
        
      	System.out.print(countb - counta);
    System.out.print(countb);
    }
  	public static long gcd(long m , long n){
      if(n == 0){
      	return m;
      }
      else{
        	return gcd(n, m%n);
      }
    }
 
}