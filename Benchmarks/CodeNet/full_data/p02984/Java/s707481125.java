import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long[] A = new long[N];
		long[] answer = new long[N];
		long totalValue = 0;
		for(int i = 0; i < N; i++) {
			A[i] = (long) Integer.parseInt(sc.next());
			totalValue += A[i];
		}
		sc.close();
		int lastNoneValue = 0;
		for(int i = N - 2; i > 0; i -= 2) {
			lastNoneValue += 2 * A[i];
		}
		
		for(int i = 0; i < N; i++) {
			if(i == 0) {
				answer[i] = totalValue - lastNoneValue;
			}else {
				answer[i] = 2 * A[ i - 1] - answer[i -1];
			}
			if(i == N - 1) {
				System.out.print(answer[i]);
			}else {
				System.out.print(answer[i] + " ");
			}
		}
	}
}