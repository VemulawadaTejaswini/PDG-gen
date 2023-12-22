import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double[] p = new double[N];
		for(int i = 0; i < N; i++)
			p[i] = (double)(sc.nextInt()+1)/2;
		double[] sum = new double[N];
		sum[0] = p[0];
		for(int i = 1; i < N; i++) {
			sum[i] = sum[i-1];
			sum[i] += p[i];
		}
		double ans = sum[K-1];
		for(int i = K; i < N; i++)
			ans = Math.max(ans, sum[i]-sum[i-K]);
		System.out.println(ans);

	}

}
