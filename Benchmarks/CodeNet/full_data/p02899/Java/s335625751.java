
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];

		int tmp = 0;
		for (int i = 1; i < N + 1; i++) {
			tmp = sc.nextInt();
			A[tmp] = i;
		}

		for (int i=1; i < N + 1; i++) {
			System.out.print(A[i] + " ");
		}
	}
}
