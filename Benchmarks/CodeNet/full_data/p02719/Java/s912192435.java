import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		long n = sca.nextLong();
		long k = sca.nextLong();
		long ans = 0;
		long kouho_1 = 0;
		long temp = 0;
		long kouho_2 = 0;

		int big_or_small = 0;
		if(n > k) {
			temp = n/k;
			kouho_2 = n - (k*temp);

			temp = k - kouho_2;
			if(temp < kouho_2) {
				ans = temp;
			}
			else {
				ans = kouho_2;
			}
		}
		else if(n < k) {
			kouho_1 = k - n;
			if(kouho_1 < n) {
				ans = kouho_1;
			}
			else {
				ans = n;
			}
		}
		else {
			ans = n - k;
		}

		System.out.println(ans);

		// 後始末
		sca.close();
	}
}