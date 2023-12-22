import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] p = new int[N];
		for(int i=0; i<N; i++)
			p[i] = sc.nextInt();
		
		double max = 0;
		double sum = 0;
		for(int i=0; i<N; i++) {
			sum += (1.0 + p[i])/2;
			if(i>=K)
				sum -= (1.0 + p[i-K])/2;
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
		sc.close();
	}
}
