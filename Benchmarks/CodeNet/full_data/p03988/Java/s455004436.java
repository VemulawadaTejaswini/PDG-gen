import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(solve() ? "Possible" : "Impossible");
	}

	static boolean solve() {
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] hist = new int[N];
		int max = 0;
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
			hist[A[i]]++;
			max = Math.max(max, A[i]);
		}
		if (hist[max] == 1) return false;
		if (max == 1) {
			return N <= 3;
		}
		if (max == 2) {
			return hist[1] <= 1 || hist[2] == 2;
		}
		for (int i = max; i > max / 2; --i) {
			if (hist[i] <= 1) return false;
		}
		if (max % 2 == 0) {
			if (hist[max / 2] == 0) return false;
		}
		for (int i = 1; i <= (max - 1) / 2; ++i) {
			if (hist[i] != 0) return false;
		}
		return true;
	}

}
