import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		long s[] = new long[N + 1];
		s[0] = 0;
		for (int i = 1; i < N + 1; i++) {
			s[i] = s[i - 1] + A[i - 1];
		}
		int ans = 0;
		for (int i = 0; i < N + 1; i++) {
			for (int j = i; j < N + 1; j++) {
				if (i != j && s[i] == s[j]) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}