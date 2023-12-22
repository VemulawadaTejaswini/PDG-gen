import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		int max = 0;
		int answer = 0;

		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}

		for (int i = 0; i < N - 1; i++) {
			answer = 0;
			for (int j = 0; j < N - i - 1; j++) {
				if (H[i + j] < H[i + j + 1]) {
					break;
				} else {
					answer++;
				}
			}
			if (max < answer) max = answer;
			if (N - i <= max) break;
		}

		System.out.println(max);
	}
}
