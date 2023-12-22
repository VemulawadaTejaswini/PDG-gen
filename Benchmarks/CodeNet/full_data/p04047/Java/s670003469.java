import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] L = new int[2 * N];
		for (int i = 0; i < 2 * N; ++i) {
			L[i] = sc.nextInt();
		}
		Arrays.sort(L);
		int ans = 0;
		for (int i = 0; i < N; ++i) {
			ans += L[2 * i];
		}
		System.out.println(ans);
	}

}
