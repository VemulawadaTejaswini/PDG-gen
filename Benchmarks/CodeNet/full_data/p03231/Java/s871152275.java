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
		long g = lcm((long)N, (long)M);
		int L = (int)g;
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for(int i = 1; i < N; i++) {
			int t = i * L / N;
			map1.put(t, i);
		}
		for(int i = 1; i < M; i++) {
			int t = i * L / M;
			map2.put(t, i);
		}


		for(int k : map1.keySet()) {
			if(map2.containsKey(k)) {
				int t1 = map1.get(k);
				int t2 = map2.get(k);
				if(S.charAt(t1) != T.charAt(t2)) {
					System.out.println(-1);
					System.exit(0);
				}
			}
		}
//		for(int k : map2.keySet()) {
//			if(map1.containsKey(k)) {
//				int t1 = map1.get(k);
//				int t2 = map2.get(k);
//				if(S.charAt(t1) != T.charAt(t2)) {
//					System.out.println(-1);
//					System.exit(0);
//				}
//			}
//		}
		System.out.println(L);
		int k1 = (M - 1) * L / M + 1;
		int k2 = (N - 1) * L / N + 1;
//		if(k1 > L || k2 > L) {
//			System.out.println(2 * L);
//		}else {
//			System.out.println(L);
//		}

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