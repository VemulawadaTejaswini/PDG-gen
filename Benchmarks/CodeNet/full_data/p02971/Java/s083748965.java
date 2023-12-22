import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		int num, maxNum = -1, nextMaxNum = -1, duplicateCount = 0;
		boolean duplicate = false;
		for (int i = 0; i < N; i++) {
			num = sc.nextInt();

			if (num > maxNum) {
				maxNum = num;
			} else if (num == maxNum) {
				duplicate = true;
				duplicateCount++;
			} else {
				nextMaxNum = Math.max(nextMaxNum, num);
			}
			A[i] = num;
		}

		for (int i = 0; i < N; i++) {
			if (duplicateCount == N) {
				System.out.println(A[i]);
			}
			if (A[i] == maxNum && !duplicate) {
				System.out.println(nextMaxNum);
			} else {
				System.out.println(maxNum);
			}
		}
	}

}
