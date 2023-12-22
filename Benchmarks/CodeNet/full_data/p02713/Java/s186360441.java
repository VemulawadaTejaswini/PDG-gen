import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long count = 0;
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= k; j++) {
				for (int l = 1; l <= k; l++) {
					int a = i;
					int b = j;
					int c = l;
					int min = Math.min(a, Math.min(b, c));
					int res = 0;
					for (int m = 1; m <= min; m++) {
						if (a % m == 0 && b % m == 0 && c % m == 0) {
							res = m;
						}
					}
					count += res;
				}
			}
		}
		System.out.println(count);
	}
}
