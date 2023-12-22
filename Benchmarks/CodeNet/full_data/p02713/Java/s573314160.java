import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int sum = 0;
		for (int a = 1; a <= k ; a++) {
			for (int b = 1; b <= k; b++) {
				for (int c = 1; c <= k; c++) {
					sum += gcd(a, b, c);
				}
			}
		}
		System.out.println(sum);
	}
	
	static int gcd(int a, int b, int c) {
		return gcd(gcd(a, b), c);
	}
	
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}
}
