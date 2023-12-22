import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 long A = scan.nextLong();
		 long B = scan.nextLong();
		 int C = scan.nextInt();
		 int D = scan.nextInt();
		 
		 long cnt_C = 0;
		 long cnt_D = 0;
		 long cnt_C_and_D = 0;
		 
		 long lcm_C_and_D = lcm (C,D);
		 
		 cnt_C = B / (long)C - calc_rounding_quo(A, (long)C) + 1;
		 cnt_D = B / (long)D - calc_rounding_quo(A, (long)D) + 1;
		 cnt_C_and_D = B / lcm_C_and_D - calc_rounding_quo(A, lcm_C_and_D) + 1;
		 
		 System.out.println(B - A + 1 - cnt_C - cnt_D + cnt_C_and_D);
		 
		 scan.close();
		 
	}
	
	public static long lcm (long m, long n) {
		return m * n / gcd(m, n);
		
	}
	
	public static long gcd (long m, long n) {
		if (m < n) 	return gcd(n, m);
		if (n == 0) return m;
		return gcd(n, m % n);
		
	}
	
	public static long calc_rounding_quo (long a, long b) {
		return (a + b - 1) / b;
		
	}

}
