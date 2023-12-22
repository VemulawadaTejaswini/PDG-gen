
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long t = 0;
		long ans = 0;
		if (k % 2 == 0) {
			t = n / k;
			ans += (t * t * t);
			t = ((n*2) / k +1)/2;
			ans += (t * t * t);
		} else {
			t = n / k;
			ans += (t * t * t);
		}

		System.out.println(ans);

	}
}
