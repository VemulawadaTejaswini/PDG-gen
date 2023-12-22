import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] array = new int[N][2];
		int remain = M;
		long answer = 0;

		for (int i = 0; i < N; i++) {
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();
		}

		Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));

		for (int i = 0; i < N; i++) {
			if (remain < array[i][1]) {
				answer += array[i][0] * remain;
				break;
			} else {
				answer += array[i][0] * array[i][1];
				remain -= array[i][1];
			}
		}

		System.out.println(answer);
	}
}