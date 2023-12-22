import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		Long n = scan.nextLong();
		long ans = 0;
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n + 1; j++) {
				for(int k = 1; k < n + 1; k++) {
					ans = ans + gcd(i, j, k);
				}
			}
		}
		System.out.println(ans);
	}
	
	public static long gcd (long a, long b, long c) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		
		while((temp = c%b)!=0) {
			c = b;
			b = temp;
		}
		return b;
	}
}