
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();
		long ans = sc.nextLong();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		for(Long e : list) {
			ans = gcd(ans, e);
		}
		System.out.println(ans);

	}

	public static long gcd(long a, long b) {
		long ans = 0;
		if(a < b) {
			b = b % a;
			ans = gcd(a, b);
		} else if(a > b) {
			a = a % b;
			ans = gcd(a, b);
		} else {
			ans = a;
		}
		return ans;
	}

}
