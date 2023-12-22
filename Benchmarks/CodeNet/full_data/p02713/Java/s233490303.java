import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int sum = 0;

		for (int a = 1; a <= k; a++) {
			for (int b = 1; b <= k; b++) {
				for (int c = 1; c <= k; c++) {
					sum += gcd(gcd(a,b),c);
				}
			}
		}
		
		System.out.println(sum);
	}

	public static int gcd(int p, int q) {
		if (p % q == 0) {
			return q;
		}
			return gcd(q, p % q);
	}

}
