import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong(), k = scan.nextLong();
		
		if(n == 0 || k == 0) {
			System.out.println(n);
			
		}else if(n < k) {
			System.out.println(Math.min(n, k - n));
			
		}else {
			System.out.println(Math.min(n % k, k - ( n % k )));
			
		}
		
		
	}
}
