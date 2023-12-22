import java.util.*;

public class Main {

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
		long n = Math.min(a, b);
		iniprime(n);
		for(long i = 2; i <= n; ++i){
			if(a % i == 0 && b % i == 0){
				boolean p = map.get(i);
				if(p)
				++ans;
			}
		}
		System.out.println(ans);
	}
}
