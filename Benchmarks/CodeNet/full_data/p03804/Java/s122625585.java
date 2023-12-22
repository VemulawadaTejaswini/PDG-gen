import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		char[][] a = new char[N][N];
		char[][] b = new char[M][M];
		for (int i = 0; i < N; i++) {
			a[i] = sc.next().toCharArray();
		}
		for (int i = 0; i < M; i++) {
			b[i] = sc.next().toCharArray();
		}

		boolean exist = false;
		for (int y = 0; y < N; y++) {
			for (int x = 0; x < N; x++) {
				if(y + M - 1 >= N || x + M - 1 >= N) continue;

				boolean match = true;
				for (int y2 = 0; y2 < M; y2++) {
					for (int x2 = 0; x2 < M; x2++) {
						if(a[y + y2][x + x2] != b[y2][x2]) match = false;
					}
				}
				if(match) exist = true;
			}
		}

		if(exist) System.out.println("Yes");
		else System.out.println("No");
	}
}