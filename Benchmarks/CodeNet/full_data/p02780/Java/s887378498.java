import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double[] p = new double[N];
		for (int i = 0; i < N; i++) {
			double d = sc.nextDouble();
			p[i] = (d+1)/2;
		}
		double max = 0.0;
		for (int i = 0; i <= N-K; i++) {
			double amount = 0.0;
			for (int j = i; j < K+i; j++) {
				amount += p[j];
			}
			if (max < amount) {
				max = amount;
			}
		}
		System.out.println(max);
		
	}
}