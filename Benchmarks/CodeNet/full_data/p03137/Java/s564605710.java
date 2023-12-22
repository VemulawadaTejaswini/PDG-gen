import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		int[] X = new int[M];
		for(int i=0; i<M; i++) {
			X[i] = scan.nextInt();
		}

		scan.close();
		
		if(M <= N) {
			System.out.println(0);
			return;
		}
		
		Arrays.sort(X);
		
		int distance[] = new int[M-1];
		for(int i=0; i<M-1; i++) {
			distance[i] = X[i+1] - X[i];
		}
		
		Arrays.sort(distance);
		
		int sum = 0;
		for(int i=0; i<(M-N); i++) {
			sum+=distance[i];
		}
		System.out.println(sum);


	}

}