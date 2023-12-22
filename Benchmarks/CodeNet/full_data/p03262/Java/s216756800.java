
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> pos = new ArrayList<>();
		pos.add(sc.nextLong());
		for(int i = 0; i < n; i++) {
			pos.add(sc.nextLong());
		}
		Collections.sort(pos);
		long pre = pos.get(0);
		List<Long> dist = new ArrayList<>();
		for(int i = 1; i < pos.size(); i++) {
			long tmp = pos.get(i);
			dist.add(tmp - pre);
			pre = tmp;
		}
		long ans = dist.get(0);
		for(int i = 1; i < dist.size(); i++) {
			ans = gcd(ans, dist.get(i));
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
