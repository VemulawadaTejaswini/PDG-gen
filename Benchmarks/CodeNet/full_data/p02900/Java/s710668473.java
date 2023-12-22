import java.util.*;

public class Main {

	public static long gcd(long a, long b) {
		if (a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		if (b == 1)
			return b;
		long r = a % b;
		if (r == 0)
			return b;
		return gcd(b, r);
	}

	static Map<Long, Boolean> map = new HashMap<Long, Boolean>();
 
	public static void iniprime(long len){
		map.put((long)0, false);
		map.put((long)1, false);
		map.put((long)2, true);
		for(long i = 2; i < len; ++i){
			if(map.get(i) == null || map.get(i) != false){
				map.put(i, true);
				for(long j = 2; i <= len / j; ++j){
					if(i >= Long.MAX_VALUE / j)break;
					map.put(i * j, false);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b = sc.nextLong();
		sc.close();
		long ans = 1;
		long g = gcd(a, b);
		iniprime(g);
		for (long i = 2; i <= g; ++i) {
			if (g % i == 0) {
				if (map.get(i))
					++ans;
			}
		}
		System.out.println(ans);
	}
}
