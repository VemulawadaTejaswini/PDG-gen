
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long ans = (long) Math.pow(n / k, 3);
		if(k % 2 == 0) {
			n -= k / 2;
			ans += (long) Math.pow(n / k + 1, 3);
		}
		System.out.println(ans);
	}

}
