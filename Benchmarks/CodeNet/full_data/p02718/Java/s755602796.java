import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int total = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			total += A[i];
		}
		sc.close();
		Arrays.sort(A);
		for(int i = N - 1; i > N - M - 1; i--) {
			if(total <= 4 * M * A[i] && i == N - M) {
				System.out.println("Yes");
				break;
			}
			if(total > 4 * M * A[i]){
				System.out.println("No");
				break;
			}
		}
	}
}
