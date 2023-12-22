import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int array[][] = new int[2][N];
		int max = 0;
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			int current = 0;
			for (int j = 0; j < i; j++) {
				current += array[0][j];
			}
			for (int j = i; j < N; j++) {
				current += array[j][j];
			}
			if (current > max) {
				max = current;
			}
		}
		System.out.println(max);
	}
}
