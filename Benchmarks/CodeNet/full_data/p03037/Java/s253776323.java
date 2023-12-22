import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L[] = new int[M];
		int R[] = new int[M];

		for (int i = 0; i < M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}

		Arrays.sort(L);
		Arrays.sort(R);

		int r = Math.abs(L[M-1] - R[0]);
		System.out.println(r+1);
	}
}
