import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		long sum = 0;
		for (int a = 1; a <= k; a++) {
			for (int b = 1; b <= k; b++) {
				int r = gcd(a, b);
				for (int c = 1; c <= k; c++) {
					sum += gcd(r, c);
				}
			}
		}
		System.out.println(sum);
	}
	
	public static int gcd(int a, int b) {
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}
}
