import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] A = new int[2][N];
		int count = 0;
		for(int i = 0;i < 2;i++) {
			for(int j = 0;j < N;j++) {
				A[i][j] = scan.nextInt();
			}
		}
		if(N == 1) {
			count += A[0][0];
			count += A[1][0];
			System.out.println(count);
			System.exit(0);
		}
		for(int i = 0;i < 2;i++) {
			for(int j = 0;j < N;j++) {
				if(j < (N - 1)) {
					count += A[i][j];
				}
				if(j == (N - 2)) {
					i += 1;
					count += A[i][j];
					j += 1;
					count += A[i][j];
				}
			}
		}
		System.out.println(count);
	}
}