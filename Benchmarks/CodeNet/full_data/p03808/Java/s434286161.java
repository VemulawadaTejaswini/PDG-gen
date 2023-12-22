import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stones = new int[n];
		int minPos = -1;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			stones[i] = sc.nextInt();
			if (stones[i] < 0) {
				System.out.println("NO");
				return;
			}
			if (stones[i] < min) {
				min = stones[i];
				minPos = i;
			}
		}
		boolean canDo = true;
		boolean finished = false;
		while (!finished) {
			int pos = minPos; // Start Point
			boolean allZero = true;
			for (int i = 0; i < n; i++) {
				if (stones[i] != 0) {
					allZero = false;
					break;
				}
			}
			if (allZero) {
				finished = true;
				canDo = true;
				break;
			}
			for (int i = 1; i <= n; i++) {
				int newPos = (pos + i - 1) % n;
				stones[newPos] -= i;
				if (stones[newPos] < 0) {
					canDo = false;
					finished = true;
					break;
				} else {
					if (stones[newPos] < min) {
						min = stones[newPos];
						minPos = newPos;
					}
				}
			}
		}
		if (canDo) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}