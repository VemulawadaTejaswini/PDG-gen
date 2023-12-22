import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int want = sc.nextInt();
		int count = 0;
		int minus = 0;
		int t = Math.min(want, k);
		for(int i = 0; i <= t; i++) {
			for(int m = i; m <= t; m++) {
				for(int j = m; j <= t; j++) {
					if(i + m + j == want) {
						count++;
						if(i == m && m == j) {
							minus++;
						}
					}
				}
			}
		}
		System.out.println((count * 3) - (2 * minus));
	}
}