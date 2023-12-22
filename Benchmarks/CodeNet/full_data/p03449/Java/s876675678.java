import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int sum = 0;
	int max = 0;
	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[2][N];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(j<i) sum += A[0][j];
				else if(i == j) sum += A[0][j] + A[1][j];
				else sum += A[1][j];
			}
			if(sum > max) max = sum;
			sum = 0;
		}
		System.out.println(max);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}