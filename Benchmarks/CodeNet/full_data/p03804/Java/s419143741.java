import java.util.Scanner;

public class Main {
	static int N, M;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		char[][] a = new char[N][N];
		char[][] b = new char[N][N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.next().toCharArray();
		}
		for (int i = 0; i < M; i++) {
			b[i] = sc.next().toCharArray();
		}

		System.out.print(check(a, b) ? "Yes" : "No");
	}

	static boolean check(char[][] a, char[][] b) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(i + M - 1 >= N || j + M - 1 >= N) continue;
				boolean match = true;
				for (int i2 = 0; i2 < M; i2++) {
					for (int j2 = 0; j2 < M; j2++) {
						if(a[i2 + i][j2 + j] != b[i2][j2]) match = false;
					}
				}
				if(match) return true;
			}
		}
		return false;
	}
}