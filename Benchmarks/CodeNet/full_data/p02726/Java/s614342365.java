import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0;
		int X = 0;
		int Y = 0;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		X = sc.nextInt()-1;
		Y = sc.nextInt()-1;
		int i, j;
		int A[] = new int[N - 1];
		for (i = 0; i < N - 1; i++) {
			for (j = i + 1; j < N; j++) {
				int a = j - i;
				int b = Math.abs(X - i) + 1 + Math.abs(Y - j);
				A[Math.min(a, b)-1]++;
			}
		}
		for (i = 0; i < N - 1; i++) {
			System.out.println(A[i]);
		}
		sc.close();

	}

}
