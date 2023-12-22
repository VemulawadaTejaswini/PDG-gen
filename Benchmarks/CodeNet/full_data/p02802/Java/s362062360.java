import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int N = sc.nextInt();
		int K = sc.nextInt();
		int M = sc.nextInt();
		for (int i = 0; i < N-1; i++) {
			sum += sc.nextInt();
		}
		sc.close();
		int target = N * M - sum;
		int ans = 0;
		while(ans < target) {
			ans++;
		}
		if (ans > K) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}