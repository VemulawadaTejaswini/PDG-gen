import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//D問題　間違った解答
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
		
		for(int i = 1; i < N - 1; i += 2) {
			totalValue -= 2 * A[i];
		}
		
		answer[0] = totalValue;

		for(int i = 0; i < N; i++) {
			answer[i] = 2 * A[ i - 1] - answer[i -1];
			System.out.print(" " + answer[i]);
		}
	}
}