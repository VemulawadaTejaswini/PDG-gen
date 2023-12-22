import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] luca = new long[87];
		luca[0] = 2;
		luca[1] = 1;
		
		if (n >= 2) {
			for (int i = 2; i <= n; i++) {
				luca[i] = luca[i-1]+luca[i-2];
			}
		}
		
		System.out.println(luca[n]);
	}
}
