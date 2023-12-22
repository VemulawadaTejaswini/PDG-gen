import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int[] array = new int[N];
			int[] cntArray = new int[N];
			for (int i = 0; i < N; i++) {
				array[i] = scanner.nextInt();
			}

			int max = 0;
			for (int i = 0; i < N - 1; i++) {
				for (int j = i; j < N - 1; j++) {
					if (array[j] >= array[j + 1]) {
						cntArray[i]++;
					} else {
						break;
					}
				}
				if (max <= cntArray[i]) {
					max = cntArray[i];
				}
			}
			System.out.println(max);
		}
	}
}