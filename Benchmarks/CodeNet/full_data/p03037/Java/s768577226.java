import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int L[] = new int[M];
		int R[] = new int[M];

		//値の読み込み
		for (int i = 0; i < M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}

		int ans = 0;

		for (int j = L[0]; j <= R[0]; j++) {
			boolean flag = true;
			for (int k = 0; k < M; k++) {
				if (j < L[k] || R[k] < j) {
					flag = false;
				}
			}

			if (flag) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}