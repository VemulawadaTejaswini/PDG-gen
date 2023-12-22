import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int abc[] = new int[3];
		int cnt = 0;

		abc[0] = a;
		abc[1] = b;
		abc[2] = c;
		Arrays.sort(abc);

		while (abc[1] != abc[2]) {
			twoPlus(abc, 0, 1);
			cnt++;
		}

		if ((abc[1] - abc[0]) % 2 == 1) {
			twoPlus(abc, 1, 2);
			cnt++;
		}

		while (abc[0] != abc[1]) {
			plusTwo(abc, 0);
			cnt++;
		}

		System.out.println(cnt);

	}

	private static void plusTwo(int[] abc, int i) {
		abc[i] += 2;
	}

	private static void twoPlus(int[] abc, int i, int j) {
		abc[i]++;
		abc[j]++;
	}

}