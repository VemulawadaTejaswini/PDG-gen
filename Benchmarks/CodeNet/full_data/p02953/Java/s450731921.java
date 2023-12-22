import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		boolean possible = true;

		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}

		for (int i = 0; i < N - 1; i++) {
			if (H[i + 1] < H[i]) {
				H[i]--;
				if (H[i + 1] < H[i]) possible = false;
			} else if (1 <= i && 1 <= H[i] - H[i - 1]) {
				H[i]--;
			}
			if (1 <= i && H[i] < H[i - 1]) possible = false;
		}

		if (possible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
