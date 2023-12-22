import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveE();
	}

	private void solveE() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] sumArr = new long[N + 1];
		sumArr[0] = 0L;
		for (int i = 1; i <= N; i++) {
			sumArr[i] = sumArr[i - 1] + sc.nextLong() - K;
		}
		long ans = 0L;
		for (int start = 0; start < N; start++) {
			for (int end = start + 1; end <= N; end++) {
				if ((sumArr[end] - sumArr[start]) >= 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}