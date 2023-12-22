
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		
		int max = (int) Math.max(a, b);
		int aa = 1;
		int bb = 1;
		
		for (int i = max; 0 < i; i--) {
			if (a % i == 0 && b % i == 0) {
				max = i;
				break;
			}
			
		}
		
		long ans = a * b / max;
		
		System.out.println(ans);
	}
}