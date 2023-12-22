
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long ans = a * b;

		long min = Math.min(a, b);
		List<Long> list = new ArrayList<>();
		
		for (long i = 2; i <= min; i++) {
			if (a % i == 0 && b % i == 0 ) {
				min /= i;
				a /= i;
				b /= i;
				list.add(i);
				i--;
			}
		}
		
		for (Long long1 : list) {
			ans /= long1;
		}
		System.out.println(ans);
	}
}
