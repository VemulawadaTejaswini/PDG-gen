import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		double n     = Double.parseDouble(tmp[0]);
		long k       = Long.parseLong(tmp[1]);
		List<Long> lst = new ArrayList<>();
		long max     = (long)Math.floor(k / n);
		long ans     = primeFactor(k, max, lst);

		System.out.println(ans);
	}
	private static long primeFactor(long num, long max, List<Long> list) {

		long ans = 0;
		for(long i = 1; i <= max; i++) {

			if(num % i == 0) {

				ans = Math.max(ans, i);
			}
		}

		return ans;
	}
}
