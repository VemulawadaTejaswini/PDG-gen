import java.util.*;

class Main {
	Scanner sc;
	int N;
	int[] P, Q;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		P = new int[N];
		Q = new int[N];
		for (int i = 0; i < N; i++) P[i] = sc.nextInt() - 1;
		for (int i = 0; i < N; i++) Q[i] = sc.nextInt() - 1;
		
		System.out.println(Math.abs(orderOf(P)-orderOf(Q)));
	}
	
	private int orderOf(int[] T) {
		List<Integer> order = new ArrayList<>();
		for (int i = 0; i < N; i++) order.add(i);
		
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int o = order.indexOf(T[i]);
			ans = ans + o * factorial(N-1-i);
			order.remove(o);
		}
		return ans;
	}
	
	private static int factorial(int n) {
		if (n == 0) return 1;
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}