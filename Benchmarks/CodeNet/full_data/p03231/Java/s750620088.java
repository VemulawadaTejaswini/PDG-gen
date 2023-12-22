import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		String S = scan.next();
		String T = scan.next();
		scan.close();
		if(S.charAt(0) != T.charAt(0)) {
			System.out.println(-1);
			System.exit(0);
		}
		if(N == M) {
			if(S.equals(T)) {
				System.out.println(N);
			}else {
				System.out.println(-1);
			}
			System.exit(0);
		}
		long l = lcm((long)N, (long)M);
		long g = gcd((long)N, (long)M);
//		if(g == 1) {
//			System.out.println(l);
//			System.exit(0);
//		}
		int L = (int)l;
		Map<Long, Integer> map1 = new HashMap<Long, Integer>();
		Map<Long, Integer> map2 = new HashMap<Long, Integer>();
		for(int i = 1; i < N; i++) {
			Long t = (long)i * (L / N) + 1;
			map1.put(t, i);
		}
		for(int i = 1; i < M; i++) {
			Long t = (long)i * (L / M) + 1;
			map2.put(t, i);
		}


		for(long k : map1.keySet()) {
			if(map2.containsKey(k)) {
				int t1 = map1.get(k);
				int t2 = map2.get(k);
				if(S.charAt(t1) != T.charAt(t2)) {
					System.out.println(-1);
					System.exit(0);
				}
			}
		}

		System.out.println(L);


	}
	static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
	static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}
}