import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int ans = 0;
		int diff = Math.abs(A - B);
		int min = Math.min(A, B);
		int max = Math.max(A, B);
		if (diff % 2 != 0) {
			if (min - 1 < N - max) {
				ans = max - 1;
			} else {
				ans = 2*N - min;
			}
		} else {
			ans = diff / 2;
		}
		System.out.println(ans);
	}
}