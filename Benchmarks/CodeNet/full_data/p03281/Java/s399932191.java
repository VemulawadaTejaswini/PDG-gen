
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int divisor = 0;
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 1) {
				continue;
			}
			for (int j = 1; j <= n; j++) {
				if (i % j == 0) {
					divisor++;
				}
			}
			if (divisor == 8) {
				ans++;
			}
			
			divisor = 0;
		}
		System.out.println(ans);
	}
}