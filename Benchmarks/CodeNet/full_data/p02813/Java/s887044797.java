
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		int[] Q = new int[N];
		int cnt = 0;

		int Pno = 0;
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
			cnt = 0;
			for (int j = 0; j < i; j++) {
				if (P[j] < P[i]) {
					cnt++;
				}
			}
			Pno += Math.abs((P[i] - cnt - 1) * factorial(N - i - 1));
		}
		Pno+=1;

		int Qno = 0;
		for (int i = 0; i < N; i++) {
			Q[i] = sc.nextInt();
			cnt = 0;
			for (int j = 0; j < i; j++) {
				if (Q[j] < Q[i]) {
					cnt++;
				}
			}
			Qno += Math.abs((Q[i] - 1 - cnt) * factorial(N - i - 1));
		}
		Qno += 1;

		System.out.print(Math.abs(Pno - Qno));
	}

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
