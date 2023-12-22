import java.util.Scanner;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}

		boolean flag = false;
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			if (numList.indexOf(A[i]) == -1) {
				numList.add(A[i]);
			}
			else {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
}