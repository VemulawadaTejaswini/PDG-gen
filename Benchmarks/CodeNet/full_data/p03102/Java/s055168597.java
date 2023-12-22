import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int ans = 0;

		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.next());
		int M = Integer.parseInt(scan.next());
		int C = Integer.parseInt(scan.next());

		int B[] = new int[M];

		for (int i = 0; i < M; i++) {
			B[i] = Integer.parseInt(scan.next());
		}

		int A[][] = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(scan.next());
			}
		}

		int temp = 0;
		for (int i = 0; i < N; i++) {
			temp = 0;
			for (int j = 0; j < M; j++) {
				temp = temp + (A[i][j] * B[j]);
			}
			if((temp + C) > 0){
				ans++;
			}
		}



		System.out.println(ans);
	}
}