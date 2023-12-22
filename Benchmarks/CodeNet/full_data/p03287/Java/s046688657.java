import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] A = new long[N];
		Arrays.setAll(A, i -> sc.nextInt());
		Map<Long, Integer> x = new HashMap<>();
		long[] S = new long[N];
		S[0] = A[0] % M;
		x.put(0L, 1);
		x.put(S[0], x.getOrDefault(S[0], 0) + 1);
		for(int i = 1; i < N; i++) {
			S[i] = (S[i-1] + A[i]) % M;
			x.put(S[i], x.getOrDefault(S[i], 0) + 1);
		}
		long ans = 0;
		for(long i : x.keySet())
			ans += x.get(i) * (x.get(i) - 1) / 2;
		System.out.println(ans);
	}

}