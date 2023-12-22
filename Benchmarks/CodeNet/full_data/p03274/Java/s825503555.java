import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		int x[] = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		
		int answer = Integer.MAX_VALUE;
		for(int i = 0; i < N - K; i++) {
			int temp = Integer.MAX_VALUE;
			if(x[i] < 0 && x[i + K - 1] > 0) {
				int temp1;
				int temp2;
				temp1 = Math.abs(x[i] * 2) + Math.abs(x[i + K - 1]);
				temp2 = Math.abs(x[i + K - 1] * 2) + Math.abs(x[i]);
				temp = Math.min(temp1, temp2);
			} else if(x[i] < 0){
				temp = Math.abs(x[i]);
			} else if(x[i + K - 1] > 0) {
				temp = Math.abs(x[i + K - 1]);
			}
			answer = Math.min(answer, temp);
		}
		System.out.println(answer);
	}
}
