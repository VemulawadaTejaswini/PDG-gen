
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		
		long min = Math.min(a, b);
		long max = Math.max(a, b);

		outside: for (long i = 1; i <= min; i++) {
			for (long j = 1; j <= max; j++) {
				if (max * i < min * j) {
					break;
				}
				
				if (max * i == min * j) {
					System.out.println(max * i);
					break outside;
				}
			}
		}
		
		
		
	}
}
