import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		int[] a = new int[N];
		
		for (int i = 0; i < N; i++) {
			a[i] = s.nextInt();
		}

		int result = 0;
		if (a[0] != 1) {
			a[0] = 1;
			result++;
		}

		int countMax;

		while (true) {
			countMax = 0;
			int maxT = 0;
			int currentT;
			for (int i = 0; i < N; i++) {
				int count = 0;
				currentT = i+1;
				do {
					currentT = a[currentT - 1];
					count++;
				} while (currentT != 1);
				if (count > countMax) {
					countMax = count;
					maxT = i+1;
				}
			}

			if (countMax <= K) {
				break;
			}

			currentT = maxT;
			for (int i = 0; i < countMax-K-1; i++) {
				currentT = a[currentT - 1];
			}
			a[currentT - 1] = 1;
			result++;
		}
		System.out.println(result);

	}
}