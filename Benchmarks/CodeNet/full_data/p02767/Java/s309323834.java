import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[]X = new int[N];
		
		for (int i=0; i<N; i++){
			X[i] = sc.nextInt();
		}
		Arrays.sort(X);
		int min = X[0];
		int max = X[N-1];
		
		int minTotal = Integer.MAX_VALUE;
		for (int i=min; i<=max; i++){
			int total = 0;
			for (int j=0; j<N; j++){
				total += Math.pow(i - X[j], 2);
			}
			minTotal = Math.min(minTotal, total);
		}
		System.out.println(minTotal);
	}
}