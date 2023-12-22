import java.util.HashMap;
import java.util.Scanner;

class Main{
	static int N;
	static int W;

	static int[] w;
	static int[] v;

	static HashMap<Integer,Integer>[] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		W = sc.nextInt();

		w = new int[N];
		v = new int[N];

		memo = new HashMap[N];

		for(int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();

			memo[i] = new HashMap<Integer,Integer>();
		}

		int value = dp(0, W);

		System.out.println(value);
		sc.close();
	}

	static int dp(int i, int x) {
		if(i >= N) {
			return 0;
		}
		if(!memo[i].containsKey(x)) {
			if(w[i] <= x) {
				memo[i].put(x, dp(i + 1, x - w[i]) + v[i]);
			}
			else {
				memo[i].put(x, -1);
			}
			if(memo[i].get(x) < dp(i + 1, x)) {
				memo[i].put(x, dp(i + 1, x));
			}
		}
		return memo[i].get(x);
	}
}