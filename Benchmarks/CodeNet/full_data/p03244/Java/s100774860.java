import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] oddCnt = new int[100001];
		int[] evenCnt = new int[100001];

		for (int i = 0; i < 100001; i++) {
			oddCnt[i] = 0;
			evenCnt[i] = 0;
		}

		for (int i = 0; i < n; i++) {
			int v = sc.nextInt();
			if (i % 2 == 0) {
				evenCnt[v]++;
			} else {
				oddCnt[v]++;
			}
		}

		int oddMax = 0;
		int oddMaxId = 0;
		int odd2ndMax = 0;
		int evenMax = 0;
		int evenMaxId = 0;
		int even2ndMax = 0;

		for (int i = 0; i < 100001; i++) {
			if (evenMax <= evenCnt[i]) {
				even2ndMax = evenMax;
				evenMax = evenCnt[i];
				evenMaxId = i;
			}
			if (oddMax <= oddCnt[i]) {
				odd2ndMax = oddMax;
				oddMax = oddCnt[i];
				oddMaxId = i;
			}
		}

		if (evenMaxId != oddMaxId) {
			System.out.println(n - evenMax - oddMax);
		} else if (even2ndMax > odd2ndMax) {
			System.out.println(n - even2ndMax - oddMax);
		} else {
			System.out.println(n - evenMax - odd2ndMax);
		}
		sc.close();
	}
}