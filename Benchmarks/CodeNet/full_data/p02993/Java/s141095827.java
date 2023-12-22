import java.util.Scanner;

public class Main {
	
	public static long gcd(long a, long b) { 
	    if (a == 0) 
	        return b;  
	    return gcd(b % a, a);  
	 } 
	      
    public static long lcm(long a, long b) { 
        return (a*b)/gcd(a, b); 
    } 
	      
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
		
		long cSum = (b / c - (long)Math.ceil(a * 1.0 / c) + 1);
		long dSum = (b / d - (long)Math.ceil(a * 1.0 / d) + 1);
		long common = ((b / lcm(c, d)) - (long)Math.ceil(a * 1.0 / lcm(c, d)) + 1);
				
		System.out.println((b - a + 1) - (cSum + dSum - common));
	}
}
