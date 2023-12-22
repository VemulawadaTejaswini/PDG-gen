import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		int idx;
		double ans;
		double sum = 0.0;
		for (idx = 0; idx < N; idx++) {
			A[idx] = Integer.parseInt(sc.next());
			sum += 1.0d / A[idx];
		}
		ans = 1.0d / sum;

		System.out.println(ans);

	}

}
