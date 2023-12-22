import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		if (N * 2 > M) {
			System.out.printf("%d", M / 2);
		} else {
			int ans = N * 2;
			int mod = M - (N * 2);
			System.out.printf("%d", N + (mod / 4));
		}
	}
}
