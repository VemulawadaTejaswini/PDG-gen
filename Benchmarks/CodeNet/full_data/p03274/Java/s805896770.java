import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		for(int i = 0;i < N;++i)
			x[i] = sc.nextInt();
		sc.close();
		
		int ans = Integer.MAX_VALUE;
		for(int i = 0;i <= N-K;++i) {
			int cost = x[i+K-1] - x[i];
			cost += Math.abs(x[i+K-1]) < Math.abs(x[i]) ? Math.abs(x[i+K-1]) : Math.abs(x[i]);
			if(ans > cost)
				ans = cost;
		}
		System.out.println(ans);
	}
}
