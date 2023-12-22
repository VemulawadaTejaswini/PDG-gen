

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();
		scan.close();
		
		long numC = b/c - (a - 1)/c;
		long numD = b/d - (a - 1)/d;
		long lcmCD = lcm(c, d);
		long numCD = b/lcmCD - (a - 1)/lcmCD;
		
		//System.out.println(numC + " " + numD + " " + numCD);
		System.out.println(b - a + 1 - numC - numD + numCD);
		
	}
	
	public static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
	
	public static long gcd(long a, long b) {
		//System.out.println(a + " " + b);
		if(a < b) {
			return gcd(b, a);
		}
		if(b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}

}
