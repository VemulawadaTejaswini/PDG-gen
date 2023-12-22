import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long prevT = 0;
		long prevA = 0;
		for (int i = 0; i < n; i++) {
			long t = sc.nextLong();
			long a = sc.nextLong();
			if (n == 0) {
				prevT = t;
				prevA = a;
				continue;
			}
			if (prevT > t || prevA > a) {
				long byT = prevT / t;
				if (prevT % t != 0) {
					byT++;
				}
				long byA = prevA / a;
				if (prevA % a != 0) {
					byA++;
				}
				long by = Math.max(byT, byA);
				t *= by;
				a *= by;
			}
			prevT = t;
			prevA = a;
		}
		System.out.println(prevT + prevA);
	}
}
