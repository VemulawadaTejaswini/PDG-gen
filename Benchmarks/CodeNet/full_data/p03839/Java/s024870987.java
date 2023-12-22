import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N];
		
		long best = 0;
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			best += Math.max(0, a[i]);
		}
		
		long addSum = 0;
		long subSum = 0;
		for(int i=0; i<K; i++) {
			addSum += Math.max(0, a[i]);
			subSum += Math.min(0, a[i]);
		}
		long minLoss = Math.min(addSum, -subSum);
	
		for(int i=K; i<N; i++) {
			addSum += Math.max(0, a[i]) - Math.max(0, a[i-K]);
			subSum += Math.min(0, a[i]) - Math.min(0, a[i-K]);
			minLoss = Math.min(minLoss, addSum);
			minLoss = Math.min(minLoss, -subSum);
		}
		
		System.out.println(best - minLoss);
		sc.close();
	}
}
