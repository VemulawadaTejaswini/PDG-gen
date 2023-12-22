import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stones = new int[n];
		int minPos = -1;
		int min = Integer.MAX_VALUE;
		boolean allZero = true;
		for (int i = 0; i < n; i++) {
			stones[i] = sc.nextInt();
			if (stones[i] < 0) {
				System.out.println("NO");
				return;
			} else if (stones[i] > 0) {
				allZero = false;
			}
			if (stones[i] < min) {
				min = stones[i];
				minPos = i;
			}
		}
		if (allZero) {
			System.out.println("YES");
			return;
		}
		while (true) {
			int pos = minPos; // Start Point
			allZero = true;
			for (int i = 1; i <= n; i++) {
				int newPos = (pos + i - 1) % n;
				stones[newPos] -= i;
				if (stones[newPos] < 0) {
					System.out.println("NO");
					return;
				} else if (stones[newPos] == 0) {
					// Do nothing
				} else {
					allZero = false;
					if (stones[newPos] < min) {
						min = stones[newPos];
						minPos = newPos;
					}
				}
			}
			if (allZero) {
				System.out.println("YES");
				return;
			}
		}
	}
}