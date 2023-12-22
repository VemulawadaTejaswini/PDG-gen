import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int temp = 0;
		int count = 0;
		int ans = 0;
		int memo[] = new int[N + 1];
		int n = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				if (memo[j] != 0) {
					count = memo[j];
					break;
				} else {
					temp += A[j];
					if (temp == 0) {
						count++;
						n = j - i - 1;
					}
				}
			}
			ans += count;
			memo[i + n] = count - 1;
			count = 0;
			n = 0;
			temp = 0;
		}
		System.out.println(ans);
	}
}