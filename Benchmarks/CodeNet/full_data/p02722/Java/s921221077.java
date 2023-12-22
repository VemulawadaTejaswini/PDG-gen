import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long N = X-1;
		Map<Long, Long> fact = new HashMap<>();
		long ans = 1;
		for(int i = 2; i <= Math.sqrt(N); i ++) {
			if(N % i == 0) {
				long n = 0;
				while(N % i == 0) {
					N /= i;
					n++;
				}
				fact.put((long)i, n);
			}
		}
		if(N > 1)
			fact.put(N, 1L);
		for(long x : fact.values())
			ans *= x+1;
		ans--;
		Set<Long> cd = new HashSet<>();
		for(int i = 1; i <= Math.sqrt(X); i++) {
			if(X % i == 0) {
				cd.add((long)i);
				cd.add(X/i);
			}
		}
		cd.remove(1L);
		for(long i : cd) {
			long Y = X;
			while(true) {
				if(Y % i == 0)
					Y /= i;
				else {
					Y %= i;
					break;
				}
				if(Y == 1)
					break;
			}
			if(Y == 1)
				ans++;
		}
		System.out.println(ans);
	}

}
