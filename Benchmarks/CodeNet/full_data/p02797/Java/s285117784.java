
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long k = sc.nextLong();
		long s = sc.nextLong();
		
		long[] ans = new long[n];
		
		if (k == 0) {
			for (int i = 0; i < ans.length; i++) {
				ans[i] = s + 1;
			}
		} else {
			for (int i = 0; i < ans.length; i++) {
				if (i < k) {
					ans[i] = s;
				} else {
					ans[i] = s + 1;
				}
			}
		}
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		
	}
}