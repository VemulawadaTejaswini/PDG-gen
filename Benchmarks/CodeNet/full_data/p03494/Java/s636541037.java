import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		boolean flag = true;
		int ans = 0;
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int j = 0; j < N; j++, ans++) {
			if (A[j] % 2 != 0) {
				if (j == 0) {
					flag = false;
					break;
				}
				break;
			}
			if (flag == true) {
				for (int k = 0; k < N; k++) {
					A[k] = A[k] / 2;
				}
			}
		}

		if (flag == true) {
			System.out.println(ans);
		} else {
			System.out.println(0);
		}
	}
}
