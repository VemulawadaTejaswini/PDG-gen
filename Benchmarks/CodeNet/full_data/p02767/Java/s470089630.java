import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		for (int i = 0; i < N; i++) 
			X[i] = sc.nextInt();

		int ans = Integer.MAX_VALUE;
		for (int i = 1; i <= 100; i++) {
			ans = Math.min(ans, caluc(X, i));
		}
		System.out.println(ans);
	}
	static int caluc(int[] X, int p) {
		int sum = 0;
		for (int i = 0; i < X.length; i++) {
			sum += Math.abs(p-X[i]) * Math.abs(p-X[i]);
		}
		return sum;
	}
}